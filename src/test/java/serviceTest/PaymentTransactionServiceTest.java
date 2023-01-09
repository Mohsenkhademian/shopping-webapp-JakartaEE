package serviceTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;

import com.mhn.storewebappjakartaee.model.entity.Item;
import org.junit.jupiter.api.Test;

import com.mhn.storewebappjakartaee.model.entity.Customer;
import com.mhn.storewebappjakartaee.model.entity.Order;
import com.mhn.storewebappjakartaee.model.entity.PaymentTransaction;
import com.mhn.storewebappjakartaee.model.service.PaymentTransactionService;


public class PaymentTransactionServiceTest {

   /* private PaymentTransactionService paymentTransactionService = PaymentTransactionService.getPaymentTransactionService();

    @Test
    void testSave()throws Exception{
        PaymentTransaction paymentTransaction = PaymentTransaction.builder()
                .amount(200.0)
                .transactionTime(LocalDate.now())
                .customer(new Customer("mohsen","mohsen123"))
                .order(new Order(1L,"mohsen","Tehran",LocalDate.now(),Arrays.asList(
                        new Item(2L,7L,9L,"LapTop","ASUSX550D",90000000),
                        new Item(1L,2L,3L,"Phone","IPhoneX",140000000)))
                )
                .build();
        PaymentTransaction savePaymentTransaction = paymentTransactionService.save(paymentTransaction);
        assertEquals(200.0,savePaymentTransaction.getAmount());*/


}
