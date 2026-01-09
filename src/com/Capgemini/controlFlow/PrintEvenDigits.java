package com.Capgemini.controlFlow;
import java.util.Scanner;

public class PrintEvenDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) {
                System.out.println(digit);
            }
            temp /= 10;
        }
        sc.close();
    }
}
