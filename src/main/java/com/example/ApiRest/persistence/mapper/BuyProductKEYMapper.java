
package com.example.ApiRest.persistence.mapper;

import com.example.ApiRest.domain.dto.BuyProducyPK;
import com.example.ApiRest.persistence.entity.ComprasProductoPK;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring",uses = {BuyMapper.class,ProductMapper.class})
public interface BuyProductKEYMapper {
    @Mappings({
            @Mapping(source = "idCompra", target = "buyId"),
            @Mapping(source = "idProducto", target = "productId"),
    })
    BuyProducyPK toBuyProducyPK(ComprasProductoPK comprasProductoPK);
    List<BuyProducyPK> toBuyProducyPKs(List<ComprasProductoPK> comprasProductoPK);
    
    @InheritInverseConfiguration
    ComprasProductoPK toComprasProductoPK(BuyProducyPK buyProducyPK);
}
