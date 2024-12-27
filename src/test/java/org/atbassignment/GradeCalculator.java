package org.atbassignment;

import java.util.Scanner;

public class GradeCalculator {
   
   // Grade Calculator: Develop a program that calculates grades based on score input.
    // Use conditional statements to assign letter grades (A, B, C, D, F) based on score ranges.
   public static void main(String[] args) {
       
       
       Scanner sc = new Scanner(System.in);
       double marks = sc.nextDouble();
       
       if(marks<0 || marks >100){
           System.out.println("Enter valid Marks");
           
       }
       
       if(marks <=20){
           
           System.out.println("You have Got F grade");
       }
       
       if(marks <=40 && marks>20){
           
           System.out.println("You have Got D grade");
       }
       
       if(marks <=60 && marks>40){
           
           System.out.println("You have Got C grade");
       }
       
       if(marks <=80 && marks>60){
           System.out.println("You have got B grade");
       }
       
       if(marks <=100 && marks>80){
           
           System.out.println("You have Got A grade");
       }
       
       
   }
   
   
}
