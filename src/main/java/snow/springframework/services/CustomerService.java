package snow.springframework.services;

import org.springframework.stereotype.Service;
import snow.springframework.domain.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> listAllCustomer();
    Customer getCustomerById(Integer id);
    Customer saveOrUpdateCustomer(Customer customer);
    void deleteCustomer(Integer id);
}
