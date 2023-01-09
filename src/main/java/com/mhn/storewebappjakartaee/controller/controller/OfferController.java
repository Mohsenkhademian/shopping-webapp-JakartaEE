package com.mhn.storewebappjakartaee.controller.controller;

import com.mhn.storewebappjakartaee.model.entity.Offer;
import com.mhn.storewebappjakartaee.model.service.OfferService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import oracle.jdbc.proxy.annotation.Post;

import java.util.List;

@Path("/offers")
public class OfferController {

    private OfferService offerService = OfferService.getOfferService();

    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createOffer(Offer offer){
        try {
            Offer createdOffer = offerService.save(offer);
            return Response.status(Response.Status.CREATED).entity(createdOffer).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllOffers(){
        try {
            List<Offer> offers = offerService.findAll();
            return Response.ok(offers).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOfferById(@PathParam("id") Long id){
        try {
            Offer offer = offerService.findById(id);
            if (offer == null){
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(offer).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateOffer(Offer offer){
        try {
            Offer updateOffer = offerService.update(offer);
            if (updateOffer == null){
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(updateOffer).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteOffer(@PathParam("id") Long id){
        try {
            Offer deleteOffer = offerService.delete(id);
            if (deleteOffer == null){
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok().build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }


}
