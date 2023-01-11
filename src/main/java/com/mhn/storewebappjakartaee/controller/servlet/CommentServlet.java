package com.mhn.storewebappjakartaee.controller.servlet;


import com.mhn.storewebappjakartaee.model.entity.Admin;
import com.mhn.storewebappjakartaee.model.entity.Comment;
import com.mhn.storewebappjakartaee.model.service.AdminService;
import com.mhn.storewebappjakartaee.model.service.CommentService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/comment")
public class CommentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long userId = Long.parseLong(req.getParameter("userId"));
        String text = req.getParameter("text");
        Comment comment = Comment.builder().userId(userId).text(text).build();
        try {
            CommentService.getCommentService().save(comment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("message", "Comment saved successfully!");
        req.getRequestDispatcher("user.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Comment> comments = null;
        try {
            comments = CommentService.getCommentService().findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        req.setAttribute("comments", comments);
        req.getRequestDispatcher("user.jsp").forward(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String commentId = req.getParameter("id");
        String userId = req.getParameter("userId");
        String text = req.getParameter("text");
        Comment comment = null;
        try {
            comment = CommentService.getCommentService().findById((Long.parseLong(commentId)));
            comment.setUserId(Long.parseLong(userId));
            comment.setText(text);
            CommentService.getCommentService().update(comment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        resp.setStatus(200);
    }
}
