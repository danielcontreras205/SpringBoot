/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ApiRest.persistence.crud;

import com.example.ApiRest.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author AsRock
 */
public interface CategoryCrudRepository extends CrudRepository<Categoria,Integer>{
    
}
