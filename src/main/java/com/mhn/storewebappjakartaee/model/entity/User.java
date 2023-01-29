package com.mhn.storewebappjakartaee.model.entity;

import com.google.gson.Gson;
import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "userEntity")
@Table(name = "t_user")
public class User extends BaseEntity {

    @Column(name = "c_username")
    private String userName;

    @Column(name = "c_email")
    private String email;

    @Column(name = "c_password")
    private String password;

    @Column(name = "c_numberphone")
    private String numberPhone;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private Set<Comment> comments;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<PaymentTransaction> paymentTransactions;

    @Override
    public String toString() {
        Hibernate.initialize(comments);
        return new Gson().toJson(this);
    }
}
