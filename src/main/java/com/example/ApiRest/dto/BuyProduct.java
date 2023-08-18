package com.example.ApiRest.dto;

import lombok.Data;

@Data
public class BuyProduct {
    private BuyProducyPK primariKey;
    private int amount;
    private double total;
    private String state;
    
}
