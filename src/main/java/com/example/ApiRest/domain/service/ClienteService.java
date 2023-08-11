/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.domain.service;

import com.example.ApiRest.domain.Customer;
import com.example.ApiRest.domain.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author danielfcontreras
 */
@Service
public class ClienteService {
    @Autowired
    private  CustomerRepository customerRepository;
    
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }
    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }
    public Optional<Customer> getCustomer(int customerId){
        return customerRepository.getCustomer(customerId);
    }
    public boolean delete(int customerId){
        return getCustomer(customerId).map(product -> {
            customerRepository.delete(customerId);
            return true;
        }).orElse(false);
    }
    public Customer updateCustumer(Customer customer){
        return customerRepository.update(customer);
    }
}
