package com.mhn.storewebappjakartaee.controller.servlet;

import com.mhn.storewebappjakartaee.model.entity.User;
import com.mhn.storewebappjakartaee.model.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/index")
public class UserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = User.builder().userName(username).password(password).build();
        try {
            UserService.getUserService().save(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        resp.sendRedirect("index.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("id");
        User user = null;
        try {
            user = UserService.getUserService().findById(Long.parseLong(userId));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("user", user);
        req.getRequestDispatcher("user.jsp").forward(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("id");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = null;
        try {
            user = UserService.getUserService().findById(Long.parseLong(userId));
            user.setUserName(username);
            user.setPassword(password);
            UserService.getUserService().update(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        resp.setStatus(200);
    }

}
