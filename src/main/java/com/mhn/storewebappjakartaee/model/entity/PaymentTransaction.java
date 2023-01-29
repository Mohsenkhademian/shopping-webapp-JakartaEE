package com.mhn.storewebappjakartaee.model.entity;

import com.google.gson.Gson;
import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "paymentTransactionsEntity")
@Table(name = "t_paymentTransactions")
@NamedQueries(
        {
                @NamedQuery(name = "PaymentTransaction.findByPaymentTransactionTransactionTime" , query = "select paymentTransaction from paymentTransactionsEntity paymentTransaction where paymentTransaction.transactionDateTime =:transactionDateTime")

        }
)
public class PaymentTransaction extends BaseEntity {

    @Column(name = "c_amount")
    private long amount;

    @Column(name = "c_transationtime")
    private LocalDateTime transactionDateTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "c_accountnumber")
    private String accountNumber;

    @Column(name = "c_cvv2")
    private int cvv2;

    @Column(name = "c_cardexpirationdate")
    private LocalDate cardExpirationDate;

    @OneToOne(mappedBy = "paymentTransaction", optional = false)
    private Order order;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
