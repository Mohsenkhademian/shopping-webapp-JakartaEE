package com.mhn.storewebappjakartaee;

import com.mhn.storewebappjakartaee.model.entity.*;
import com.mhn.storewebappjakartaee.model.service.*;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {

        Admin admin = Admin.builder().userName("mohsen").password("mohsen123").build();
        Admin admin1 = Admin.builder().userName("ali").password("ali123").build();
        Admin admin2 = Admin.builder().userName("mamad").password("mamad123").build();
        User user = User.builder().userName("mohsen").password("mohsen213").email("sdaf@.com").build();
        User user1 = User.builder().userName("ali").password("2344124").email("asdf@gmail.com").build();
        AdminService.getAdminService().save(admin);
        AdminService.getAdminService().save(admin1);
        AdminService.getAdminService().save(admin2);
        UserService.getUserService().save(user);
        UserService.getUserService().save(user1);


        System.out.println(AdminService.getAdminService().findByUserName("mohsen"));


















        /*Offer offer = Offer.builder().price(1000).build();
        Storage storage = Storage.builder().capacity(20).availableCapacity(10).address("tehran").name("tarebar").build();
        Order order = Order.builder().orderDate(LocalDate.now()).customerName("moshen").customerAddress("tehransar").build();
        Delivery delivery = Delivery.builder().deliveryStatus(true).deliveryDate(LocalDate.now()).recipientAddress("tehransar").recipientNumberPhone("12412414").build();
        Item item = Item.builder().name("phone").itemPhoto("phone.png").description("i phone x").orders((Set<Order>) order).offer(offer).deliveries((List<Delivery>) delivery).storage(storage).build();

*/






        /*User user = User.builder().userName("ali").email("ali@gmail.com").password("ali123").build();
        User user1 = User.builder().userName("mohsen").email("mohsen@gmail.com").password("mohsen123").build();
        User user2 = User.builder().userName("mamad").email("mamad@gmail.com").password("mamad123").build();
        UserService.getUserService().save(user);
        UserService.getUserService().save(user1);
        UserService.getUserService().save(user2);


        System.out.println(UserService.getUserService().findByUserName( "mohsen"));*/


        /*CRUDRepository<User,Long> generalDao1 = new CRUDRepository<>();
        Map<String , Object> paramMap1 = new HashMap<>();
        paramMap1.put("userName" ,  "mohsen");
        paramMap1.put("id" ,  2);
        System.out.println(generalDao1.executeQuery("Admin.findByUserName", paramMap1));

        System.out.println(UserService.getUserService().findByUserName("mohsen"));*/















        /*ItemService itemService = ItemService.getItemService();
        StorageService storageService = StorageService.getStorageService();
        OfferService offerService = OfferService.getOfferService();
        OrderService orderService = OrderService.getOrderService();
        DeliveryService deliveryService = DeliveryService.getDeliveryService();

        // Create a new Item
        Item item = new Item();
        item.setName("item 1");
        item.setPrice(10);
        item = itemService.save(item);
        System.out.println("Item saved with ID: " + item.getId());

        // Create a new Storage
        Storage storage = new Storage();
        storage.setName("TareBar");
        storage.setAddress("Tehran");
        storage.setCapacity(100);
        storage.setAvailableCapacity(20);
        storage = storageService.save(storage);
        System.out.println("Storage saved with ID: " + storage.getId());

        // Create a new Offer
        Offer offer = new Offer();
        offer.setPrice(10000);
        offer = offerService.save(offer);
        System.out.println("Offer saved with ID: " + offer.getId());

        // Create a new Order
        Order order = new Order();
        order.setOrderDate(LocalDate.now());
        order.setCustomerName("Mohsen");
        order.getItems().add(item);
        order = orderService.save(order);
        System.out.println("Order saved with ID: " + order.getId());

        // Create a new Delivery
        Delivery delivery = new Delivery();
        delivery.setRecipientName("Mohsen");
        delivery.setDeliveryDate(LocalDate.now());
        delivery.setDeliveryStatus(true);
        delivery.setRecipientAddress("tehransar");
        delivery.getItems().add(item);
        delivery = deliveryService.save(delivery);
        System.out.println("Delivery saved with ID: " + delivery.getId());

        // Update the Item
        item.setName("item 1 updated");
        item.setStorage(storage);
        item.setOffer(offer);
        item.getOrders().add(order);
        item.getDeliveries().add(delivery);
        item = itemService.update(item);
        System.out.println("Item updated with ID: " + item.getId());

        // Find the Item by ID
        Item foundItem = itemService.findById(item.getId());
        System.out.println("Found item: " + foundItem);

        // Find all Items
        List<Item> items = itemService.findAll();
        System.out.println("All items: " + items);

        // Delete the Item
        Item deletedItem = itemService.delete(item.getId());
        System.out.println("Item deleted with ID: " + deletedItem.getId());*/

        /* ----------------------------------------------------------------------------------------------*/

        /*Admin admin = Admin.builder().userName("admin").password("admin123").build();
        User user = User.builder().userName("user").email("user@gmail.com").password("user123").numberPhone("1234567890").build();
        Comment comment = Comment.builder().text("This is a comment").user(user).admin(admin).build();

        AdminService.getAdminService().save(admin);
        UserService.getUserService().save(user);
        CommentService.getCommentService().save(comment);*/

        /* -------------------------------------------------------------------------------------------------- */

        /*User user = User.builder().userName("user").email("user@gmail.com").password("user123").numberPhone("1234567890").build();
        Order order = Order.builder().customerName("Mohsen").customerAddress("theransar").orderDate(LocalDate.now()).build();
        PaymentTransaction paymentTransaction = PaymentTransaction.builder().transactionTime(LocalDate.from(LocalDateTime.now())).cvv2(1234).amount(12341L).accountNumber("12124124122131414").cardExpirationDate(LocalDate.now()).user(user).order(order).build();

        UserService.getUserService().save(user);
        OrderService.getOrderService().save(order);
        PaymentTransactionService.getPaymentTransactionService().save(paymentTransaction);*/

        /* --------------------------------------------------------------------------------------------------- */

        /*Item item = Item.builder().itemPhoto("photo.png").price(213).name("phone").build();
        Offer offer = Offer.builder().item(item).price(100).build();

        ItemService.getItemService().save(item);
        OfferService.getOfferService().save(offer);*/

    }

}







































    /*String photo = "C:\\Users\\asus\\Downloads\\1.png";

        Delivery delivery = new Delivery();
        delivery.setId(1);
        delivery.setDeliveryStatus(true);
        delivery.setRecipientAddress("addressssssssss");
        delivery.setRecipientName("mohsen");
        delivery.setDeliveryDate(LocalDate.now());
        delivery.setRecipientNumberPhone("09876543456");
        Delivery savedDelivery = DeliveryService.getDeliveryService().save(delivery);

// Create a list of deliveries
        List<Delivery> deliveries = new ArrayList<>();
        deliveries.add(savedDelivery);

        // Create an instance of the Storage class and set its fields
        Storage storage = new Storage();
        storage.setId(1);
        storage.setName("Test Storage");
        storage.setCapacity(100);
        Storage savedStorage = StorageService.getStorageService().save(storage);

// Create an instance of the Offer class and set its fields
        Offer offer = new Offer();
        offer.setId(1);
        offer.setPrice(234);
        Offer savedOffer = OfferService.getOfferService().save(offer);

// Create an instance of the Item class and set its fields
        Item item = Item.builder()
                .name("Test Item")
                .description("This is a test item.")
                .price(1000)
                .itemPhoto(photo)
                .storage(savedStorage)
                .offer(savedOffer)
                .deliveries(deliveries)
                .build();

// Save the item
        ItemService.getItemService().save(item);*/























       //* -----------------  Test For User  --------------------------------------*//*
       /* User user = User.builder().userName("moshen").password("moshen123").build();
        User user1 = User.builder().userName("mamad").password("mamad123").build();
        UserService.getUserService().save(user);
        user.setUserName("ali");
        user.setId(3L);w
        user.setPassword("ali123");
        UserService.getUserService().update(user);
        System.out.println(UserService.getUserService().findById(1L).toString());
//        UserService.getUserService().delete(1L);
//        UserService.getUserService().delete(2L);
        System.out.println(UserService.getUserService().findAll().toString());

        /*   *//* -----------------      Test for Admin    ------------------------------ *//*

        Admin admin = Admin.builder().userName("mohsenAdmin").password("admin123").build();
        AdminService.getAdminService().save(admin);
        admin.setUserName("mamadAdmin");
        AdminService.getAdminService().update(admin);
        System.out.println(AdminService.getAdminService().findById(1L).toString());
        System.out.println(AdminService.getAdminService().findAll().toString());
//        AdminService.getAdminService().delete(1L);

        *//* ---------------      Test for Comment        -------------------------- *//*

        Comment comment = Comment.builder().text("VeryGood.....").userId(1L).build();
        CommentService.getCommentService().save(comment);
        comment.setText("No it is a baddd");
        CommentService.getCommentService().update(comment);
        System.out.println(CommentService.getCommentService().findById(1L).toString());
        System.out.println(CommentService.getCommentService().findAll().toString());
//        CommentService.getCommentService().delete(1L);

        *//* -------------------    Test for Customer  ----------------------------- *//*

        Customer customer = Customer.builder().name("moshen").email("mohsen@gmail.com").build();
        CustomerService.getCustomerService().save(customer);
        customer.setName("mamad");
        CustomerService.getCustomerService().update(customer);
        System.out.println(CustomerService.getCustomerService().findById(1L).toString());
        System.out.println(CustomerService.getCustomerService().findAll().toString());
//        CustomerService.getCustomerService().delete(1L);

        *//* ------------------    Test for Item    ------------------------------*//*

        Item item1 = Item.builder().offerId(1L).name("Phone").description("iphone x roze gold").price(1234.23).build();
        Item item2 = Item.builder().offerId(1L).name("Tablet").description("ipad pro 2022").price(8723234.23).build();
        Item item3 = Item.builder().offerId(1L).name("Laptop").description("Lenovo ip5 Ram 8 , 512 ssd").price(1734.23).build();
        Item item4 = Item.builder().offerId(1L).name("TV").description("samsung smart").price(456234.23).build();
        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);

        ItemService.getItemService().save(item1);
        ItemService.getItemService().save(item2);
        ItemService.getItemService().save(item3);
        ItemService.getItemService().save(item4);

        item1.setName("Mobile");
        ItemService.getItemService().update(item1);
        System.out.println(ItemService.getItemService().findById(1L).toString());
        System.out.println(ItemService.getItemService().findAll().toString());
        ItemService.getItemService().delete(1L);
        ItemService.getItemService().delete(2L);
        ItemService.getItemService().delete(3L);

        *//* ------------------    Test for Order    ------------------------------*//*

        Order order = Order.builder().customerName("Mohsen").customerAddress("Tehran-tehransar").orderDate(LocalDate.now()).customerId(1L).items(itemList).build();
        OrderService.getOrderService().save(order);

       /* Offer offer = Offer.builder().price(123.342).build();




        Delivery delivery = Delivery.builder().recipientName("mohsen").recipientAddress("tehran-tehransar").deliveryStatus(true).deliveryDate(LocalDate.now()).build();
        DeliveryService.getDeliveryService().save(delivery);*/
