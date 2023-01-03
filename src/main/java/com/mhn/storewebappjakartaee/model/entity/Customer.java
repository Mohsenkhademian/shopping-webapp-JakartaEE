package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "customerEntity")
@Table(name = "t_customer")
public class Customer extends BaseEntity {

    @Column(name = "c_name")
    private String name;

    @Column(name = "c_email")
    private String email;


}
