package com.example.ApiRest.persistence.crud;

import com.example.ApiRest.persistence.entity.Cliente;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CustomerCrudRepository extends CrudRepository<Cliente,Integer> {
    
    List<Cliente> findByIdClienteOrderByNombreAsc(int idCategoria);
    
}
