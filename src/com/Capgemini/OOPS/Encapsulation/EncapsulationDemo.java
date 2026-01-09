package com.Capgemini.OOPS.Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {

        Student s = new Student();
        s.setId(101);
        s.setName("Nani");

        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
    }
}
