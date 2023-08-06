/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.domain.service;

import com.example.ApiRest.domain.Category;
import com.example.ApiRest.domain.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author AsRock
 */
@Service
public class CategoriaService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }
    public Category save(Category category){
        return categoryRepository.save(category);
    }
    public Optional<Category> getCategory(int categoryId){
        return categoryRepository.getCategory(categoryId);
    }
    public boolean delete(int categoryId){
        return getCategory(categoryId).map(category -> {
            categoryRepository.delete(categoryId);
            return true;
        }).orElse(false);
    }
}
