/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ApiRest.domain.repository;

import com.example.ApiRest.dto.BuyProduct;
import com.example.ApiRest.dto.BuyProducyPK;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author AsRock
 */
public interface BuyProductRepository {
    List<BuyProduct> getAll();
    
    BuyProduct save(BuyProduct buyProduct);
    
    BuyProduct BuscarProductoCompra(int buyId, int productId);
    
    List<BuyProduct> searchNativo(int customerId);
    
    BuyProduct update(BuyProduct buyProduct);
}
