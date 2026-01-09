
package com.Capgemini.controlFlow;
import java.util.Scanner;

public class DigitFactorialPrinter {
    
    public static int factOfNum(int x){
        int factSum =1;
        for(int i=1;i<=x;i++){
            factSum *=i;
        }
        return factSum;
    }


	public static void main(String[] args) {
		System.out.println("Enter number to print factorial of all digits : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<=0){
		System.out.println("Not possible ,enter valid number");
		return;
		         }
		int sum = 0;
		int temp = num;
		while(temp >0) {
			int ld = temp%10;
			System.out.println("facotial of "+ld+" is :"+factOfNum(ld));
			temp /=10;
		}
		
		sc.close();
	}
}