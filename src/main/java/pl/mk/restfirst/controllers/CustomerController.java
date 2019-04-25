package pl.mk.restfirst.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.mk.restfirst.domain.Customer;
import pl.mk.restfirst.services.CustomerService;

import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL) //using this guarantee that with "/rest/customers" we'll invoke methods below
public class CustomerController {

    public static final String BASE_URL = "/rest/customers";

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getAllCustomers() {
        return  customerService.findAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById (@PathVariable Long id) {
        return customerService.findCustomerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer) { //without @RequestBody object would be empty
        return customerService.saveCustomer(customer);
    }
}
