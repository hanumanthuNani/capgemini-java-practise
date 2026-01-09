package com.Capgemini.controlFlow;
import java.util.Scanner;

public class SmallestDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int min = 9;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit < min)
                min = digit;
            temp /= 10;
        }

        System.out.println("Smallest digit = " + min);
        sc.close();
    }
}
