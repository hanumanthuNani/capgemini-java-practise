package com.Capgemini.arrays;

public class SumOFArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int sum = 0;

        for (int i : arr)
            sum += i;

        System.out.println("Sum = " + sum);
    }
}
