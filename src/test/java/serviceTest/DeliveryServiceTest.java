package serviceTest;

import com.mhn.storewebappjakartaee.model.entity.Delivery;
import com.mhn.storewebappjakartaee.model.entity.Item;
import com.mhn.storewebappjakartaee.model.service.DeliveryService;
import org.hibernate.Hibernate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DeliveryServiceTest {
    private DeliveryService service;

    @BeforeEach
    void setUp() {
        service = DeliveryService.getDeliveryService();
    }

    @Test
    void testSave() throws Exception {
        Delivery delivery = Delivery.builder()
                .orderId(1L)
                .items(Arrays.asList(
                        Item.builder().name("Phone").build(),
                        Item.builder().name("LapTop").build()
                ))
                .recipientName("Mohsen Khademian")
                .recipientAddress("Tehran")
                .deliveryDate(LocalDate.now())
                .deliveryStatus(true)
                .build();
        Delivery savedDelivery = service.save(delivery);
        assertNotNull(savedDelivery.getId());
        assertEquals(delivery.getOrderId(), savedDelivery.getOrderId());
        assertEquals(delivery.getItems(), savedDelivery.getItems());
        assertEquals(delivery.getRecipientName(), savedDelivery.getRecipientName());
        assertEquals(delivery.getRecipientAddress(), savedDelivery.getRecipientAddress());
        assertEquals(delivery.getDeliveryStatus(), savedDelivery.getDeliveryStatus());
    }

    @Test
    void testUpdate() throws Exception {
        Delivery delivery = service.save(Delivery.builder()
                .orderId(1L)
                .items(Arrays.asList(
                        Item.builder().name("Phone").build(),
                        Item.builder().name("LapTop").build()
                ))
                .recipientName("Mohsen Khademian")
                .recipientAddress("Tehran")
                .deliveryDate(LocalDate.now())
                .deliveryStatus(true)
                .build());

        delivery.setRecipientName("Ali Alaaei");
        delivery.setRecipientAddress("Esfahan");
        delivery.setDeliveryStatus(false);

        Delivery updatedDelivery = service.update(delivery);
        assertEquals(delivery.getId(), updatedDelivery.getId());
        assertEquals(delivery.getRecipientName(), updatedDelivery.getRecipientName());
        assertEquals(delivery.getRecipientAddress(), updatedDelivery.getRecipientAddress());
        assertEquals(delivery.getDeliveryStatus(), updatedDelivery.getDeliveryStatus());
    }

    @Test
    void testDelete() throws Exception {
        Delivery delivery = service.save(Delivery.builder()
                .orderId(1L)
                .items(Arrays.asList(
                        Item.builder().name("Phone").build(),
                        Item.builder().name("LapTop").build()
                ))
                .recipientName("Mohsen Khademian")
                .recipientAddress("Tehran")
                .deliveryDate(LocalDate.now())
                .deliveryStatus(true)
                .build());
        service.delete(delivery.getId());
        assertNull(service.findById(delivery.getId()));
    }

    @Test
    void testFindById() throws Exception {
        Delivery delivery = service.save(Delivery.builder()
                .orderId(1L)
                .items(Arrays.asList(
                        Item.builder().name("Item 1").build(),
                        Item.builder().name("Item 2").build()
                ))
                .recipientName("John Smith")
                .recipientAddress("123 Main Street")
                .deliveryStatus(true)
                .build());
        Delivery foundDelivery = service.findById(delivery.getId());
        assertEquals(delivery.getId(), foundDelivery.getId());
        assertEquals(delivery.getOrderId(), foundDelivery.getOrderId());
//        assertEquals(delivery.getItems(), foundDelivery.getItems());
        assertEquals(delivery.getRecipientName(), foundDelivery.getRecipientName());
        assertEquals(delivery.getRecipientAddress(), foundDelivery.getRecipientAddress());
        assertEquals(delivery.getDeliveryStatus(), foundDelivery.getDeliveryStatus());
    }

   /* @Test
    void testFindAll() throws Exception {
        Delivery delivery1 = service.save(Delivery.builder()
                .orderId(1L)
                .items(Arrays.asList(
                        Item.builder().name("Item 1").build(),
                        Item.builder().name("Item 2").build()
                ))
                .recipientName("John Smith")
                .recipientAddress("123 Main Street")
                .deliveryStatus(true)
                .build());

        service.save(delivery1);

        Delivery delivery2 = service.save(Delivery.builder()
                .orderId(1L)
                .items(Arrays.asList(
                        Item.builder().name("Item 1").build(),
                        Item.builder().name("Item 2").build()
                ))
                .recipientName("John Smith")
                .recipientAddress("123 Main Street")
                .deliveryStatus(true)
                .build());

        service.save(delivery2);

        List<Delivery> deliveryList = service.findAll();


        assertEquals(2, deliveryList.size());
        assertTrue(deliveryList.stream().anyMatch(d -> d.getRecipientName().equals(delivery1.getRecipientName())));
        assertTrue(deliveryList.stream().anyMatch(d -> d.getRecipientAddress().equals(delivery2.getRecipientAddress())));
    }


*/
}
