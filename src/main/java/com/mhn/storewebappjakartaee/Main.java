package com.mhn.storewebappjakartaee;

import com.mhn.storewebappjakartaee.model.entity.*;
import com.mhn.storewebappjakartaee.model.service.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        /* -----------------  Test For User  --------------------------------------*/
        User user = User.builder().userName("moshen").password("moshen123").build();
        User user1 = User.builder().userName("mamad").password("mamad123").build();
        UserService.getUserService().save(user);
        user.setUserName("ali");
        user.setId(3L);
        user.setPassword("ali123");
        UserService.getUserService().update(user);
        System.out.println(UserService.getUserService().findById(1L).toString());
//        UserService.getUserService().delete(1L);
//        UserService.getUserService().delete(2L);
        System.out.println(UserService.getUserService().findAll().toString());

        /* -----------------      Test for Admin    ------------------------------ */

        Admin admin = Admin.builder().userName("mohsenAdmin").password("admin123").build();
        AdminService.getAdminService().save(admin);
        admin.setUserName("mamadAdmin");
        AdminService.getAdminService().update(admin);
        System.out.println(AdminService.getAdminService().findById(1L).toString());
        System.out.println(AdminService.getAdminService().findAll().toString());
//        AdminService.getAdminService().delete(1L);

        /* ---------------      Test for Comment        -------------------------- */

        Comment comment = Comment.builder().text("VeryGood.....").userId(1L).build();
        CommentService.getCommentService().save(comment);
        comment.setText("No it is a baddd");
        CommentService.getCommentService().update(comment);
        System.out.println(CommentService.getCommentService().findById(1L).toString());
        System.out.println(CommentService.getCommentService().findAll().toString());
//        CommentService.getCommentService().delete(1L);

        /* -------------------    Test for Customer  ----------------------------- */

        Customer customer = Customer.builder().name("moshen").email("mohsen@gmail.com").build();
        CustomerService.getCustomerService().save(customer);
        customer.setName("mamad");
        CustomerService.getCustomerService().update(customer);
        System.out.println(CustomerService.getCustomerService().findById(1L).toString());
        System.out.println(CustomerService.getCustomerService().findAll().toString());
//        CustomerService.getCustomerService().delete(1L);

        /* ------------------    Test for Delivery    ------------------------------*/
//        Offer offer = Offer.builder().price(123.34).build();
//
//
//        Item item = Item.builder()..build();
//
//        Delivery delivery = Delivery.builder().recipientName("mohsen").recipientAddress("tehran-tehransar").deliveryStatus(true).deliveryDate(LocalDate.now()).build();
//        DeliveryService.getDeliveryService().save(delivery);




    }
}
