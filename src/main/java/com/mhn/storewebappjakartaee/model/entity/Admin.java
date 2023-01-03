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
@Entity(name = "adminEntity")
@Table(name = "t_admin")
public class Admin extends BaseEntity {

    @Column(name = "c_username")
    private String userName;

    @Column(name = "c_password")
    private String password;


}
