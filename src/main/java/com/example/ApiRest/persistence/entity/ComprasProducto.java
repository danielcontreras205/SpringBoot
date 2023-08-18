package com.example.ApiRest.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;

//------------------------------lombok------------------------------------------
@Data
@AllArgsConstructor
@NoArgsConstructor
//-------------------------------------------------------------------------
@Entity
@Table(name = "compras_producto")
public class ComprasProducto {
    @EmbeddedId
    private ComprasProductoPK primariaKey;
    
    private Integer cantidad;
    
    private Double total;
    
    private String estado;
    
    @ManyToOne
    @MapsId("idCompra")
    @JoinColumn(name = "id_compra")
    @JsonIgnore
    private Compra compra;
    
    @ManyToOne
    @MapsId("idProducto")
    @JoinColumn(name = "id_producto")
    private Producto producto;
    
}
