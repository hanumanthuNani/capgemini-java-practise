package com.Capgemini.controlFlow;
import java.util.Scanner;

public class MaxMinInArray {

    public static int maxINArray(int[] arr) {

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minINArray(int[] arr) {

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements into array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Max element in array: " + maxINArray(arr));
        System.out.println("Min element in array: " + minINArray(arr));

        sc.close();
    }
}
