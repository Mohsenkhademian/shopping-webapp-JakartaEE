package com.mhn.storewebappjakartaee.model.service;

import com.mhn.storewebappjakartaee.model.entity.Customer;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.base.ServiceImpl;

import java.util.List;

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
}
