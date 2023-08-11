/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.web.contoller;

import com.example.ApiRest.domain.Customer;
import com.example.ApiRest.domain.service.ClienteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    
    @GetMapping("/GetCostumerId/{id}")
    public ResponseEntity<Optional<Customer>> getCustumer(@PathVariable("id") int custumerId){
        return new ResponseEntity<>(clienteService.getCustomer(custumerId), HttpStatus.OK);
    }
    
    @DeleteMapping("/DeleteCustumer/{id}")
    public ResponseEntity<Boolean> deleteCustumer(@PathVariable("id") int custumerId){
        ResponseEntity<Boolean> ObjetoRespuesta = new ResponseEntity<>(clienteService.delete(custumerId), HttpStatus.CREATED);
        return  ObjetoRespuesta;
    }
    
    @PutMapping("/UpdateCustumer/{id}")
    public ResponseEntity<Customer> UpdateCustumer(@PathVariable("id") int custumerId, @RequestBody Customer customer){
        customer.setCustomerId(custumerId);
        return new ResponseEntity<>(clienteService.updateCustumer(customer), HttpStatus.CREATED);
    }
}
