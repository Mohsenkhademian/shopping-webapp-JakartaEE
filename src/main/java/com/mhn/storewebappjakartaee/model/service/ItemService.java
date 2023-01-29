package com.mhn.storewebappjakartaee.model.service;

import com.mhn.storewebappjakartaee.model.entity.Admin;
import com.mhn.storewebappjakartaee.model.entity.Item;
import com.mhn.storewebappjakartaee.model.entity.Order;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.base.ServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemService extends ServiceImpl<Item , Long> {
    private static final ItemService itemService = new ItemService();

    private ItemService(){
    }

    public static ItemService getItemService(){return itemService;}

    @Override
    public Item save(Item item) throws Exception {
        try (CRUDRepository<Item, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.insert(item);
        }
    }

    @Override
    public Item delete(Long id) throws Exception {
        try (CRUDRepository<Item, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.delete(Item.class,id);
        }
    }

    @Override
    public Item update(Item item) throws Exception {
        try (CRUDRepository<Item, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.update(item);
        }
    }

    @Override
    public List<Item> findAll() throws Exception {
        try (CRUDRepository<Item , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectAll(Item.class);
        }
    }

    @Override
    public Item findById(Long id) throws Exception {
        try (CRUDRepository<Item , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectById(Item.class , id);
        }
    }

    public Item findByItemName(String name) throws Exception {
        try (CRUDRepository<Item, Long> crudRepository = new CRUDRepository<>()) {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("name", name);
            List<Item> itemList = crudRepository.executeQuery("Item.findByItemName", paramMap);
            return (itemList!=null)?itemList.get(0):null;
        }
    }
}
