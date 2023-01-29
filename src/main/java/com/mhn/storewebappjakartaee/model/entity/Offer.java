package com.mhn.storewebappjakartaee.model.entity;

import com.google.gson.Gson;
import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
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

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
