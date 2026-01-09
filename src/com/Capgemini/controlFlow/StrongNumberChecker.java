package com.Capgemini.controlFlow;
import java.util.Scanner;

public class StrongNumberChecker {
    
    public static int factOfNum(int x){
        int factSum =1;
        for(int i=1;i<=x;i++){
            factSum *=i;
        }
        return factSum;
    }

	public static boolean isStrong(int n) {
		int temp = n;
		int sum = 0;
		while(temp >0) {
			int ld = temp%10;
			sum  += factOfNum(ld);
			temp /=10;
		}
		return sum==n;
	}

	public static void main(String[] args) {
		System.out.println("Enter number to check Strong number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<0){
		System.out.println("only enter positive numbers ");
		return;}
		System.out.println(isStrong(num)
		                   ? num + " is a Strong Number"
		                   : num +  " is not a Strong Number");
		sc.close();
	}
}