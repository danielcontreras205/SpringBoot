/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ApiRest.dto;

import lombok.Data;

/**
 *
 * @author danielfcontreras
 */
@Data
public class Category {
    private int categoryId;
    private String category;
    private boolean active;
}
