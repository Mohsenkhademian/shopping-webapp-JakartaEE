package com.mhn.storewebappjakartaee.controller.servlet;

import com.mhn.storewebappjakartaee.model.entity.Customer;
import com.mhn.storewebappjakartaee.model.entity.Order;
import com.mhn.storewebappjakartaee.model.entity.PaymentTransaction;
import com.mhn.storewebappjakartaee.model.service.CustomerService;
import com.mhn.storewebappjakartaee.model.service.OrderService;
import com.mhn.storewebappjakartaee.model.service.PaymentTransactionService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet("/paymenttransaction")
public class PaymentTransactionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        double amount = Double.parseDouble(req.getParameter("amount"));
        LocalDate transactionTime = LocalDate.parse(req.getParameter("transactionTime"));
        String accountNumber = req.getParameter("accountNumber");
        int cvv2 = Integer.parseInt(req.getParameter("cvv2"));
        LocalDate cardExpirationDate = LocalDate.parse(req.getParameter("cardExpirationDate"));
        CustomerService customerService = CustomerService.getCustomerService();
        long customerId = Long.parseLong(req.getParameter("customerId"));
        OrderService orderService = OrderService.getOrderService();
        long orderId = Long.parseLong(req.getParameter("orderId"));
        Customer customer;
        Order order;
        try {
            customer = customerService.findById(customerId);
            order = orderService.findById(orderId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        PaymentTransaction paymentTransaction = PaymentTransaction.builder()
                .amount(amount)
                .transactionTime(transactionTime)
                .customer(customer)
                .accountNumber(accountNumber)
                .cvv2(cvv2)
                .cardExpirationDate(cardExpirationDate)
                .order(order)
                .build();

        try {
            paymentTransaction = PaymentTransactionService.getPaymentTransactionService().save(paymentTransaction);

        } catch (Exception e) {
            e.printStackTrace();
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }

        req.setAttribute("paymentTransaction", paymentTransaction);
        req.getRequestDispatcher("paymenttransaction.jsp").forward(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<PaymentTransaction> paymentTransactions = null;
        try {
            paymentTransactions = PaymentTransactionService.getPaymentTransactionService().findAll();
        } catch (Exception e) {
            req.setAttribute("message", "Error retrieving items: " + e.getMessage());
        }
        if (paymentTransactions != null) {
            req.setAttribute("paymentTransactions", paymentTransactions);
        }
        req.getRequestDispatcher("paymenttransaction.jsp").forward(req, resp);
    }
}
