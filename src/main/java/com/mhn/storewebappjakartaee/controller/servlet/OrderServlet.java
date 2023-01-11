package com.mhn.storewebappjakartaee.controller.servlet;

import com.mhn.storewebappjakartaee.model.entity.Item;
import com.mhn.storewebappjakartaee.model.entity.Offer;
import com.mhn.storewebappjakartaee.model.entity.Order;
import com.mhn.storewebappjakartaee.model.service.ItemService;
import com.mhn.storewebappjakartaee.model.service.OfferService;
import com.mhn.storewebappjakartaee.model.service.OrderService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Order order = null;
        try {
            long customerId = Long.parseLong(request.getParameter("customerId"));
            String customerName = request.getParameter("customerName");
            String customerAddress = request.getParameter("customerAddress");
            LocalDate orderDate = LocalDate.parse(request.getParameter("orderDate"));
            String[] itemIds = request.getParameter("itemIds").split(",");
            List<Item> items = new ArrayList<>();
            for (String id : itemIds) {
                Item item = null;
                try {
                    item = ItemService.getItemService().findById(Long.parseLong(id));
                } catch (Exception e) {
                    request.setAttribute("message", "Error saving item: " + e.getMessage());
                }
                items.add(item);
            }
            order = Order.builder()
                    .customerId(customerId)
                    .customerName(customerName)
                    .customerAddress(customerAddress)
                    .orderDate(orderDate)
                    .items(items)
                    .build();
            OrderService.getOrderService().save(order);
            response.sendRedirect("orders");
        } catch (Exception e) {
            request.setAttribute("message", "Error saving order: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }

        request.setAttribute("order", order);
        request.getRequestDispatcher("order.jsp").forward(request, response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Order> orders = null;
        try {
            orders = OrderService.getOrderService().findAll();
        } catch (Exception e) {
            request.setAttribute("message", "Error retrieving items: " + e.getMessage());
        }
        request.setAttribute("orders", orders);
        request.getRequestDispatcher("order.jsp").forward(request, response);
    }
}
