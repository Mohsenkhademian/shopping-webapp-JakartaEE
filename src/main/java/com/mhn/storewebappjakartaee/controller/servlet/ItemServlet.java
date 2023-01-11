package com.mhn.storewebappjakartaee.controller.servlet;

import com.mhn.storewebappjakartaee.model.entity.Item;
import com.mhn.storewebappjakartaee.model.service.ItemService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/item")
public class ItemServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long orderId = Long.parseLong(request.getParameter("orderId"));
        long storageId = Long.parseLong(request.getParameter("storageId"));
        long offerId = Long.parseLong(request.getParameter("offerId"));
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));

        Item item = Item.builder()
                .orderId(orderId)
                .storageId(storageId)
                .offerId(offerId)
                .name(name)
                .description(description)
                .price(price)
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
