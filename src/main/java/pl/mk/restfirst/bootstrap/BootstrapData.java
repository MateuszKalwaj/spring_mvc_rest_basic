package pl.mk.restfirst.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.mk.restfirst.domain.Customer;
import pl.mk.restfirst.repositories.CustomerRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootstrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Customer data");

        Customer c1 = new Customer();
        c1.setFirstname("Maciej");
        c1.setLastname("Nowak");
        customerRepository.save(c1); //saving data using spring data repository interface

        Customer c2 = new Customer();
        c2.setFirstname("Jan");
        c2.setLastname("Kowalski");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstname("Anna");
        c3.setLastname("Kowalska");
        customerRepository.save(c3);

        System.out.println("Customers saved: " +customerRepository.count());

    }
}
