package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "offerEntity")
@Table(name = "offer")
public class Offer extends BaseEntity {
    @Column(name = "c_price")
    private double price;


}
