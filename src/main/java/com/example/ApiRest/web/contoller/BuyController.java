/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.web.contoller;

import com.example.ApiRest.domain.Buy;
import com.example.ApiRest.domain.service.CompraService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buys")
public class BuyController {
    @Autowired
    private CompraService service;
    
    @GetMapping("/all")
    public ResponseEntity<List<Buy>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
    
    @PostMapping("/save")
    public ResponseEntity<Buy> save(@RequestBody Buy buy) {
        return new ResponseEntity<>(service.save(buy), HttpStatus.CREATED);
    }
    
    @GetMapping("/getBuyId/{id}")
    public ResponseEntity<Optional<Buy>> getBuyId (@PathVariable("id") int buyId){
        return new ResponseEntity<>(service.getBuy(buyId),HttpStatus.OK);
    }
    
    @DeleteMapping("/DeleteBuyId/{id}")
    public ResponseEntity<Boolean>DeleteBuyId(@PathVariable("id") int buyId){
        ResponseEntity<Boolean> ObjetoRespuesta = new ResponseEntity<>(service.delete(buyId),HttpStatus.CREATED);
        return ObjetoRespuesta;
    }
    
    @PutMapping("/UpdateBuy/{id}")
    public ResponseEntity<Buy> UpdateBuy (@PathVariable("id") int buyId,@RequestBody Buy buy){
        buy.setBuyId(buyId);
        return new ResponseEntity<>(service.updateBuy(buy),HttpStatus.CREATED);
    }
    
    @GetMapping("/getSearch/{id}")
    public ResponseEntity<List<Buy>> getSearch(@PathVariable("id") int customerId) {
        return new ResponseEntity<>(service.search(customerId), HttpStatus.OK);
    }
}
