package com.mhn.storewebappjakartaee.model.entity;

import com.google.gson.Gson;
import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
//@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "userEntity")
@Table(name = "t_user")
@NamedQueries(
        {
                @NamedQuery(name = "User.findByUserName" , query = "select admin from userEntity admin where admin.userName =:userName"),

        }
)
public class User extends BaseEntity {

    @Column(name = "c_username")
    private String userName;

    @Column(name = "c_email")
    private String email;

    @Column(name = "c_password")
    private String password;

    @Column(name = "c_numberphone")
    private String numberPhone;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Comment> comments;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<PaymentTransaction> paymentTransactions;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
