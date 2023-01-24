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
@Entity(name = "adminEntity")
@Table(name = "t_admin")
public class Admin extends BaseEntity {

    @Column(name = "c_username")
    private String userName;

    @Column(name = "c_password")
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "admin_id")
    private List<Comment> comments;

}
