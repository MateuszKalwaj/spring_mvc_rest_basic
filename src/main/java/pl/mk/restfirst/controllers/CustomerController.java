package pl.mk.restfirst.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
