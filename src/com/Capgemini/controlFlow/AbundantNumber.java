package com.Capgemini.controlFlow;

import java.util.Scanner;

public class AbundantNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = sc.nextInt();
		int sum = 1;
		for(int i = 2; i*i <=n; i++) {
			if(n%i == 0) {
				int d1 = i;
				int d2 = n/i;
				sum += d1;
				if(d1 != d2) {
					sum += d2;
				}
			}
		}
		if (n <= 0) {
			System.out.println("Enter a positive number");
			return;
		}
		if(n==1) sum =0;
		System.out.println(sum > n
		                   ? n +" is an abundant number"
		                   : n+ " is not an abundant number");
		sc.close();
	}
}