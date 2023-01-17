package com.mhn.storewebappjakartaee.model.service;

import com.mhn.storewebappjakartaee.model.entity.User;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.base.ServiceImpl;

import java.util.List;


public class UserService extends ServiceImpl<User, Long> {
    private static final UserService userService = new UserService();

    private UserService() {
    }

    public static UserService getUserService() {
        return userService;
    }

    @Override
    public User save(User user) throws Exception {
        try (CRUDRepository<User,Long> crudRepository = new CRUDRepository<>()) {
            return crudRepository.insert(user);
        }
    }

    @Override
    public User update(User user) throws Exception {
        try (CRUDRepository<User,Long> crudRepository = new CRUDRepository<>()) {
            return crudRepository.update(user);
        }
    }

    @Override
    public User delete(Long id) throws Exception {
        try (CRUDRepository<User,Long> crudRepository = new CRUDRepository<>()) {
            return crudRepository.delete(User.class , id);
        }
    }

    @Override
    public User findById(Long id) throws Exception {
        try (CRUDRepository<User,Long> crudRepository = new CRUDRepository<>()) {
            return crudRepository.selectById(User.class , id);
        }
    }

    @Override
    public List<User> findAll() throws Exception {
        try (CRUDRepository<User,Long> crudRepository = new CRUDRepository<>()) {
            return crudRepository.selectAll(User.class);
        }
    }

    public User findByUsernameAndPassword(String username, String password) throws Exception {
        try (CRUDRepository<User, Long> crudRepository = new CRUDRepository<>()) {
            return crudRepository.findByUsernameAndPassword(User.class, username, password);
        }
    }


}
