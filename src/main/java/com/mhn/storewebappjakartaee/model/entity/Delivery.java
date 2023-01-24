package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "deliveryEntity")
@Table(name = "t_delivery")
public class Delivery extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "delivery_item",
            joinColumns = @JoinColumn(name = "delivery_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<Item> items;


    @Column(name = "c_recipientname")
    private String recipientName;

    @Column(name = "c_recipientaddress")
    private String recipientAddress;

    @Column(name = "c_deliverystatus")
    private Boolean deliveryStatus;

    @Column(name = "c_deliverydate")
    private LocalDate deliveryDate;
}
