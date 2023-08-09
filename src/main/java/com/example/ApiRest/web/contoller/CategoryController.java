/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.web.contoller;

import com.example.ApiRest.domain.Category;
import com.example.ApiRest.domain.service.CategoriaService;
import java.lang.annotation.Documented;
import java.util.List;
import java.util.Optional;
import javax.management.DescriptorKey;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author AsRock
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoriaService categoriaService;
    
    @PostMapping("/saveCategory")
    public ResponseEntity<Category> save(@RequestBody Category category) {
        return new ResponseEntity<>(categoriaService.save(category), HttpStatus.CREATED);
    }
    @GetMapping("/allCategory")
    public ResponseEntity<List<Category>> getAll() {
        return new ResponseEntity<>(categoriaService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/CategoryId/{id}")
    public ResponseEntity<Optional<Category>> getCategoryId(@PathVariable("id") int categoryId) {
        return new ResponseEntity<>(categoriaService.getCategory(categoryId), HttpStatus.OK);
    }
    @DeleteMapping("/DeleteCategory")
    
    public ResponseEntity<Boolean> DeleteCategory(@RequestBody Category category) {
        return new ResponseEntity<>(categoriaService.delete(category.getCategoryId()), HttpStatus.CREATED);
    }
    @DeleteMapping("/DeleteCategory/{id}")
    public ResponseEntity<Boolean>DeleteCategoryId(@PathVariable("id") int categoryId){
        ResponseEntity<Boolean> ObjetoRespuesta = new ResponseEntity<>(categoriaService.delete(categoryId), HttpStatus.CREATED);
        return ObjetoRespuesta;
    }
    @PutMapping("/UpdateCategory")
    public ResponseEntity<Category> Update(@RequestBody Category category){
        return new ResponseEntity<>(categoriaService.update(category), HttpStatus.CREATED);
    }
}
