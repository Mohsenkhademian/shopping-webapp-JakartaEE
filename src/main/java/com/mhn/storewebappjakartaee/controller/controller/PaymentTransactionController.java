package com.mhn.storewebappjakartaee.controller.controller;

import com.mhn.storewebappjakartaee.model.entity.PaymentTransaction;
import com.mhn.storewebappjakartaee.model.service.PaymentTransactionService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import oracle.jdbc.proxy.annotation.Post;

import java.util.List;

@Path(("/paymentTransactions"))
public class PaymentTransactionController {

    private PaymentTransactionService paymentTransactionService = PaymentTransactionService.getPaymentTransactionService();

    @Post
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createPaymentTransaction(PaymentTransaction paymentTransaction){
        try {
            PaymentTransaction createdPaymentTransaction = paymentTransactionService.save(paymentTransaction);
            return Response.status(Response.Status.CREATED).entity(createdPaymentTransaction).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPaymentTransactions(){
        try {
            List<PaymentTransaction> paymentTransactions = paymentTransactionService.findAll();
            return Response.ok(paymentTransactions).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPaymentTransactionFindById(@PathParam("id") Long id){
        try {
            PaymentTransaction paymentTransaction = paymentTransactionService.findById(id);
            if (paymentTransaction == null){
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(paymentTransaction).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updatePaymentTransaction(PaymentTransaction paymentTransaction){
        try {
            PaymentTransaction updatePaymentTransaction = paymentTransactionService.update(paymentTransaction);
            if (updatePaymentTransaction == null){
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok(updatePaymentTransaction).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deletePaymentTransaction(@PathParam("id") Long id){
        try {
            PaymentTransaction deletePaymentTransaction = paymentTransactionService.delete(id);
            if (deletePaymentTransaction == null){
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            return Response.ok().build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }

}
