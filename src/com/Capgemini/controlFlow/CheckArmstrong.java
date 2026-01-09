
package com.Capgemini.controlFlow;
import java.util.Scanner;

public class CheckArmstrong {



                public static int count(int x){

                       int count = 0;
                            while( x != 0){
                                  x /=10;
                                  count ++;
                            }
                     return count;
                 }



                public static int power(int a , int b){
                    
                                  int sum = 1;

                                  for(int i = 1;i<=b;i++){
                                        sum *=a;
                                   }

                                  return sum;
                 }




                public static String isArmStrong(int n){

                            int temp = n;
                            int temp2 = n;
                            int total = 0;

                            int numCount = count(n);

                            while(temp2 !=0){

                              int ld = temp2 %10;
                              total += power(ld,numCount);
                              temp2 /=10;
                           }
                        

                         return (total == n  ? n+ " is a armstrong number " : n + " is not a armstrong number"); 
                }





                public static void main(String[] args) {

                                   Scanner sc = new Scanner(System.in);

                                   System.out.println("Enter number to check Armstrong or not ");

                                   int num = sc.nextInt();

                                   System.out.println(isArmStrong(num));
               } 


 }
                              
          