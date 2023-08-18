/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.persistence;

import com.example.ApiRest.dto.Product;
import com.example.ApiRest.domain.repository.ProducRepository;
import com.example.ApiRest.persistence.crud.ProductCrudRepository;
import com.example.ApiRest.persistence.entity.Producto;
import com.example.ApiRest.persistence.mapper.ProductMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author danielfcontreras
 */
@Repository
public class ProductoRepository implements ProducRepository{
    @Autowired
    private ProductCrudRepository productCrudRepository;
    
    @Autowired
    private ProductMapper mapper;
    
    public ProductoRepository() {
    }
    
    @Override
    public List<Product> getAll() {
        List<Producto> products = (List)this.productCrudRepository.findAll();
        return this.mapper.toProducts(products);
    }

  
    @Override
    public Optional<List<Product>> getByScarseProduct(int quantity) {
        Optional<List<Producto>> productos = productCrudRepository.findByCantidadStockLessThanAndEstado(quantity, true);
        return productos.map(prods -> mapper.toProducts(prods));
    }

    @Override
    public Optional<Product> getProduct(int productId) {
        return productCrudRepository.findById(productId).map(producto -> mapper.toProduct(producto));
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productCrudRepository.save(producto));
    }

    @Override
    public void delete(int productId) {
        productCrudRepository.deleteById(productId);
    }
    
    
    
}
