package com.mhn.storewebappjakartaee.model.service;

import com.mhn.storewebappjakartaee.model.entity.Comment;
import com.mhn.storewebappjakartaee.model.entity.Offer;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.base.ServiceImpl;

import java.util.List;

public class OfferService extends ServiceImpl<Offer , Long> {
    private static final OfferService offerService = new OfferService();

    private OfferService(){
    }

    public static OfferService getOfferService(){return getOfferService();}

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
}
