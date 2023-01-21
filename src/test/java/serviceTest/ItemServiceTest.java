package serviceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mhn.storewebappjakartaee.model.entity.Item;
import com.mhn.storewebappjakartaee.model.service.ItemService;

import java.util.List;

public class ItemServiceTest {

    private ItemService itemService = ItemService.getItemService();

    @Test
    void testSave() throws Exception {
        Item item = new Item();
        item.setOrderId(1L);
        item.setStorageId(2L);
        item.setOfferId(3L);
        item.setName("Test Item");
        item.setDescription("This is a test item.");
        item.setPrice(9);
        item = itemService.save(item);
        assertNotNull(item.getId());
    }

    @Test
    void testDelete() throws Exception {
        Item item = new Item();
        item.setOrderId(1L);
        item.setStorageId(2L);
        item.setOfferId(3L);
        item.setName("Test Item");
        item.setDescription("This is a test item.");
        item.setPrice(9);
        item = itemService.save(item);
        assertNotNull(item.getId());
        itemService.delete(item.getId());
        item = itemService.findById(item.getId());
        assertNull(item);
    }

    @Test
    void testUpdate() throws Exception {
        Item item = new Item();
        item.setOrderId(1L);
        item.setStorageId(2L);
        item.setOfferId(3L);
        item.setName("Test Item");
        item.setDescription("This is a test item.");
        item.setPrice(9);
        item = itemService.save(item);
        assertNotNull(item.getId());
        item.setName("Updated Test Item");
        item.setDescription("This is an updated test item.");
        item.setPrice(12);
        item = itemService.update(item);
        assertEquals("Updated Test Item", item.getName());
        assertEquals("This is an updated test item.", item.getDescription());
        assertEquals(12, item.getPrice());
    }

    @Test
    void testFindAll() throws Exception {
        Item item1 = new Item();
        item1.setOrderId(1L);
        item1.setStorageId(2L);
        item1.setOfferId(3L);
        item1.setName("Test Item 1");
        item1.setDescription("This is a test item 1.");
        item1.setPrice(9);
        Item item2 = new Item();
        item2.setOrderId(1L);
        item2.setStorageId(2L);
        item2.setOfferId(3L);
        item2.setName("Test Item 2");
        item2.setDescription("This is a test item 2.");
        item2.setPrice(19);
        itemService.save(item1);
        itemService.save(item2);
        List<Item> items = itemService.findAll();
        assertEquals(2, items.size());
    }

    @Test
    void testFindById() throws Exception {
        Item item = new Item();
        item.setOrderId(1L);
        item.setStorageId(2L);
        item.setOfferId(3L);
        item.setName("Test Item");
        item.setDescription("This is a test item.");
        item.setPrice(9);
        item = itemService.save(item);
        assertNotNull(item.getId());
        Item foundItem = itemService.findById(item.getId());
        assertEquals(item.getId(), foundItem.getId());
        assertEquals(item.getOrderId(), foundItem.getOrderId());
        assertEquals(item.getStorageId(), foundItem.getStorageId());
        assertEquals(item.getOfferId(), foundItem.getOfferId());
        assertEquals(item.getName(), foundItem.getName());
        assertEquals(item.getDescription(), foundItem.getDescription());
        assertEquals(item.getPrice(), foundItem.getPrice());
    }

}
