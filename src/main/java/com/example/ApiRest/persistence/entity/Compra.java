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
@Table(name = "compras")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Integer idCompra;
    
    private LocalDateTime fecha;
    
    @Column(name = "medio_pago")
    private String medioPago;
    
    private String comentario;
    
    private String estado;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = true, updatable = true)
    public Cliente cliente;
    
    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL)
    private List<ComprasProducto> comprasProducto;
    
    
}
