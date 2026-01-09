package com.Capgemini.OOPS.Inheritance;

public class Main {

    public static void main(String[] args) {

        // Step 1: Input
        PrintName pn = new PrintName();
        String[] nameData = pn.readName();

        // Step 2: Create Student (HAS-A + IS-A)
        Student student = new Student(
                nameData[0],
                nameData[1],
                nameData[2],
                "Nani"
        );

        // Step 3: Display
        student.displayStudent();
    }
}
