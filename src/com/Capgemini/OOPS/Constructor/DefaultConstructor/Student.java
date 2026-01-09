package com.Capgemini.OOPS.Constructor.DefaultConstructor;


public class Student {

    int id;
    String name;

    // Default constructor
    public Student() {
        id = 0;
        name = "Unknown";
    }

    public void display() {
        System.out.println(id + " " + name);
    }
}

