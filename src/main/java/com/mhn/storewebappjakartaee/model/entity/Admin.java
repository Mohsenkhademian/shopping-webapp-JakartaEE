package com.mhn.storewebappjakartaee.model.entity;

import com.mhn.storewebappjakartaee.model.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;


import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "adminEntity")
@Table(name = "t_admin")
@NamedQueries(
        {
                @NamedQuery(name = "Admin.findByUserName" , query = "SELECT user FROM userEntity user WHERE user.userName = :userName"),
                @NamedQuery(name = "Admin.findByUserId" , query = "SELECT user FROM userEntity user WHERE user.id = :id"),
                @NamedQuery(name = "Admin.findByItemName" , query = "SELECT item FROM itemEntity item WHERE item.name = :name"),
                @NamedQuery(name = "Admin.findByCustomerName" , query = "SELECT customer FROM customerEntity customer WHERE customer.name =:name"),
                @NamedQuery(name = "Admin.findByOrderDate" , query = "SELECT order FROM orderEntity order WHERE order.orderDate = :orderDate"),
                @NamedQuery(name = "Admin.findByDeliveryRecipientAddress" , query = "SELECT delivery FROM deliveryEntity delivery WHERE delivery.recipientName = :recipientAddress"),
                @NamedQuery(name = "Admin.findByStorageAddress" , query = "SELECT storage FROM storageEntity storage WHERE storage.address = :address"),
                @NamedQuery(name = "Admin.findByOfferPrice" , query = "SELECT offer FROM offerEntity offer WHERE offer.price = :price"),
                @NamedQuery(name = "Admin.findByCommentText" , query = "SELECT comment FROM commentEntity comment WHERE comment.text = :text"),
                @NamedQuery(name = "Admin.findByPaymentTransactionDate" , query = "SELECT paymenttransaction FROM paymentTransactionsEntity paymenttransaction WHERE paymenttransaction.transactionTime =:transactionTime")
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

}
