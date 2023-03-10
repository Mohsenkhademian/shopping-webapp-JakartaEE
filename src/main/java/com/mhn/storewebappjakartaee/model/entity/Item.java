package com.mhn.storewebappjakartaee.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.Gson;
import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "itemEntity")
@Table(name = "t_item")
@NamedQueries(
        {
                @NamedQuery(name = "Item.findByItemName" , query = "select item from itemEntity item where item.name =:name"),
        }
)
public class Item extends BaseEntity {

    @JsonIgnore
    @ManyToMany(mappedBy = "items", fetch = FetchType.EAGER)
    private Set<Order> orders = new HashSet<>();

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
    private long price;

    @Column(name = "c_item_photo")
    private String itemPhoto;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "delivery_item",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "delivery_id"))
    private List<Delivery> deliveries;

    @OneToMany(mappedBy = "item")
    private List<Comment> comments;


    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}