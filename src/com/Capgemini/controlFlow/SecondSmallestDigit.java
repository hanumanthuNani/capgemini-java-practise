package com.Capgemini.controlFlow;
import java.util.Scanner;

public class SecondSmallestDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int min1 = 9, min2 = 9;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit < min1) {
                min2 = min1;
                min1 = digit;
            } else if (digit < min2 && digit != min1) {
                min2 = digit;
            }
            temp /= 10;
        }

        System.out.println("Second smallest digit = " + min2);
        sc.close();
    }
}
