package com.mhn.storewebappjakartaee.model.service;

import com.mhn.storewebappjakartaee.model.entity.Item;
import com.mhn.storewebappjakartaee.model.entity.Order;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.base.ServiceImpl;

import java.util.List;

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
}
