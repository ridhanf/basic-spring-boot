package com.fadhil.basicspringboot.repository;

import com.fadhil.basicspringboot.model.Customer;           // Import our Customer model
import org.springframework.data.repository.CrudRepository;  // CrudRepository from Spring Framework

public interface CustomerRepo extends CrudRepository<Customer, Long> {  // Customer Repo use interface and inherit from CrudRepository
    Iterable<Customer> findCustomerByName(String name);
}
