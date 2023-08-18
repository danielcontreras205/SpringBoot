/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.persistence;

import com.example.ApiRest.dto.Customer;
import com.example.ApiRest.domain.repository.CustomerRepository;
import com.example.ApiRest.persistence.crud.CustomerCrudRepository;
import com.example.ApiRest.persistence.entity.Cliente;
import com.example.ApiRest.persistence.mapper.CustomerMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author danielfcontreras
 */
@Repository
public class ClienteRepository implements CustomerRepository{
    
    @Autowired
    private CustomerCrudRepository customerCrudRepository;
    
    @Autowired
    private CustomerMapper mapper;

    @Override
    public List<Customer> getAll() {
        List<Cliente> cliente = (List)this.customerCrudRepository.findAll();
        return this.mapper.toCustomers(cliente);
    }

    @Override
    public Customer save(Customer customer) {
        Cliente cliente = mapper.toCliente(customer);
        return mapper.toCustomer(customerCrudRepository.save(cliente));
    }

    @Override
    public void delete(int customerId) {
        customerCrudRepository.deleteById(customerId);
    }

    @Override
    public Optional<Customer> getCustomer(int customerId) {
        return customerCrudRepository.findById(customerId).map(cliente -> mapper.toCustomer(cliente));
    }

    @Override
    public Customer update(Customer customer) {
        Cliente cliente = mapper.toCliente(customer);
        return mapper.toCustomer(customerCrudRepository.save(cliente));
    }
    
}
