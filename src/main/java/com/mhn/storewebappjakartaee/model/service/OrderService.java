package com.mhn.storewebappjakartaee.model.service;

import com.mhn.storewebappjakartaee.model.entity.Admin;
import com.mhn.storewebappjakartaee.model.entity.Order;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.base.ServiceImpl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService extends ServiceImpl<Order, Long> {
    private static final OrderService orderService = new OrderService();

    private OrderService(){
    }

    public static OrderService getOrderService(){return orderService;}

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

    public Order findByOrderDate(LocalDate orderDate) throws Exception {
        try (CRUDRepository<Order, Long> crudRepository = new CRUDRepository<>()) {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("orderDate", orderDate);
            List<Order> orderList = crudRepository.executeQuery("Order.findByOrderDate", paramMap);
            return (orderList!=null)?orderList.get(0):null;
        }
    }
}
