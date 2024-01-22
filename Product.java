package com.example.product.dto;

import lombok.Data;

@Data
public class Product {
    private Long productId;
    private String name;
    private String description;
    private double price;
    private int quantityAvailable;
}
