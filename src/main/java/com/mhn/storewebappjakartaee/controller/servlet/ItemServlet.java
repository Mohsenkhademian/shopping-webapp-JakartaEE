package com.mhn.storewebappjakartaee.controller.servlet;

import com.mhn.storewebappjakartaee.model.entity.Item;
import com.mhn.storewebappjakartaee.model.service.ItemService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.util.List;

@WebServlet("/item")
public class ItemServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the values of the form fields
        long orderId = request.getParameter("orderId") != null ? Long.parseLong(request.getParameter("orderId")) : 0;
        long storageId = request.getParameter("storageId") != null ? Long.parseLong(request.getParameter("storageId")) : 0;
        long offerId = request.getParameter("offerId") != null ? Long.parseLong(request.getParameter("offerId")) : 0;

        String name = request.getParameter("name");
        String description = request.getParameter("description");
        int price = 0;
        String priceString = request.getParameter("price");
        if (priceString != null) {
            price = Integer.valueOf(priceString);
        }


        // Handle the uploaded image file
        Part filePart = request.getPart("photo");
        byte[] itemPhoto = new byte[0];
        if (filePart != null && filePart.getSize() > 0) {
            itemPhoto = new byte[(int) filePart.getSize()];
            filePart.getInputStream().read(itemPhoto);
        }


        // Create a new Item object
        Item item = Item.builder()
                .orderId(orderId)
                .storageId(storageId)
                .offerId(offerId)
                .name(name)
                .description(description)
                .price(price)
                .itemPhoto(itemPhoto)
                .build();
        try {
            Item savedItem = ItemService.getItemService().save(item);
            request.setAttribute("message", "Item saved successfully with id: " + savedItem.getId());
        } catch (Exception e) {
            request.setAttribute("message", "Error saving item: " + e.getMessage());
        }
        request.setAttribute("item", item);
        request.getRequestDispatcher("item.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<Item> items = ItemService.getItemService().findAll();
            request.setAttribute("items", items);
            request.getRequestDispatcher("item.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("message", "Error retrieving items: " + e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
}
