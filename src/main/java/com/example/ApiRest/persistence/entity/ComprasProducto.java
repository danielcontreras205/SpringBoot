package com.example.ApiRest.persistence.entity;

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
    private ComprasProductoPK id;
    
    private Integer cantidad;
    
    private Double total;
    
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;
    
    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;
    
}
