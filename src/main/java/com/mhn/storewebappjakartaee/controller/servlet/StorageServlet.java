package com.mhn.storewebappjakartaee.controller.servlet;

import com.mhn.storewebappjakartaee.model.entity.Item;
import com.mhn.storewebappjakartaee.model.entity.Order;
import com.mhn.storewebappjakartaee.model.entity.Storage;
import com.mhn.storewebappjakartaee.model.service.ItemService;
import com.mhn.storewebappjakartaee.model.service.OrderService;
import com.mhn.storewebappjakartaee.model.service.StorageService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/storage")
public class StorageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        int capacity = Integer.parseInt(req.getParameter("capacity"));
        int availableCapacity = Integer.parseInt(req.getParameter("availableCapacity"));

        Storage storage = Storage.builder()
                .name(name)
                .address(address)
                .capacity(capacity)
                .availableCapacity(availableCapacity)
                .build();
        try {
            StorageService.getStorageService().save(storage);
        } catch (Exception e) {
            req.setAttribute("message", "Error saving order: " + e.getMessage());
            req.getRequestDispatcher("/error.jsp").forward(req, resp);
        }
        req.setAttribute("storage", storage);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Storage> storages = null;
        try {
            storages = StorageService.getStorageService().findAll();
        } catch (Exception e) {
            req.setAttribute("message", "Error retrieving items: " + e.getMessage());
            req.getRequestDispatcher("error.jsp").forward(req, resp);
        }
        req.setAttribute("storages", storages);
        req.getRequestDispatcher("storage.jsp").forward(req, resp);
    }
}
