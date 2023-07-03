/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.web.contoller;

import com.example.ApiRest.domain.Customer;
import com.example.ApiRest.domain.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private ClienteService clienteService;
    
    @PostMapping("/saveCustomer")
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {
        return new ResponseEntity<>(clienteService.save(customer), HttpStatus.CREATED);
    }
    @GetMapping("/allCustomer")
    public ResponseEntity<List<Customer>> getAll() {
        return new ResponseEntity<>(clienteService.getAll(), HttpStatus.OK);
    }
}
