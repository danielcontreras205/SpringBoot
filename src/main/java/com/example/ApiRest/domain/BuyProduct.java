package com.example.ApiRest.domain;

import lombok.Data;

@Data
public class BuyProduct {
    private int buyId;
    private int productId;
    private int amount;
    private String state;
    private double total;
    
}
