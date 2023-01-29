package com.mhn.storewebappjakartaee.controller.servlet;

import com.mhn.storewebappjakartaee.model.entity.Customer;
import com.mhn.storewebappjakartaee.model.entity.Order;
import com.mhn.storewebappjakartaee.model.entity.PaymentTransaction;
import com.mhn.storewebappjakartaee.model.entity.User;
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
import java.time.LocalDateTime;
import java.util.List;

@WebServlet("/paymenttransaction")
public class PaymentTransactionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long amount = Long.parseLong(req.getParameter("amount"));
        LocalDateTime transactionTime = LocalDateTime.parse(req.getParameter("transactionTime"));
        User user = (User) req.getSession().getAttribute("user");
        String accountNumber = req.getParameter("accountNumber");
        int cvv2 = Integer.parseInt(req.getParameter("cvv2"));
        LocalDate cardExpirationDate = LocalDate.parse(req.getParameter("cardExpirationDate"));
        Order order = (Order) req.getSession().getAttribute("order");

        PaymentTransaction paymentTransaction = PaymentTransaction.builder()
                .amount(amount)
                .transactionDateTime(transactionTime)
                .user(user)
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
        req.getRequestDispatcher("index.jsp").forward(req, resp);
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
