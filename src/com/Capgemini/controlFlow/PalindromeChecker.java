package com.Capgemini.controlFlow;
import java.util.Scanner;

public class PalindromeChecker {

                   public static void main(String[] args) {
                                 
                               Scanner sc = new Scanner(System.in);

                               System.out.println("enter number to check : ");

                               int num  = sc.nextInt();

                               System.out.println(isPalindrome(num) ? num + " is  a palindrome" : num + " is not  a palindrome");
                   }

          
                  public static boolean isPalindrome(int n){

                             int rev = 0;
                             int temp = n;

                             while(temp !=0){

                               int ld = temp%10;
                               rev = rev * 10 + ld;
                               temp /= 10;
                             }

                          return (rev == n);

                   }

 }

                               