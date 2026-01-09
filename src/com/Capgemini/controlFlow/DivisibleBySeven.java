
package com.Capgemini.controlFlow;
import java.util.Scanner;

public class DivisibleBySeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int num = sc.nextInt();
		System.out.println(num %7 == 0
		                   ? num + " <--Divisible by 7"
		                   : num +"  <--Not-Divisible by 7 ");
		sc.close();
	}
}