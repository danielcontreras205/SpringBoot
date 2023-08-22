/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.domain.service;

import com.example.ApiRest.domain.dto.BuyProduct;
import com.example.ApiRest.domain.repository.BuyProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author AsRock
 */
@Service
public class CompraProductoService {
    @Autowired
    private  BuyProductRepository buyProductRepository;
    
    
    public List<BuyProduct> getAll() {
        return buyProductRepository.getAll();
    }
    public BuyProduct save(BuyProduct buyProduct){
        return buyProductRepository.save(buyProduct);
    }
    public List<BuyProduct> BuscarProductosCompra(int buyId) {
        return buyProductRepository.BuscarProductosCompra(buyId);
    }
    public BuyProduct searchNativo(int buyId, int productId){
        return buyProductRepository.searchNativo(buyId,productId);
    }
    public BuyProduct updateCustumer(BuyProduct buyProduct){
        return buyProductRepository.update(buyProduct);
    }
    public Boolean Delete(BuyProduct buyProduct){
        return buyProductRepository.delete(buyProduct.getPrimariKey().getBuyId(), buyProduct.getPrimariKey().getProductId());
    }
}
