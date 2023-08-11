/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.persistence.crud;

import com.example.ApiRest.persistence.entity.Compra;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author AsRock
 */
public interface BuyCrudRepository extends CrudRepository<Compra,Integer>{
    //List<Compra> findByIdCompraOrderByIdClienteAsc(int idCompra);
}
