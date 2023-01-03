package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "orderEntity")
@Table(name = "t_order")
public class Order extends BaseEntity {

    @Column(name = "c_customername")
    private String customerName;

    @Column(name = "c_customeraddress")
    private String customerAddress;

    @Column(name = "c_orderdate")
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<Item> items;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
