package serviceTest;

import static org.junit.jupiter.api.Assertions.*;

import com.mhn.storewebappjakartaee.model.entity.Comment;
import com.mhn.storewebappjakartaee.model.entity.Customer;
import com.mhn.storewebappjakartaee.model.service.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CustomerServiceTest {
    private CustomerService customerService;

    @BeforeEach
    void setUp() throws Exception {
        customerService = CustomerService.getCustomerService();
    }

    @Test
    void saveTest() throws Exception {
        Customer customer = Customer.builder().name("Mohsen").email("mohsen@gmail.com").build();
        Customer savedCustomer = customerService.save(customer);
        assertNotNull(savedCustomer.getId());
        assertEquals(customer.getName(), savedCustomer.getName());
    }

    @Test
    void updateTest() throws Exception {
        Customer customer = Customer.builder().name("Mohsen").email("mohsen@gmail.com").build();
        Customer savedCustomer = customerService.save(customer);
        assertNotNull(savedCustomer.getId());

        savedCustomer.setName("Ali");
        savedCustomer.setId(2L);
        customerService.update(customer);
        Customer updateCustomer = customerService.findById(savedCustomer.getId());
        assertEquals(savedCustomer.getId(), updateCustomer.getId());
    }

    @Test
    void deleteTest() throws Exception {
        Customer customer = Customer.builder().name("Mamad").email("mamad@gmail.com").build();
        Customer savedCustomer = customerService.save(customer);
        assertNotNull(savedCustomer.getId());
        customerService.delete(savedCustomer.getId());
        Customer deleteCustomer = customerService.findById(savedCustomer.getId());
        assertNull(deleteCustomer);
    }

    @Test
    void findByIdTest() throws Exception {
        Customer customer = Customer.builder().name("Mamad").email("mamad@gmail.com").build();
        Customer savedCustomer = customerService.save(customer);
        assertNotNull(savedCustomer.getId());
        Customer findCustomer = customerService.findById(savedCustomer.getId());
        assertEquals(savedCustomer.getId(), findCustomer.getId());
        assertEquals(savedCustomer.getName(), findCustomer.getName());
    }

    @Test
    void findAllTest() throws Exception {
        Customer customer1 = Customer.builder().name("Mamad").email("mamad@gmail.com").build();
        customerService.save(customer1);
        Customer customer2 = Customer.builder().name("Ali").email("ali@gmail.com").build();
        customerService.save(customer2);
        List<Customer> customerList = customerService.findAll();
        assertEquals(2, customerList.size());
        assertTrue(customerList.stream().anyMatch(c -> c.getName().equals(customer1.getName())));
        assertTrue(customerList.stream().anyMatch(c -> c.getEmail().equals(customer2.getEmail())));

    }
}
