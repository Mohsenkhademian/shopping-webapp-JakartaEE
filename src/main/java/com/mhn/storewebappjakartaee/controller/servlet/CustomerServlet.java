package com.mhn.storewebappjakartaee.controller.servlet;

import com.mhn.storewebappjakartaee.model.entity.Customer;
import com.mhn.storewebappjakartaee.model.service.CustomerService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {

    private final CustomerService customerService = CustomerService.getCustomerService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String name = req.getParameter("name");
      String email = req.getParameter("email");
      Customer customer = Customer.builder().name(name).email(email).build();
        try {
            CustomerService.getCustomerService().save(customer);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        resp.sendRedirect("index.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerId = req.getParameter("id");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        Customer customer = null;
    }
}
