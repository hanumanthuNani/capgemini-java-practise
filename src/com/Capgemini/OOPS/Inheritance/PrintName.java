package com.Capgemini.OOPS.Inheritance;

import java.util.Scanner;

public class PrintName {

    Scanner sc = new Scanner(System.in);

    public String[] readName() {

        String firstName;
        String middleName = null;
        String lastName = null;

        System.out.println("Enter first name:");
        firstName = sc.next();

        System.out.println("Do you have middle name? yes/no");
        if (sc.next().equalsIgnoreCase("yes")) {
            System.out.println("Enter middle name:");
            middleName = sc.next();
        }

        System.out.println("Do you have last name? yes/no");
        if (sc.next().equalsIgnoreCase("yes")) {
            System.out.println("Enter last name:");
            lastName = sc.next();
        }

        return new String[]{ firstName, middleName, lastName };
    }
}
