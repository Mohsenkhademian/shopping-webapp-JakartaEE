package serviceTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;

import com.mhn.storewebappjakartaee.model.entity.Item;
import com.mhn.storewebappjakartaee.model.entity.Order;
import com.mhn.storewebappjakartaee.model.service.ItemService;
import com.mhn.storewebappjakartaee.model.service.OrderService;

public class OrderServiceTest {
    private OrderService orderService = OrderService.getOrderService();
/*

    @Test
    public void testSave() throws Exception{
        // Create a new order with some dummy data
        Order order = Order.builder()
                .customerId(1L)
                .customerName("Mohsen Khademian")
                .customerAddress("Tehran")
                .orderDate(LocalDate.now())
                .items(Arrays.asList(
                        new Item(1L,2L,3L,"Phone","IPhoneX",140000000),
                        new Item(3L,4L,5L,"LapTop","ASUSX550D",90000000)))
                .build();

        // Save the order
        Order savedOrder = orderService.save(order);

        // Make sure the saved order has a valid ID
        assertNotNull(savedOrder.getId());

        // Make sure the saved order is equal to the original order
        assertEquals(order, savedOrder);
    }

    @Test
    public void testDelete() throws Exception{

        Order order = Order.builder()
                .customerId(1L)
                .customerName("Mohsen Khademian")
                .customerAddress("Tehran")
                .orderDate(LocalDate.now())
                .items(Arrays.asList(
                        new Item(1L,2L,3L,"Phone","IPhoneX",140000000),
                        new Item(3L,4L,5L,"LapTop","ASUSX550D",90000000)))
                .build();


        Order savedOrder = orderService.save(order);


        Order deletedOrder = orderService.delete(savedOrder.getId());


        assertEquals(savedOrder, deletedOrder);


        assertNull(orderService.findById(savedOrder.getId()));
    }

    @Test
    public void testUpdate() throws Exception{

        Order order = Order.builder()
                .customerId(1L)
                .customerName("Mohsen Khademian")
                .customerAddress("Tehran")
                .orderDate(LocalDate.now())
                .items(Arrays.asList(
                        new Item(1L,2L,3L,"Phone","IPhoneX",140000000),
                        new Item(3L,4L,5L,"LapTop","ASUSX550D",90000000)))
                .build();


        Order savedOrder = orderService.save(order);


        savedOrder.setCustomerName("Jane Smith");
        Order updatedOrder = orderService.update(savedOrder);


        assertEquals(savedOrder, updatedOrder);
    }

    @Test
    public void testFindAll() throws Exception{

        Order order1 = Order.builder()
                .customerId(1L)
                .customerName("Mohsen Khademian")
                .customerAddress("Tehran")
                .orderDate(LocalDate.now())
                .items(Arrays.asList(
                        new Item(1L,2L,3L,"Phone","IPhoneX",140000000),
                        new Item(3L,4L,5L,"LapTop","ASUSX550D",90000000)))
                .build();
        Order order2 = Order.builder()
                .customerId(2L)
                .customerName("Mohsen Khademian")
                .customerAddress("Tehran")
                .orderDate(LocalDate.now())
                .items(Arrays.asList(
                        new Item(2L,7L,9L,"LapTop","ASUSX550D",90000000),
                        new Item(3L,6L,8L,"LapTop","ASUSX550D",90000000)))
                .build();
        orderService.save(order1);
        orderService.save(order2);


        List<Order> orders = orderService.findAll();


        assertTrue(orders.contains(order1));
        assertTrue(orders.contains(order2));
    }

    @Test
    public void testFindById() throws Exception{

        Order order = Order.builder()
                .customerId(1L)
                .customerName("Mohsen Khademian")
                .customerAddress("Tehran")
                .orderDate(LocalDate.now())
                .items(Arrays.asList(
                        new Item(2L,7L,9L,"LapTop","ASUSX550D",90000000),
                        new Item(1L,2L,3L,"Phone","IPhoneX",140000000)))
                .build();
        Order savedOrder = orderService.save(order);


        Order foundOrder = orderService.findById(savedOrder.getId());


        assertEquals(savedOrder, foundOrder);
    }


*/



}
