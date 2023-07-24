/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.persistence.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@Embeddable
public class ComprasProductoPK implements Serializable{
    @Column(name = "id_compra")
    private Integer idCompra;
    
    @Column(name = "id_producto")
    private Integer idProducto;
}
