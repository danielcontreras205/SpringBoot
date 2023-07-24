/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.domain.repository;

import com.example.ApiRest.domain.Buy;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author danielfcontreras
 */
public interface BuyRepository {
    List<Buy> getAll();
    
    Buy save(Buy buy);
    
    Optional<Buy> getCustomer(int buyId);
    
    void delete(int buyId);
    
}
