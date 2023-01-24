package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "itemEntity")
@Table(name = "t_item")
public class Item extends BaseEntity {

    @ManyToMany(mappedBy = "items")
    private List<Order> orders;

    @ManyToOne
    @JoinColumn(name = "storage_id")
    private Storage storage;

    @OneToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;


    @Column(name = "c_name")
    private String name;

    @Column(name = "c_description")
    private String description;

    @Column(name = "c_price")
    private int price;

    @Lob
    @Column(name = "c_item_photo")
    private byte[] itemPhoto;

    @ManyToMany(mappedBy = "items")
    private List<Delivery> deliveries;
}
