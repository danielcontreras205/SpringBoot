package com.example.ApiRest.persistence.entity;

import jakarta.persistence.*;
import java.util.List;
import lombok.*;
//------------------------------lombok------------------------------------------
@Data
@AllArgsConstructor
@NoArgsConstructor
//-------------------------------------------------------------------------
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;
    private String nombre;
    
    
    @Column(name = "codigo_barras")
    private String codigoBarras; 
    
    @Column(name = "precio_venta")
    private Double precioVenta;
    
    @Column(name = "cantida_stock")
    private Integer cantidadStock;
    
    private Boolean estado;
    
    /**
     * relacion de identidades
     */
    @ManyToOne
//    @JoinColumn(name = "id_categoria", insertable = false, updatable = false) --- no insertaba
    @JoinColumn(name = "id_categoria", insertable = true, updatable = true)
    private Categoria categoria;
    
    @OneToMany(mappedBy = "producto")
    private List<ComprasProducto> Compra;
}
