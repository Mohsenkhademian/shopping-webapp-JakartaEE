package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "paymentTransactionsEntity")
@Table(name = "t_paymentTransactions")
public class PaymentTransaction extends BaseEntity {

    @Column(name = "c_amount")
    private double amount;

    @Column(name = "c_transationtime")
//    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate transactionTime;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "c_accountnumber")
    private String accountNumber;

    @Column(name = "c_cvv2")
    private int cvv2;

    @Column(name = "c_cardexpirationdate")
    private LocalDate cardExpirationDate;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
