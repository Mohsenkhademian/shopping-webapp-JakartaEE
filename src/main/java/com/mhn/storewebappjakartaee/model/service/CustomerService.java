package com.mhn.storewebappjakartaee.model.service;

import com.mhn.storewebappjakartaee.model.entity.Admin;
import com.mhn.storewebappjakartaee.model.entity.Customer;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.base.ServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService extends ServiceImpl<Customer, Long> {
    private static final CustomerService customerService = new CustomerService();

    private CustomerService(){
    }

    public static CustomerService getCustomerService(){return customerService;}

    @Override
    public Customer save(Customer customer) throws Exception {
        try (CRUDRepository<Customer, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.insert(customer);
        }
    }

    @Override
    public Customer delete(Long id) throws Exception {
        try (CRUDRepository<Customer, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.delete(Customer.class,id);
        }
    }

    @Override
    public Customer update(Customer customer) throws Exception {
        try (CRUDRepository<Customer, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.update(customer);
        }
    }

    @Override
    public List<Customer> findAll() throws Exception {
        try (CRUDRepository<Customer , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectAll(Customer.class);
        }
    }

    @Override
    public Customer findById(Long id) throws Exception {
        try (CRUDRepository<Customer , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectById(Customer.class , id);
        }
    }

    public Customer findByCustomerName(String name) throws Exception {
        try (CRUDRepository<Customer, Long> crudRepository = new CRUDRepository<>()) {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("name", name);
            List<Customer> customerList = crudRepository.executeQuery("Customer.findByCustomerName", paramMap);
            return (customerList!=null)?customerList.get(0):null;
        }
    }
}
