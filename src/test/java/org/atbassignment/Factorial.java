package org.atbassignment;

import java.util.Scanner;

public class Factorial {
 
 //   Factorial Calculator: Write a program to calculate the factorial of a given number using loops.
 //Eg:- 5! = 5 x 4 x 3 x 2 x 1
 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int result=0;
  
  for(int i=a-1;i>=1;i--){
   
   result= a*i;
   a--;
   
   
   
  }
  System.out.println(result);
 }
 
 
 
  
 
 
 
}
