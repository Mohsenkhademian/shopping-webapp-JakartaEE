package com.mhn.storewebappjakartaee.model.service;

import com.mhn.storewebappjakartaee.model.entity.Admin;
import com.mhn.storewebappjakartaee.model.entity.User;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.base.ServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminService extends ServiceImpl<Admin , Long> {
    private static final AdminService adminService = new AdminService();

    private AdminService(){
    }

    public static AdminService getAdminService(){return adminService; }

    @Override
    public Admin save(Admin admin) throws Exception {
        try (CRUDRepository<Admin , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.insert(admin);
        }
    }

    @Override
    public Admin delete(Long id) throws Exception {
        try (CRUDRepository<Admin , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.delete(Admin.class , id);
        }
    }

    @Override
    public Admin update(Admin admin) throws Exception {
        try (CRUDRepository<Admin , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.update(admin);
        }
    }

    @Override
    public List<Admin> findAll() throws Exception {
        try (CRUDRepository<Admin , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectAll(Admin.class);
        }
    }

    @Override
    public Admin findById(Long id) throws Exception {
        try (CRUDRepository<Admin , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectById(Admin.class , id);
        }
    }

    public Admin findByUserName(String userName) throws Exception {
        try (CRUDRepository<Admin, Long> crudRepository = new CRUDRepository<>()) {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("userName", userName);
            List<Admin> adminList = crudRepository.executeQuery("Admin.findByUserName", paramMap);
            return (adminList!=null)?adminList.get(0):null;
        }
    }

   /* public Admin findByItemName(String name) throws Exception {
        try (CRUDRepository<Admin, Long> crudRepository = new CRUDRepository<>()) {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("name", name);
            List<Admin> adminList = crudRepository.executeQuery("Admin.findByItemName", paramMap);
            return (adminList!=null)?adminList.get(0):null;
        }
    }*/
}
