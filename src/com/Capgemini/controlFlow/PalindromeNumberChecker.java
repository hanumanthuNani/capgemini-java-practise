package com.Capgemini.controlFlow;
import java.util.Scanner;

public class PalindromeNumberChecker {

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
		System.out.println("Enter number to check Palindrome: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isPalindrome(num)
		                   ? num + " is a palindrome"
		                   : num +  " is not a palindrome");
		sc.close();
	}
}