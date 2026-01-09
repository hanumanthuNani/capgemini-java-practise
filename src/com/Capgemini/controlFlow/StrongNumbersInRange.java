package com.Capgemini.controlFlow;
public class StrongNumbersInRange {

	public static int findFact(int num) {
		int factSum = 1;
		for(int i=1; i<=num; i++) {
			factSum *= i;
		}
		return factSum;
	}

	public static boolean isStrong(int n ) {
		int temp = n;
		int sum  = 0;
		while(temp>0) {
			int ld = temp%10;
			sum += findFact(ld);
			temp /= 10;
		}
		return sum==n;
	}

	public static void main(String[] args) {
		System.out.println("Strong numbers from the range of 1 to 1000 ");
		for(int i = 1; i<=1000 ; i++) {
			if(isStrong(i)) {
				System.out.println(i + " is an strong number");
			}
		}
	}
}