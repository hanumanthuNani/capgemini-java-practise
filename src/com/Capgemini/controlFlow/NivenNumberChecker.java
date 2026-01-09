package com.Capgemini.controlFlow;
import java.util.Scanner;

public class NivenNumberChecker {

	public static boolean isNiven(int x) {
		int temp = x;
		int sum = 0;
		while(temp>0){
		    int ld = temp %10;
		    sum += ld;
		    temp /=10;
		}
		return (x%sum == 0);
	}


	public static void main(String[] args) {
		System.out.println("Enter number to check Niven Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<=0) {
			System.out.println("Not possible ,enter valid or positive number only");
			return;
		}
		
		System.out.println(isNiven(num) 
		                   ? num + " is a Niven number"
		                   : num + " is not a Niven number");
		sc.close();
	}
}