package com.mhn.storewebappjakartaee.controller.servlet;

import com.mhn.storewebappjakartaee.model.entity.Customer;
import com.mhn.storewebappjakartaee.model.entity.User;
import com.mhn.storewebappjakartaee.model.service.CustomerService;
import com.mhn.storewebappjakartaee.model.service.UserService;
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
        req.setAttribute("message", "Customer saved successfully!");
        req.getRequestDispatcher("user.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customers = null;
        try {
            customers = CustomerService.getCustomerService().findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("customers", customers);
        req.getRequestDispatcher("user.jsp").forward(req, resp);
    }
}
