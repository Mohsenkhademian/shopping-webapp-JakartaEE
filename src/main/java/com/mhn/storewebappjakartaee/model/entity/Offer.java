package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "offerEntity")
@Table(name = "t_offer")
public class Offer extends BaseEntity {

    @Column(name = "c_price")
    private double price;

    @OneToOne(mappedBy = "offer")
    private Item item;
}
