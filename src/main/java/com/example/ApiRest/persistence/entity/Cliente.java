/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.persistence.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import lombok.*;

//------------------------------lombok------------------------------------------
@Data
@AllArgsConstructor
@NoArgsConstructor
//-------------------------------------------------------------------------
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;
    
    private String nombre;
    
    private String apellido;
    
    @Column(nullable = true)
    private Long celular;
    
    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;
    
    @OneToMany(mappedBy = "cliente")
    private List<Compra> Compras;
}
