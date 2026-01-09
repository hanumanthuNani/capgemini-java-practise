package com.Capgemini.controlFlow;
public class PalindromeNumbersInRange {

	public static boolean isPalindrome(int n) {
		int temp = n;
		int rev = 0;
		while(temp >0) {
			int ld = temp%10;
			rev = rev*10 + ld;
			temp /=10;
		}
		return rev==n;
	}

	public static void main(String[] args) {
		System.out.println("palindrome numbers from range 100 to 200 ");
		for(int i = 100; i<=200; i++) {
			if(isPalindrome(i)) {
				System.out.println(i + " is a palindrome number");
			}
		}
	}
}