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
@Entity(name = "customerEntity")
@Table(name = "customer")
public class Customer extends BaseEntity {
    @Column(name = "c_name")
    private String name;
    @Column(name = "c_email")
    private String email;
}
