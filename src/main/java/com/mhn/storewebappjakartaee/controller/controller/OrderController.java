package com.mhn.storewebappjakartaee.controller.controller;


import com.mhn.storewebappjakartaee.model.entity.Order;
import com.mhn.storewebappjakartaee.model.service.OrderService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import oracle.jdbc.proxy.annotation.Post;

import java.util.List;

@Path(("/orders"))
public class OrderController {

    private OrderService orderService = OrderService.getOrderService();

    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createOrder(Order order) {
        try {
            Order createdOrder = orderService.save(order);
            return Response.status(Response.Status.CREATED).entity(createdOrder).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllOrders() {
        try {
            List<Order> orders = orderService.findAll();
            return Response.ok(orders).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOrderById(@PathParam("id") Long id) {
        try {
            Order order = orderService.findById(id);
            if (order == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(order).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateOrder(Order order) {
        try {
            Order updateOrder = orderService.update(order);
            if (updateOrder == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(updateOrder).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteOrder(@PathParam("id") Long id) {
        try {
            Order deleteOrder = orderService.delete(id);
            if (deleteOrder == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok().build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }
}