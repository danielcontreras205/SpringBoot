/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.domain.dto;

import lombok.Data;

/**
 *
 * @author danielfcontreras
 */
@Data
public class Product {
    private int productId;
    private int stock;
    private String barcode;
    private boolean active;
    private Category category;
    private String name;
    private double price;

}
