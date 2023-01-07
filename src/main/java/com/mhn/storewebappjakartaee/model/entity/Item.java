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

    @JoinColumn(name = "order_id")
    private long orderId;

    @JoinColumn(name = "storage_id")
    private long storageId;

    @JoinColumn(name = "offer_id")
    private long offerId;

    @Column(name = "c_name")
    private String name;

    @Column(name = "c_description")
    private String description;

    @Column(name = "c_price")
    private double price;

}
