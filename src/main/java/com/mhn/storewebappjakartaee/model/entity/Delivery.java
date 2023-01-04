package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
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

    @JoinColumn(name = "order_id")
    private long orderId;

    @JoinColumn(name = "item_id")
    @ElementCollection
    private List<Long> itemsId;

    @Column(name = "c_recipientname")
    private String recipientName;

    @Column(name = "c_recipientaddress")
    private String recipientAddress;

    @Column(name = "c_deliverystatus")
    private Boolean deliveryStatus;

    @Column(name = "c_deliverydate")
    @Temporal(TemporalType.DATE)
    private LocalDate deliveryDate;

    /*@Column(name = "c_deliverytime")
    @Temporal(TemporalType.TIME)
    private Date deliveryTime;*/

    /*@OneToOne
    @JoinColumn(name = "order_id")
    private Order order;*/
}
