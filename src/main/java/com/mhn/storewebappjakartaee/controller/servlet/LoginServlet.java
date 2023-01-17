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
        User user = User.builder().userName(username).password(password).build();
        if (req.getParameter("save") != null) {
            boolean save = (req.getParameter("save").equals("on") ? true : false);
            if (save) {
                System.out.println("True");
                Cookie cookie1 = new Cookie("username", username);
                Cookie cookie2 = new Cookie("password", password);
                resp.addCookie(cookie1);
                resp.addCookie(cookie2);

                req.getSession().setAttribute("username", username);
                req.getSession().setAttribute("password", password);
            }
        }


        HttpSession session = req.getSession();
        if (username.equals("Mohsen") && password.equals("1234")) {
            session.setAttribute("username", user);
            session.setAttribute("validate", true);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } else {
            session.setAttribute("validate", false);
            PrintWriter out = resp.getWriter();
            out.println("<h1>Access Denied</h1>");
            out.println("<br><br>");
            out.println("<a href=\"login.jsp\">return to login page</a>");
        }


    }
}
