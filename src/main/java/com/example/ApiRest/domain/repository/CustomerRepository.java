package com.example.ApiRest.domain.repository;

import com.example.ApiRest.domain.dto.Customer;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    List<Customer> getAll();
    
    Customer save(Customer customer);
    
    void delete(int customerId);
    
    Optional<Customer> getCustomer(int customerId);
    
    Customer update(Customer customer);
}
