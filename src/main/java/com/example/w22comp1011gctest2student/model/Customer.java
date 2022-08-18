package com.example.w22comp1011gctest2student.model;

import java.util.ArrayList;

// Customer Class
public class Customer {
    // Member Variables
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private ArrayList<Product> purchases;

    // Getter methods
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Product> getPurchases() {
        return purchases;
    }
}

