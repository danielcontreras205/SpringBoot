/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.persistence.crud;

import com.example.ApiRest.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author danielfcontreras
 */
//public interface ProductCrudRepository extends CrudRepository<Producto,Integer> {
//public interface ProductCrudRepository extends PagingAndSortingRepository<Producto,Integer> {
//public interface ProductCrudRepository extends JpaRepository<Producto,Integer> {
public interface ProductCrudRepository extends CrudRepository<Producto,Integer> {
    
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int CantidadStock, boolean estado);
}
