package com.mhn.storewebappjakartaee.controller.controller;

import com.mhn.storewebappjakartaee.model.entity.Delivery;
import com.mhn.storewebappjakartaee.model.service.DeliveryService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/deliveries")
public class DeliveryController {

    private DeliveryService deliveryService = DeliveryService.getDeliveryService();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createDelivery(Delivery delivery) {
        try {
            Delivery createdDelivery = deliveryService.save(delivery);
            return Response.status(Response.Status.CREATED).entity(createdDelivery).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllDeliveries() {
        try {
            List<Delivery> deliveries = deliveryService.findAll();
            return Response.ok(deliveries).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDeliveryById(@PathParam("id") Long id) {
        try {
            Delivery delivery = deliveryService.findById(id);
            if (delivery == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(delivery).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateDelivery(Delivery delivery) {
        try {
            Delivery updatedDelivery = deliveryService.update(delivery);
            if (updatedDelivery == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(updatedDelivery).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteDelivery(@PathParam("id") Long id) {
        try {
            Delivery deletedDelivery = deliveryService.delete(id);
            if (deletedDelivery == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok().build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }
}
