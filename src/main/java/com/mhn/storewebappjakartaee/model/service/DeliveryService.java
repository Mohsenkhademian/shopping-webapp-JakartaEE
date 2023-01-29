package com.mhn.storewebappjakartaee.model.service;


import com.mhn.storewebappjakartaee.model.entity.Delivery;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.base.ServiceImpl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeliveryService extends ServiceImpl<Delivery , Long> {
    private static final DeliveryService deliveryService = new DeliveryService();

    private DeliveryService(){
    }

    public static DeliveryService getDeliveryService(){return deliveryService;}


    @Override
    public Delivery save(Delivery delivery) throws Exception {
        try (CRUDRepository<Delivery, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.insert(delivery);
        }
    }

    @Override
    public Delivery delete(Long id) throws Exception {
        try (CRUDRepository<Delivery, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.delete(Delivery.class,id);
        }
    }

    @Override
    public Delivery update(Delivery delivery) throws Exception {
        try (CRUDRepository<Delivery, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.update(delivery);
        }
    }

    @Override
    public List<Delivery> findAll() throws Exception {
        try (CRUDRepository<Delivery , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectAll(Delivery.class);
        }
    }

    @Override
    public Delivery findById(Long id) throws Exception {
        try (CRUDRepository<Delivery , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectById(Delivery.class , id);
        }
    }

    public List<Delivery> findByDeliveryRecipientNameAndDate(String recipientName, LocalDate deliveryDateTime) throws Exception {
        try (CRUDRepository<Delivery, Long> crudRepository = new CRUDRepository<>()) {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("recipientName", recipientName);
            paramMap.put("deliveryDateTime", deliveryDateTime);
            List<Delivery> deliveryList = crudRepository.executeQuery("Delivery.findByDeliveryRecipientNameAndDate", paramMap);
            return (deliveryList!=null)?deliveryList:null;
        }
    }
}
