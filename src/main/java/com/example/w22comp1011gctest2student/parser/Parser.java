// Name: Davinder Singh
// Student ID: 200484320
package com.example.w22comp1011gctest2student.parser;

import com.example.w22comp1011gctest2student.model.Customer;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {
    public static ArrayList<Customer> getCustomersFromJsonFile() {
        // Creating Gson object
        Gson gson = new Gson();

        // Empty ArrayList for customers
        ArrayList<Customer> customerArrayList = new ArrayList<>();

        // Reading customers.json file
        try {

            FileReader fileReader = new FileReader("customers.json");
            JsonReader jsonReader = new JsonReader(fileReader);

            // Converting file string into json object
            JsonObject jsonObject = new Gson().fromJson(jsonReader, JsonObject.class);

            // Getting Customers Json Array from json object
            JsonArray jsonArray = jsonObject.getAsJsonArray("Customers");

            // Getting the type of Customer ArrayList
            Type type = new TypeToken<List<Customer>>() {}.getType();

            // Parsing Customers into arrayList of class customer
            customerArrayList = gson.fromJson(jsonArray, type);

            // Closing file reader and json reader
            jsonReader.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Returning custom ArrayList
        return customerArrayList;
    }
}
