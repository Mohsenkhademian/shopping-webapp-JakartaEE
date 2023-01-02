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
@Entity(name = "itemEntity")
@Table(name = "item")
public class Item extends BaseEntity {
    @Column(name = "c_name")
    private String name;
    @Column(name = "c_description")
    private String description;
    @Column(name = "c_price")
    private double price;
}
