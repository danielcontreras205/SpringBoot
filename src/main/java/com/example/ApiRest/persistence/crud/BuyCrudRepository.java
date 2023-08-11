/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.persistence.crud;

import com.example.ApiRest.persistence.entity.Compra;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author AsRock
 */
public interface BuyCrudRepository extends CrudRepository<Compra,Integer>{
    
    @Query(value = "SELECT COMP FROM Compra COMP WHERE COMP.idCompra = :customerId")// JPQL
    List<Compra> search(int customerId);
    
    @Query(
        value = "SELECT * FROM Compras WHERE id_cliente = :filtro",
        nativeQuery = true    
    )//nativo
    List<Compra> searchNativo(@Param("filtro")int customerId);
    
}
