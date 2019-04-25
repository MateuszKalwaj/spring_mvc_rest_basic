package pl.mk.restfirst.services;

import pl.mk.restfirst.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();
}
