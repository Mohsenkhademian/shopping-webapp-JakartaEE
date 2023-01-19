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
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        try {
            User user = UserService.getUserService().findByEmailAndPassword(email, password);
            if (user != null) {
                HttpSession session = req.getSession();
                session.setAttribute("email", email);
                session.setAttribute("password", password);
                session.setAttribute("validate", true);
                req.getRequestDispatcher("index.jsp").forward(req, resp);
            } else {
                HttpSession session = req.getSession();
                session.setAttribute("validate", false);
                resp.sendRedirect("login.jsp");
            }
        } catch (Exception e) {
            HttpSession session = req.getSession();
            session.setAttribute("error", "Invalid email or password , please refresh this page");
            resp.sendRedirect("login.jsp");
//            resp.sendRedirect("login.jsp?error=Invalid email or password");

        }
    }
}
