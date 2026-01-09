package com.Capgemini.OOPS.Constructor.Constructor_Overloading;

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product(1, "Laptop");
        Product p3 = new Product(2, "Mobile", 25000);

        p1.display();
        p2.display();
        p3.display();
    }
}

