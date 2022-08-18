package com.example.w22comp1011gctest2student.model;

// Product Class
public class Product {

    //Member Variables
    private int id;
    private String sku;
    private String name;
    private double salePrice;
    private double regularPrice;
    private String image;

    // Getter methods
    public int getId() {
        return id;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public String getImage() {
        return image;
    }

    // Overridden to String method
    @Override
    public String toString() {
        return name + "-$" + salePrice;
    }
}