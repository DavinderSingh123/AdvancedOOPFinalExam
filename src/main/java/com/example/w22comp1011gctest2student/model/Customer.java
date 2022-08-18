// Name: Davinder Singh
// Student ID: 200484320
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

    // Function to get total of purchases
    public double getTotalPurchases() {

        // streaming over all products in purchases
        // Summing the double for total sum
        return purchases.stream().reduce(0.00, (partialTotal, product) -> partialTotal + product.getSalePrice(), Double::sum);
    }

    // Function to get total saved amount
    public double getTotalSavedAmount() {

        // streaming over all products in purchases
        // Adding the double for saved sum
        return purchases.stream().reduce(0.00, (partialTotal, product) -> partialTotal + (product.getRegularPrice() - product.getSalePrice()), Double::sum);
    }

    // Function to check if customer has saved more than or equal to 5 dollars
    public boolean hasSavedEqualOrMoreThan5() {
        // Reusing previously written method and returning if more than equal to 5
        return getTotalSavedAmount() >= 5;
    }
}

