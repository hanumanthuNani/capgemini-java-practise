package com.Capgemini.controlFlow;
import java.util.Scanner;

public class SecondLargestDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int max1 = -1, max2 = -1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2 && digit != max1) {
                max2 = digit;
            }
            temp /= 10;
        }

        System.out.println("Second largest digit = " + max2);
        sc.close();
    }
}
