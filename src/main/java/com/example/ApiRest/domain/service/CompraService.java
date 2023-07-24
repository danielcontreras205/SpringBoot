/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.domain.service;

import com.example.ApiRest.domain.Buy;
import com.example.ApiRest.domain.repository.BuyRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author danielfcontreras
 */
@Service
public class CompraService {
    @Autowired
    private  BuyRepository buyRepository;
    
    public List<Buy> getAll() {
        return buyRepository.getAll();
    }
    public Buy save(Buy buy){
        return buyRepository.save(buy);
    }
    public Optional<Buy> getCustomer(int buyId){
        return buyRepository.getCustomer(buyId);
    }
    public boolean delete(int buyId){
        return getCustomer(buyId).map(product -> {
            buyRepository.delete(buyId);
            return true;
        }).orElse(false);
    }
}
