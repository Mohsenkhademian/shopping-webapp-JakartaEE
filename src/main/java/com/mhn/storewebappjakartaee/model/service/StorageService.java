package com.mhn.storewebappjakartaee.model.service;

import com.mhn.storewebappjakartaee.model.entity.Customer;
import com.mhn.storewebappjakartaee.model.entity.Storage;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.base.ServiceImpl;

import java.util.List;

public class StorageService extends ServiceImpl<Storage , Long> {
    private static final StorageService srorageService = new StorageService();

    private StorageService(){
    }

    public static StorageService getStorageService(){return srorageService;}


    @Override
    public Storage save(Storage storage) throws Exception {
        try (CRUDRepository<Storage, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.insert(storage);
        }
    }

    @Override
    public Storage delete(Long id) throws Exception {
        try (CRUDRepository<Storage, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.delete(Storage.class,id);
        }
    }

    @Override
    public Storage update(Storage storage) throws Exception {
        try (CRUDRepository<Storage, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.update(storage);
        }
    }

    @Override
    public List<Storage> findAll() throws Exception {
        try (CRUDRepository<Storage , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectAll(Storage.class);
        }
    }

    @Override
    public Storage findById(Long id) throws Exception {
        try (CRUDRepository<Storage , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectById(Storage.class , id);
        }
    }
}
