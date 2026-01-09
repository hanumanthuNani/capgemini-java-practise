package com.Capgemini.controlFlow;
import java.util.Scanner;

public class ProductOfEvenOddDigitSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int evenSum = 0, oddSum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;

            temp /= 10;
        }

        System.out.println("Result = " + (evenSum * oddSum));
        sc.close();
    }
}
