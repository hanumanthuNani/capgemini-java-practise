package com.Capgemini.arrays;

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1};
        int max = arr[0];

        for (int i : arr)
            if (i > max)
                max = i;

        System.out.println("Largest = " + max);
    }
}
