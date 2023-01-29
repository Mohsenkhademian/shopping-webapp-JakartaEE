package com.mhn.storewebappjakartaee.model.service;

import com.mhn.storewebappjakartaee.model.entity.Admin;
import com.mhn.storewebappjakartaee.model.entity.Offer;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.base.ServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfferService extends ServiceImpl<Offer , Long> {
    private static final OfferService offerService = new OfferService();

    private OfferService(){
    }

    public static OfferService getOfferService(){return offerService;}

    @Override
    public Offer save(Offer offer) throws Exception {
        try (CRUDRepository<Offer, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.insert(offer);
        }
    }

    @Override
    public Offer delete(Long id) throws Exception {
        try (CRUDRepository<Offer, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.delete(Offer.class,id);
        }
    }

    @Override
    public Offer update(Offer offer) throws Exception {
        try (CRUDRepository<Offer, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.update(offer);
        }
    }

    @Override
    public List<Offer> findAll() throws Exception {
        try (CRUDRepository<Offer , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectAll(Offer.class);
        }
    }

    @Override
    public Offer findById(Long id) throws Exception {
        try (CRUDRepository<Offer , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectById(Offer.class , id);
        }
    }

    public Offer findByOfferPrice(int price) throws Exception {
        try (CRUDRepository<Offer, Long> crudRepository = new CRUDRepository<>()) {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("price", price);
            List<Offer> offerList = crudRepository.executeQuery("Offer.findByOfferPrice", paramMap);
            return (offerList!=null)?offerList.get(0):null;
        }
    }
}
