package com.mhn.storewebappjakartaee.model.entity;

import com.google.gson.Gson;
import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.FetchType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "deliveryEntity")
@Table(name = "t_delivery")
@NamedQueries(
        {
                @NamedQuery(name = "Delivery.findByDeliveryRecipientNameAndDate" , query = "select delivery from deliveryEntity delivery where delivery.recipientName =:recipientName and delivery.deliveryDateTime =:deliveryDateTime"),

        }
)
public class Delivery extends BaseEntity {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "delivery_item",
            joinColumns = @JoinColumn(name = "delivery_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<Item> items;


    @Column(name = "c_recipientname")
    private String recipientName;

    @Column(name = "c_recipientaddress")
    private String recipientAddress;

    @Column(name = "c_recipientnumberphone")
    private String recipientNumberPhone;

    @Column(name = "c_deliverystatus")
    private Boolean deliveryStatus;

    @Column(name = "c_deliverydate")
    private LocalDateTime deliveryDateTime;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
