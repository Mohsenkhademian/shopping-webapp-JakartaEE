package serviceTest;

import com.mhn.storewebappjakartaee.model.entity.Delivery;
import com.mhn.storewebappjakartaee.model.service.DeliveryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
                .itemsId(Arrays.asList(2L, 3L))
                .recipientName("John Smith")
                .recipientAddress("123 Main Street")
                .deliveryStatus(true)
                .build();
        Delivery savedDelivery = service.save(delivery);
        assertNotNull(savedDelivery.getId());
        assertEquals(delivery.getOrderId(), savedDelivery.getOrderId());
        assertEquals(delivery.getItemsId(), savedDelivery.getItemsId());
        assertEquals(delivery.getRecipientName(), savedDelivery.getRecipientName());
        assertEquals(delivery.getRecipientAddress(), savedDelivery.getRecipientAddress());
        assertEquals(delivery.getDeliveryStatus(), savedDelivery.getDeliveryStatus());
    }
}
