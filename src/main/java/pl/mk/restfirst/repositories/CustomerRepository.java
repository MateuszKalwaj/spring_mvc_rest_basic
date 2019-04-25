package pl.mk.restfirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mk.restfirst.domain.Customer;

//JpaRepository provides toolset for working with JPA entities
public interface CustomerRepository extends JpaRepository <Customer, Long> {
}
