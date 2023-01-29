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
@Entity(name = "customerEntity")
@Table(name = "t_customer")
@NamedQueries(
        {
                @NamedQuery(name = "Customer.findByCustomerName" , query = "select customer from customerEntity customer where customer.name =:name"),

        }
)
public class Customer extends BaseEntity {

    @Column(name = "c_name")
    private String name;

    @Column(name = "c_email")
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private List<Order> orders;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
