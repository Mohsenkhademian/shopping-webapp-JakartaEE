package com.mhn.storewebappjakartaee.model.entity;

import com.google.gson.Gson;
import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "orderEntity")
@Table(name = "t_order")
@NamedQueries({
        @NamedQuery(name = "Order.findByOrderDate", query = "select order from orderEntity order where order.orderDate =:orderDate"),
})
public class Order extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "c_customername")
    private String customerName;

    @Column(name = "c_customeraddress")
    private String customerAddress;

    @Column(name = "c_orderdate")
    private LocalDate orderDate;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "t_order_item",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<Item> items;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private List<Delivery> deliveries;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "paymentTransaction_id")
    private PaymentTransaction paymentTransaction;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}