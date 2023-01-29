package com.mhn.storewebappjakartaee.controller.servlet;

import com.mhn.storewebappjakartaee.model.entity.Offer;
import com.mhn.storewebappjakartaee.model.service.OfferService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/offer")
public class OfferServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int price = Integer.parseInt(request.getParameter("price"));
        Offer offer = Offer.builder().price(price).build();
        try {
            OfferService.getOfferService().save(offer);
        } catch (Exception e) {
            request.setAttribute("message", "Error saving item: " + e.getMessage());
        }
        request.setAttribute("offer", offer);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Offer> offers = null;
        try {
            offers = OfferService.getOfferService().findAll();
        } catch (Exception e) {
            request.setAttribute("message", "Error retrieving items: " + e.getMessage());
        }
        request.setAttribute("offers", offers);
        request.getRequestDispatcher("offer.jsp").forward(request, response);
    }
}
