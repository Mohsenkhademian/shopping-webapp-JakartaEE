package com.mhn.storewebappjakartaee.model.entity;

import com.google.gson.Gson;
import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;


import java.util.List;

@Getter
@Setter
//@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "adminEntity")
@Table(name = "t_admin")
@NamedQueries(
        {
                @NamedQuery(name = "Admin.findByUserName" , query = "select admin from adminEntity admin where admin.userName =:userName"),
//                @NamedQuery(name = "Admin.findByItemName" , query = "select item from itemEntity item where item.name =:name"),
//                @NamedQuery(name = "Admin.findByCustomerName" , query = "select customer from customerEntity customer where customer.name =:name"),
//                @NamedQuery(name = "Admin.findByOrderDate" , query = "select order from orderEntity order where order.orderDate =:orderDate"),
//                @NamedQuery(name = "Admin.findByDeliveryRecipientNameAndDate" , query = "select delivery from deliveryEntity delivery where delivery.recipientName =:orderDate and delivery.deliveryDate =:deliveryDate"),
//                @NamedQuery(name = "Admin.findByStorageAddress" , query = "select storage from storageEntity storage where storage.address =:address"),
//                @NamedQuery(name = "Admin.findByOfferPrice" , query = "select offer from offerEntity offer where offer.price =:price"),
//                @NamedQuery(name = "Admin.findByCommentText" , query = "select comment from commentEntity comment where comment.text =:text"),
//                @NamedQuery(name = "Admin.findByPaymentTransactionTransactionTime" , query = "select paymentTransaction from paymentTransactionsEntity paymentTransaction where paymentTransaction.transactionTime =:transactionTime")
        }
)
public class Admin extends BaseEntity {

    @Column(name = "c_username")
    private String userName;

    @Column(name = "c_password")
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "admin_id")
    private List<Comment> comments;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
