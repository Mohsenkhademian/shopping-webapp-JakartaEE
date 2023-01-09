package com.mhn.storewebappjakartaee.controller.controller;

import com.mhn.storewebappjakartaee.model.entity.Comment;
import com.mhn.storewebappjakartaee.model.service.CommentService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("comments")
public class CommentController {

    private final CommentService commentService = CommentService.getCommentService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getComments() {
        try {
            List<Comment> comments = commentService.findAll();
            return Response.ok(comments).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getComment(@PathParam("id") long id) {
        try {
            Comment comment = commentService.findById(id);
            if (comment == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(comment).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createComment(Comment comment) {
        try {
            Comment savedComment = commentService.save(comment);
            return Response.ok(savedComment).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateComment(@PathParam("id") long id, Comment comment) {
        try {
            Comment updatedComment = commentService.update(comment);
            if (updatedComment == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(updatedComment).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

    @DELETE
    @Path("{id}")
    public Response deleteComment(@PathParam("id") long id) {
        try {
            Comment deletedComment = commentService.delete(id);
            if (deletedComment == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok().build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }
}
