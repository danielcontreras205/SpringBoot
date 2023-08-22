/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.web.contoller;

import com.example.ApiRest.domain.dto.BuyProduct;
import com.example.ApiRest.domain.dto.BuyProducyPK;
import com.example.ApiRest.domain.service.CompraProductoService;
import io.swagger.v3.oas.annotations.Parameters;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    
    @GetMapping("/BuscarProductosCompra/{id}")
    public ResponseEntity<List<BuyProduct>> BuscarProductosCompra(@PathVariable("id")int byuId) {
        return new ResponseEntity<>(service.BuscarProductosCompra(byuId), HttpStatus.OK);
    }
    
    @PutMapping("/UpdateBuyProduct")
    public ResponseEntity<BuyProduct> UpdateBuyProduct(@RequestBody BuyProduct buyProduct){
        return new ResponseEntity<>(service.updateCustumer(buyProduct),HttpStatus.CREATED);
    }
    @DeleteMapping("/DeleteBuyProduct")
    public ResponseEntity<Boolean> DeleteBuyProduct(@RequestBody BuyProduct buyProduct){
        return new ResponseEntity<>(service.Delete(buyProduct),HttpStatus.CREATED);
    }
}
