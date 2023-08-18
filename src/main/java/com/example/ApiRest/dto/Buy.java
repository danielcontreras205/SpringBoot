package com.example.ApiRest.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Buy {
    private int buyId;
    private String comment;
    private String state;
    private LocalDateTime date;
    private Customer customer;
    private String paymentMethod;
}
