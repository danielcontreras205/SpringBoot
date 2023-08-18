/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.persistence;

import com.example.ApiRest.domain.dto.Category;
import com.example.ApiRest.domain.repository.CategoryRepository;
import com.example.ApiRest.persistence.crud.CategoryCrudRepository;
import com.example.ApiRest.persistence.entity.Categoria;
import com.example.ApiRest.persistence.mapper.CategoryMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author AsRock
 */
@Repository
public class CategoriaRespository implements CategoryRepository{
    
    @Autowired
    private CategoryCrudRepository CategoryCrudRepository;
    
    @Autowired
    private CategoryMapper mapper;
    
    @Override
    public List<Category> getAll() {
        List<Categoria> categorias = (List)this.CategoryCrudRepository.findAll();
        return this.mapper.toCategorys(categorias);
    }

    @Override
    public Category save(Category category) {
        Categoria categoria = mapper.toCategoria(category);
        return mapper.toCategory(CategoryCrudRepository.save(categoria));
    }

    @Override
    public void delete(int categoryId) {
        CategoryCrudRepository.deleteById(categoryId);
    }

    @Override
    public Optional<Category> getCategory(int categoryId) {
        System.out.println("llega aca");
        return CategoryCrudRepository.findById(categoryId).map(categoria -> mapper.toCategory(categoria));
    }

    @Override
    public Category update(Category category) {
        Categoria categoria = mapper.toCategoria(category);
        return mapper.toCategory(CategoryCrudRepository.save(categoria));
    }
}
