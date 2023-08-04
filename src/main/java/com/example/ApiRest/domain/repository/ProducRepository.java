/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.domain.repository;

import com.example.ApiRest.domain.Product;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author danielfcontreras
 */
public interface ProducRepository {
    
    List<Product> getAll();
    
    
    Optional<List<Product>> getByScarseProduct(int quantity);
    
    Optional<Product> getProduct(int productId);
    
    Product save(Product product);
    
    void delete(int productId);
}
