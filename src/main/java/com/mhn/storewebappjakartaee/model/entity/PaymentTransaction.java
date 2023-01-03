package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "paymentTransactionsEntity")
@Table(name = "t_paymentTransactions")
public class PaymentTransaction extends BaseEntity {

    @Column(name = "c_amount")
    private double amount;

    @Column(name = "c_transationtime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionTime;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
