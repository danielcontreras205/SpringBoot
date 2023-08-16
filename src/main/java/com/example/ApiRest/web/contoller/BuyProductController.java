/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.web.contoller;

import com.example.ApiRest.domain.*;
import com.example.ApiRest.domain.service.CompraProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author AsRock
 */
@RestController
@RequestMapping("/BuysProduct")
public class BuyProductController {
    @Autowired
    private CompraProductoService service;
    
    @GetMapping("/all")
    public ResponseEntity<List<BuyProduct>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    
    @PostMapping("/save")
    public ResponseEntity<BuyProduct> save(@RequestBody BuyProduct buyProduct) {
        return new ResponseEntity<>(service.save(buyProduct), HttpStatus.CREATED);
    }
}
