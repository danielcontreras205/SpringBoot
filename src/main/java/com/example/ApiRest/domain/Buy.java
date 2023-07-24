package com.example.ApiRest.domain;

import lombok.Data;

@Data
public class Buy {
    private int buyId;
    private String comment;
    private String state;
    private int customerId;
    private String paymentMethod;
}
