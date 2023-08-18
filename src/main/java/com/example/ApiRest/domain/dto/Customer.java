package com.example.ApiRest.domain.dto;

import lombok.Data;

@Data
public class Customer {
    private int customerId;
    private String name;
    private String lastName;
    private long cell;
    private String email;
    private String address;
}
