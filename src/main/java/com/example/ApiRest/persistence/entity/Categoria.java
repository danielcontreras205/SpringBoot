package com.example.ApiRest.persistence.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import lombok.*;

//------------------------------lombok------------------------------------------
@Data // JPA - crea los get y set 
@AllArgsConstructor // constructor con todos los argumentos
@NoArgsConstructor // constructor sin argumentos 
//-------------------------------------------------------------------------
@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private int idCategoria;
    
    private String descripcion;
    
    private Boolean estado;
    /**
     * inversa relacion
     */
    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;
}
