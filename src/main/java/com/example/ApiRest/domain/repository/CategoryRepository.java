/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ApiRest.domain.repository;

import com.example.ApiRest.domain.dto.Category;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author AsRock
 */
public interface CategoryRepository {
    List<Category> getAll();
    
    Category save(Category category);
    
    void delete(int categoryId);
    
    Category update(Category category);
    
    Optional<Category> getCategory(int categoryId);
}
