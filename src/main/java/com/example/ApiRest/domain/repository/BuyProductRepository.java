/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ApiRest.domain.repository;

import com.example.ApiRest.domain.dto.BuyProduct;
import com.example.ApiRest.domain.dto.BuyProducyPK;
import com.example.ApiRest.persistence.entity.ComprasProducto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author AsRock
 */
public interface BuyProductRepository {
    List<BuyProduct> getAll();
    
    BuyProduct save(BuyProduct buyProduct);
    
    List<BuyProduct> BuscarProductosCompra(int buyId);
    
    BuyProduct searchNativo(int buyId, int productId);
    
    BuyProduct update(BuyProduct buyProduct);
}
