package serviceTest;

import static org.junit.jupiter.api.Assertions.*;

import com.mhn.storewebappjakartaee.model.entity.Item;
import com.mhn.storewebappjakartaee.model.entity.Storage;
import com.mhn.storewebappjakartaee.model.service.StorageService;
import org.junit.jupiter.api.Test;

import java.util.List;


public class StorageServiceTest {
    private StorageService storageService = StorageService.getStorageService();

    @Test
    public void testSave() throws Exception {
        Storage storage = Storage.builder().name("Storage A").address("New York")
                .capacity(100)
                .availableCapacity(50)
                .items(List.of(
                        new Item(1L,2L,3L,"Phone","IPhoneX",140000000),
                        new Item(3L,4L,5L,"LapTop","ASUSX550D",90000000)))
                .build();
        Storage savedStorage = null;

        savedStorage = storageService.save(storage);

        assertNotNull(savedStorage);
        assertNotNull(savedStorage.getId());
        assertEquals(storage.getName(), savedStorage.getName());
        assertEquals(storage.getAddress(), savedStorage.getAddress());
    }

    @Test
    void testUpdate()throws Exception{
        Storage storage = Storage.builder().name("Storage A").address("New York")
                .capacity(100)
                .availableCapacity(50)
                .items(List.of(
                        new Item(1L,2L,3L,"Phone","IPhoneX",140000000),
                        new Item(3L,4L,5L,"LapTop","ASUSX550D",90000000)))
                .build();
        Storage savedStorage = storageService.save(storage);

        savedStorage.setAddress("London");
        Storage updateStorage = storageService.update(savedStorage);
        assertEquals(savedStorage,updateStorage);
    }

    @Test
    void testFindAll()throws Exception{
        Storage storage1 = Storage.builder().name("Storage A").address("New York")
                .capacity(100)
                .availableCapacity(50)
                .items(List.of(
                        new Item(1L,2L,3L,"Phone","IPhoneX",140000000),
                        new Item(3L,4L,5L,"LapTop","ASUSX550D",90000000)))
                .build();

        Storage storage2 = Storage.builder().name("Storage A").address("New York")
                .capacity(100)
                .availableCapacity(50)
                .items(List.of(
                        new Item(1L,2L,3L,"TV","Samsung",14023400),
                        new Item(3L,4L,5L,"Camera","canon",910530000)))
                .build();
        storageService.save(storage1);
        storageService.save(storage2);

        List<Storage> storageList = storageService.findAll();

        assertTrue(storageList.contains(storage1));
        assertTrue(storageList.contains(storage2));

    }

    @Test
    void testFindById()throws Exception{
        Storage storage = Storage.builder().name("Storage A").address("New York")
                .capacity(100)
                .availableCapacity(50)
                .items(List.of(
                        new Item(1L,2L,3L,"Phone","IPhoneX",140000000),
                        new Item(3L,4L,5L,"LapTop","ASUSX550D",90000000)))
                .build();
        Storage savedStorage = storageService.save(storage);

        Storage foundStorage = storageService.findById(savedStorage.getId());
        assertEquals(savedStorage, foundStorage);
    }


    @Test
    void testDelete()throws Exception{
        Storage storage = Storage.builder().name("Storage A").address("New York")
                .capacity(100)
                .availableCapacity(50)
                .items(List.of(
                        new Item(1L,2L,3L,"Phone","IPhoneX",140000000),
                        new Item(3L,4L,5L,"LapTop","ASUSX550D",90000000)))
                .build();
        Storage savedStorage = storageService.save(storage);

        Storage deleteStorage = storageService.delete(savedStorage.getId());
        assertNull(storageService.findById(savedStorage.getId()));
    }

}
