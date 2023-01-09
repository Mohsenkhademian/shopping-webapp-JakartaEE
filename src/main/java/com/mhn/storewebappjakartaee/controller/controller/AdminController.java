package com.mhn.storewebappjakartaee.controller.controller;

import com.mhn.storewebappjakartaee.model.entity.Admin;
import com.mhn.storewebappjakartaee.model.service.AdminService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/admins")
public class AdminController {

    @Inject
    private AdminService adminService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createAdmin(Admin admin) {
        try {
            admin = adminService.save(admin);
            return Response.status(Response.Status.CREATED).entity(admin).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllAdmins() {
        try {
            List<Admin> admins = adminService.findAll();
            return Response.ok(admins).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAdminById(@PathParam("id") long id) {
        try {
            Admin admin = adminService.findById(id);
            if (admin == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(admin).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAdmin(@PathParam("id") long id, Admin admin) {
        try {
            admin = adminService.update(admin);
            return Response.ok(admin).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteAdmin(@PathParam("id") long id) {
        try {
            adminService.delete(id);
            return Response.noContent().build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }
}
