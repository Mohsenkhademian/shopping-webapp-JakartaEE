package com.mhn.storewebappjakartaee.model.service;

import com.mhn.storewebappjakartaee.model.entity.Admin;
import com.mhn.storewebappjakartaee.model.entity.PaymentTransaction;
import com.mhn.storewebappjakartaee.model.entity.Storage;
import com.mhn.storewebappjakartaee.model.repository.CRUDRepository;
import com.mhn.storewebappjakartaee.model.service.base.ServiceImpl;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentTransactionService extends ServiceImpl<PaymentTransaction , Long> {
    private static final PaymentTransactionService paymentTransactionService = new PaymentTransactionService();

    private PaymentTransactionService(){
    }

    public static PaymentTransactionService getPaymentTransactionService(){return paymentTransactionService;}

    @Override
    public PaymentTransaction save(PaymentTransaction paymentTransaction) throws Exception {
        try (CRUDRepository<PaymentTransaction, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.insert(paymentTransaction);
        }
    }

    @Override
    public PaymentTransaction delete(Long id) throws Exception {
        try (CRUDRepository<PaymentTransaction, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.delete(PaymentTransaction.class,id);
        }
    }

    @Override
    public PaymentTransaction update(PaymentTransaction paymentTransaction) throws Exception {
        try (CRUDRepository<PaymentTransaction, Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.update(paymentTransaction);
        }
    }

    @Override
    public List<PaymentTransaction> findAll() throws Exception {
        try (CRUDRepository<PaymentTransaction , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectAll(PaymentTransaction.class);
        }
    }

    @Override
    public PaymentTransaction findById(Long id) throws Exception {
        try (CRUDRepository<PaymentTransaction , Long> crudRepository = new CRUDRepository<>()){
            return crudRepository.selectById(PaymentTransaction.class , id);
        }
    }

    public PaymentTransaction findByPaymentTransactionTransactionTime(LocalDateTime transactionDateTime) throws Exception {
        try (CRUDRepository<PaymentTransaction, Long> crudRepository = new CRUDRepository<>()) {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("transactionDateTime", transactionDateTime);
            List<PaymentTransaction> paymentTransactionList = crudRepository.executeQuery("PaymentTransaction.findByPaymentTransactionTransactionTime", paramMap);
            return (paymentTransactionList!=null)?paymentTransactionList.get(0):null;
        }
    }
}
