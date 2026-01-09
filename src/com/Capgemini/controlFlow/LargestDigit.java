
package com.Capgemini.controlFlow;
import java.util.Scanner;

public class LargestDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int max = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit > max)
                max = digit;
            temp /= 10;
        }

        System.out.println("Largest digit = " + max);
        sc.close();
    }
}
