/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ApiRest.persistence.crud;

import com.example.ApiRest.persistence.entity.ComprasProducto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author AsRock
 */
public interface BuyProductCrudRepository extends CrudRepository<ComprasProducto,Integer>{
    @Query(
        value = "SELECT * FROM compras_producto WHERE id_compra = :parametro AND id_producto = :parametro2",
        nativeQuery = true    
    )//nativo
    ComprasProducto searchNativo(@Param("parametro")int buyId,@Param("parametro2")int productId);
    
    @Query(
        value = "SELECT * FROM compras_producto WHERE id_compra = :parametro",
        nativeQuery = true    
    )//nativo
    List<ComprasProducto> BuscarProductosCompra(@Param("parametro")int buyId);
    
    @Query(
        value = "DELETE FROM compras_producto WHERE id_compra = :parametro AND id_producto = :parametro2",
        nativeQuery = true    
    )//nativo
    Boolean Delete(@Param("parametro")int buyId,@Param("parametro2")int productId);
}
