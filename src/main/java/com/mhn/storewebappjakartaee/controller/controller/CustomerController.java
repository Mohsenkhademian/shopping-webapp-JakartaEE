package com.mhn.storewebappjakartaee.controller.controller;

import com.mhn.storewebappjakartaee.model.entity.Customer;
import com.mhn.storewebappjakartaee.model.service.CustomerService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("customers")
public class CustomerController {

    private final CustomerService customerService = CustomerService.getCustomerService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomers() {
        try {
            List<Customer> customers = customerService.findAll();
            return Response.ok(customers).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomer(@PathParam("id") long id) {
        try {
            Customer customer = customerService.findById(id);
            if (customer == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(customer).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createCustomer(Customer customer) {
        try {
            Customer savedCustomer = customerService.save(customer);
            return Response.ok(savedCustomer).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateCustomer(@PathParam("id") long id, Customer customer) {
        try {
            Customer updatedCustomer = customerService.update(customer);
            if (updatedCustomer == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(updatedCustomer).build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

    @DELETE
    @Path("{id}")
    public Response deleteCustomer(@PathParam("id") long id) {
        try {
            Customer deletedCustomer = customerService.delete(id);
            if (deletedCustomer == null) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok().build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }
}
