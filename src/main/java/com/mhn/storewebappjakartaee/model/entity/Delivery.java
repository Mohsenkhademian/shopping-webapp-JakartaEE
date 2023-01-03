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
@Entity(name = "deliveryEntity")
@Table(name = "delivery")
public class Delivery extends BaseEntity {
    private String recipientName;
    private String recipientAddress;


    private Boolean deliveryStatus;

    @Temporal(TemporalType.DATE)
    private Date deliveryDate;

    @Temporal(TemporalType.TIME)
    private Date deliveryTime;

   /* @ElementCollection
    private List<String> items;*/

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
