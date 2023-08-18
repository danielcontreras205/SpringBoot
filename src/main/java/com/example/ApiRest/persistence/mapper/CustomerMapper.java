/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.persistence.mapper;

import com.example.ApiRest.dto.Customer;
import com.example.ApiRest.persistence.entity.Cliente;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mappings({
            @Mapping(source = "idCliente", target = "customerId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellido", target = "lastName"),
            @Mapping(source = "celular", target = "cell"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "correoElectronico", target = "email"),
    })
    Customer toCustomer(Cliente cliente);
    List<Customer>  toCustomers(List<Cliente> cliente);

    @InheritInverseConfiguration
    @Mapping(target = "compras", ignore = true)
            
    Cliente toCliente(Customer customer);
}
