package com.Capgemini.OOPS.Constructor.Constructor_Overloading;

public class Product {

    int id;
    String name;
    double price;

    // Default constructor
    public Product() {
        id = 0;
        name = "NA";
        price = 0.0;
    }

    // Parameterized constructor
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Parameterized constructor (overloaded)
    public Product(int id, String name, double price) {
        this(id, name); // constructor chaining
        this.price = price;
    }

    public void display() {
        System.out.println(id + " " + name + " " + price);
    }
}

