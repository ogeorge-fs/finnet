package com.example.app.model;


import lombok.Data;

@Data
public class Product {
    private String id;
    private String name;
    private String type;
    private String coverage;
    private double price;

    public Product(String id, String name, String type, String coverage, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.coverage = coverage;
        this.price = price;
    }


}
