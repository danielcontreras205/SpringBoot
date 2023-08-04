/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ApiRest.persistence.mapper;

import com.example.ApiRest.domain.Buy;
import com.example.ApiRest.persistence.entity.Compra;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author AsRock
 */
@Mapper(componentModel = "spring")
public interface BuyMapper {
    @Mappings({
            @Mapping(source = "idCompra", target = "buyId"),
            @Mapping(source = "comentario", target = "comment"),
            @Mapping(source = "estado", target = "state"),
            @Mapping(source = "idCliente", target = "customerId"),
            @Mapping(source = "medioPago", target = "paymentMethod"),
    })
    Buy toBuy(Compra compra);
    List<Buy> toBuy(List<Compra> compras);
    
    @InheritInverseConfiguration
    @Mapping(target = "cliente", ignore = true)
    Compra toCompra(Buy buy);
}
