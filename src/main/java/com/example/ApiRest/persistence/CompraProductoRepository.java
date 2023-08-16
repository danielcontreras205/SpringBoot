/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.persistence;

import com.example.ApiRest.domain.BuyProduct;
import com.example.ApiRest.domain.BuyProducyPK;
import com.example.ApiRest.domain.repository.BuyProductRepository;
import com.example.ApiRest.persistence.crud.BuyProductCrudRepository;
import com.example.ApiRest.persistence.entity.ComprasProducto;
import com.example.ApiRest.persistence.mapper.BuyProductMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AsRock
 */
@Repository
public class CompraProductoRepository implements BuyProductRepository{
    
    @Autowired
    private BuyProductCrudRepository buyProductCrudRepository;
    
    @Autowired
    private BuyProductMapper mapper;
    
    @Override
    public List<BuyProduct> getAll() {
        List<ComprasProducto> comprasProducto = (List)this.buyProductCrudRepository.findAll();
        return this.mapper.toBuyProducts(comprasProducto);
    }

    @Override
    public BuyProduct save(BuyProduct buyProduct) {
        ComprasProducto comprasProducto = mapper.toCompraProducto(buyProduct);
        return mapper.toBuyProduct(buyProductCrudRepository.save(comprasProducto));
    }

    @Override
    public BuyProduct BuscarProductoCompra(int buyId, int productId) {
        ComprasProducto comprasProducto = buyProductCrudRepository.BuscarProductoCompra(buyId, productId);
        return this.mapper.toBuyProduct(comprasProducto);
    }
    
    @Override
    public List<BuyProduct> searchNativo(int buyId) {
        List<ComprasProducto> buys = buyProductCrudRepository.searchNativo(buyId);
        return this.mapper.toBuyProducts(buys);
    }

    @Override
    public BuyProduct update(BuyProduct buyProduct) {
        ComprasProducto comprasProducto = mapper.toCompraProducto(buyProduct);
        return mapper.toBuyProduct(buyProductCrudRepository.save(comprasProducto));
    }

}
