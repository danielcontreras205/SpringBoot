/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.persistence;

import com.example.ApiRest.domain.dto.Buy;
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
    private BuyCrudRepository buyCrudRepository;
    
    @Autowired
    private BuyMapper mapper;

    public CompraRepository() {
    }
    
    @Override
    public List<Buy> getAll() {
        List<Compra> buys = (List)this.buyCrudRepository.findAll();
        return this.mapper.toBuy(buys);
    }

    @Override
    public Buy save(Buy buy) {
        Compra compra = mapper.toCompra(buy);
        return mapper.toBuy(buyCrudRepository.save(compra));
    }

    @Override
    public Optional<Buy> getBuy(int buyId) {
        return buyCrudRepository.findById(buyId).map(compras -> mapper.toBuy(compras));
    }

    @Override
    public void delete(int buyId) {
        buyCrudRepository.deleteById(buyId);
    }

    @Override
    public Buy update(Buy buy) {
        Compra compra = mapper.toCompra(buy);
        return mapper.toBuy(buyCrudRepository.save(compra));
    }

    @Override
    public List<Buy> search(int customerId) {
        List<Compra> buys = buyCrudRepository.search(customerId);
        return this.mapper.toBuy(buys);
    }

    @Override
    public List<Buy> searchNativo(int customerId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
        




