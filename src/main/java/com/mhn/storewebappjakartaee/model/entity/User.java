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
@Entity(name = "userEntity")
@Table(name = "user")
public class User extends BaseEntity {
    @Column(name = "c_username")
    private String userName;
    @Column(name = "c_password")
    private String password;


}
