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

    @Test
    public void testFindAll() throws Exception{
        // ایجاد و ذخیره چند تحویل
        Delivery delivery1 = Delivery.builder()
                .orderId(1L)
                .items(Arrays.asList(
                        Item.builder().price(10).offerId(1L).name("Item 1").build()
                ))
                .recipientName("John Smith")
                .recipientAddress("123 Main Street")
                .deliveryStatus(true)
                .deliveryDate(LocalDate.now())
                .build();
        Delivery delivery2 = Delivery.builder()
                .orderId(2L)
                .items(Arrays.asList(
                        Item.builder().price(30).offerId(2L).name("Item 2").build()
                        ))
                .recipientName("Mohsen Khademian")
                .recipientAddress("Tehran")
                .deliveryStatus(true)
                .deliveryDate(LocalDate.now())
                .build();

            service.save(delivery1);
            service.save(delivery2);

        // تلاش برای دریافت همه تحویل ها
        List<Delivery> deliveries = null;

            deliveries = service.findAll();

        // بررسی اینکه آیا همه تحویل ها با مقادیر ایجاد شده مشابه است
        assertNotNull(deliveries);
        assertEquals(2, deliveries.size());
//        assertTrue(deliveries.contains(delivery1));
//        assertTrue(deliveries.contains(delivery2));
    }

}
