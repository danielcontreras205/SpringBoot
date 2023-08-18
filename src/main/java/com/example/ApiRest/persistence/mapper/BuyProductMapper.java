/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ApiRest.persistence.mapper;

import com.example.ApiRest.dto.BuyProduct;
import com.example.ApiRest.persistence.entity.ComprasProducto;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 *
 * @author AsRock
 */
@Mapper(componentModel = "spring",uses = {BuyProductKEYMapper.class})
public interface BuyProductMapper {
    @Mappings({
            @Mapping(source = "primariaKey", target = "primariKey"),
            @Mapping(source = "cantidad", target = "amount"),
            @Mapping(source = "total", target = "total"),
            @Mapping(source = "estado", target = "state"),
    })
    BuyProduct toBuyProduct(ComprasProducto comprasProducto);
    List<BuyProduct> toBuyProducts(List<ComprasProducto> comprasProductos);
    
    @InheritInverseConfiguration
    ComprasProducto toCompraProducto(BuyProduct buyProduct);
}
