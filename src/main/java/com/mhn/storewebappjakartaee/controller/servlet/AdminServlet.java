package com.mhn.storewebappjakartaee.controller.servlet;

import com.mhn.storewebappjakartaee.model.entity.Admin;
import com.mhn.storewebappjakartaee.model.entity.User;
import com.mhn.storewebappjakartaee.model.service.AdminService;
import com.mhn.storewebappjakartaee.model.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Admin admin = Admin.builder().userName(username).password(password).build();
        try {
            AdminService.getAdminService().save(admin);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        resp.sendRedirect("index.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String adminId = req.getParameter("id");
        Admin admin = null;
        try {
            admin = AdminService.getAdminService().findById(Long.parseLong(adminId));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("admin", admin);
        req.getRequestDispatcher("admin.jsp").forward(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String adminId = req.getParameter("id");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
       Admin admin = null;
        try {
            admin = AdminService.getAdminService().findById(Long.parseLong(adminId));
            admin.setUserName(username);
            admin.setPassword(password);
            AdminService.getAdminService().update(admin);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        resp.setStatus(200);
    }
}
