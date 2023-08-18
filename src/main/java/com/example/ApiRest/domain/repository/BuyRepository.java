package com.example.ApiRest.domain.repository;

import com.example.ApiRest.domain.dto.Buy;
import java.util.List;
import java.util.Optional;

public interface BuyRepository {
    List<Buy> getAll();
    
    Buy save(Buy buy);
    
    Optional<Buy> getBuy(int buyId);
    
    void delete(int buyId);
    
    Buy update(Buy buy);
    
    List<Buy> search(int customerId);
    
    List<Buy> searchNativo(int customerId);
}
