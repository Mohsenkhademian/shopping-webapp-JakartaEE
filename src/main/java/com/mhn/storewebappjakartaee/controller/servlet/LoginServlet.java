package com.mhn.storewebappjakartaee.controller.servlet;

import com.mhn.storewebappjakartaee.model.entity.User;
import com.mhn.storewebappjakartaee.model.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        try {
            User user = UserService.getUserService().findByUsernameAndPassword(username, password);
            if (user != null) {
                HttpSession session = req.getSession();
                session.setAttribute("username", user);
                session.setAttribute("password", password);
                session.setAttribute("validate", true);
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            } else {
                HttpSession session = req.getSession();
                session.setAttribute("validate", false);
                resp.sendRedirect("login.jsp");
            }
        } catch (Exception e) {
            resp.sendRedirect("login.jsp?error=Invalid username or password");
        }
    }
}
