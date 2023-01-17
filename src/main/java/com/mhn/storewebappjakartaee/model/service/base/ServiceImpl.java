package com.mhn.storewebappjakartaee.model.service.base;


import java.util.List;


public abstract class ServiceImpl <T, ID>{
    public abstract T save(T t) throws Exception;

    public abstract T delete(ID id) throws Exception;

    public abstract T update(T t) throws Exception;

    public abstract List<T> findAll() throws Exception;

    public abstract T findById(ID id) throws Exception;

//    public abstract T findByUsernameAndPassword(String username , String password) throws Exception;

}
