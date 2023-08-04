/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.web.contoller;

import com.example.ApiRest.domain.Buy;
import com.example.ApiRest.domain.service.CompraService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buys")
public class BuyController {
    @Autowired
    private CompraService service;
    
    @GetMapping("/all")
    public ResponseEntity<List<Buy>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
