package com.example.ApiRest.web.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class HolaController {
    @GetMapping("/saludar")
    public String saludar(){
        return "Hola Mundo";
    }
    //JPA
    //@Entity - - - - - identidad
    //@table  - - - - - nombre tabla
    //@column - - - - - colubna de tabla (unico, String, int)
    //@Id - - - - - - - id de la tabla Primary Key
    //@GeneratedValue - desir si va a tener secuensia
    //@OneToMany - - - - relacion de uno a muchos
    //@ManyToOne - - - - muchos a uno
}
