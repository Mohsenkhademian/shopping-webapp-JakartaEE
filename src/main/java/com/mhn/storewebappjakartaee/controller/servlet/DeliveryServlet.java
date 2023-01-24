package com.mhn.storewebappjakartaee.controller.servlet;

import com.mhn.storewebappjakartaee.model.entity.Delivery;
import com.mhn.storewebappjakartaee.model.entity.Item;
import com.mhn.storewebappjakartaee.model.service.DeliveryService;
import com.mhn.storewebappjakartaee.model.service.ItemService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/delivery")
public class DeliveryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String recipientName = request.getParameter("recipientName");
        String recipientAddress = request.getParameter("recipientAddress");
        Boolean deliveryStatus = Boolean.parseBoolean(request.getParameter("deliveryStatus"));
        LocalDate deliveryDate = LocalDate.parse(request.getParameter("deliveryDate"));

        Delivery delivery = Delivery.builder()
                .recipientName(recipientName)
                .recipientAddress(recipientAddress)
                .deliveryStatus(deliveryStatus)
                .deliveryDate(deliveryDate)
                .build();
        try {
            Delivery savedDelivery = DeliveryService.getDeliveryService().save(delivery);
            request.setAttribute("message", "Delivery saved successfully with id: " + savedDelivery.getId());
        } catch (Exception e) {
            request.setAttribute("message", "Error saving delivery: " + e.getMessage());
        }
        request.getRequestDispatcher("delivery.jsp").forward(request, response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Delivery> deliveries = null;
        try {
            deliveries = DeliveryService.getDeliveryService().findAll();
            request.setAttribute("deliveries", deliveries);
            request.getRequestDispatcher("/deliveries.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("message", "Error retrieving deliveries: " + e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
        request.setAttribute("deliveries", deliveries);
        request.getRequestDispatcher("delivery.jsp").forward(request, response);
    }
}
