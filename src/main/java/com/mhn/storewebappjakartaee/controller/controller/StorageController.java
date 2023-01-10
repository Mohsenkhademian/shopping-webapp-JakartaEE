package com.mhn.storewebappjakartaee.controller.controller;

import com.mhn.storewebappjakartaee.model.entity.PaymentTransaction;
import com.mhn.storewebappjakartaee.model.entity.Storage;
import com.mhn.storewebappjakartaee.model.service.StorageService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import oracle.jdbc.proxy.annotation.Post;

import java.awt.geom.RectangularShape;
import java.util.List;

@Path("/storages")
public class StorageController {

    private StorageService storageService = StorageService.getStorageService();

    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createStorage(Storage storage) {
        try {
            Storage createdStorage = storageService.save(storage);
            return Response.status(Response.Status.CREATED).entity(createdStorage).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllStorage(){
        try {
            List<Storage> storages = storageService.findAll();
            return Response.ok(storages).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStorageFindById(@PathParam("id") Long id){
        try {
            Storage storage = storageService.findById(id);
            if (storage == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(storage).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateStorage(Storage storage){
        try {
            Storage updateStorage = storageService.update(storage);
            if (updateStorage == null){
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(updateStorage).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteStorage(@PathParam("id") Long id){
        try {
            Storage deleteStorage = storageService.delete(id);
            if (deleteStorage == null){
                return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
            }
            return Response.ok().build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

}
