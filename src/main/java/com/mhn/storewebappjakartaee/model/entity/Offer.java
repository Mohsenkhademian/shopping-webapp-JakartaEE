package com.mhn.storewebappjakartaee.model.entity;

import com.google.gson.Gson;
import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "offerEntity")
@Table(name = "t_offer")
@NamedQueries(
        {
                @NamedQuery(name = "Offer.findByOfferPrice" , query = "select offer from offerEntity offer where offer.price =:price"),

        }
)
public class Offer extends BaseEntity {

    @Column(name = "c_price")
    private int price;

    @OneToOne(mappedBy = "offer")
    private Item item;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
