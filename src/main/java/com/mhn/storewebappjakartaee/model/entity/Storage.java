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
@Entity(name = "storageEntity")
@Table(name = "t_storage")
public class Storage extends BaseEntity {

    @Column(name = "c_name")
    private String name;

    @Column(name = "c_address")
    private String address;

    @Column(name = "c_capacity")
    private int capacity;

    @Column(name = "c_availablecapacity")
    private int availableCapacity;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "storage_id")
    private List<Item> items;

}
