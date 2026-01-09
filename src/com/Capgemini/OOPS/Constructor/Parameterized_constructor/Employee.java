package com.Capgemini.OOPS.Constructor.Parameterized_constructor;


public class Employee {

    int empId;
    String empName;

    // Parameterized constructor
    public Employee(int id, String name) {
        empId = id;
        empName = name;
    }

    public void display() {
        System.out.println(empId + " " + empName);
    }
}

