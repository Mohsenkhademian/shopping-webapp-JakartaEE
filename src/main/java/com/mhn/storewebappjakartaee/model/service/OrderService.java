package com.mhn.storewebappjakartaee.model.service;

import com.mhn.storewebappjakartaee.model.entity.Delivery;
import com.mhn.storewebappjakartaee.model.entity.Order;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.base.ServiceImpl;

import java.util.List;

public class OrderService extends ServiceImpl<Order, Long> {
    private static final OrderService orderService = new OrderService();

    private OrderService(){
    }

    public static OrderService getOrderService(){return getOrderService();}

    @Override
    public Order save(Order order) throws Exception {
        try (CRUDRepository<Order, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.insert(order);
        }
    }

    @Override
    public Order delete(Long id) throws Exception {
        try (CRUDRepository<Order, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.delete(Order.class,id);
        }
    }

    @Override
    public Order update(Order order) throws Exception {
        try (CRUDRepository<Order, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.update(order);
        }
    }

    @Override
    public List<Order> findAll() throws Exception {
        try (CRUDRepository<Order , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectAll(Order.class);
        }
    }

    @Override
    public Order findById(Long id) throws Exception {
        try (CRUDRepository<Order , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectById(Order.class , id);
        }
    }
}
