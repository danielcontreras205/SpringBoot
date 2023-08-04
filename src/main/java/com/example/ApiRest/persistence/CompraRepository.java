/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.persistence;

import com.example.ApiRest.domain.Buy;
import com.example.ApiRest.domain.repository.BuyRepository;
import com.example.ApiRest.persistence.crud.BuyCrudRepository;
import com.example.ApiRest.persistence.entity.Compra;
import com.example.ApiRest.persistence.mapper.BuyMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author danielfcontreras
 */
@Repository
public class CompraRepository implements BuyRepository{
    @Autowired
    private BuyCrudRepository BuyCrudRepository;
    
    @Autowired
    private BuyMapper mapper;

    public CompraRepository() {
    }
    
    @Override
    public List<Buy> getAll() {
        List<Compra> buys = (List)this.BuyCrudRepository.findAll();
        return this.mapper.toBuy(buys);
    }

    @Override
    public Buy save(Buy buy) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Buy> getBuy(int buyId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int buyId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
        




