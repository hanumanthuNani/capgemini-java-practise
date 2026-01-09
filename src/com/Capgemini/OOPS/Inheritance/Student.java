package com.Capgemini.OOPS.Inheritance;

public class Student extends Parent {

    private String sName;

    Name name;        // HAS-A
    Address address;  // HAS-A
    Subject subject;  // HAS-A

    Student(String fName, String mName, String lName, String sName) {
        super(fName, mName);   // Parent constructor
        this.sName = sName;
        this.name = new Name(fName, mName, lName);
    }

    public void displayStudent() {
        name.display();
        System.out.println("Student Name: " + sName);
    }
}
