package org.atbassignment;

import java.util.Scanner;

public class SimpleInterestCalculator {
    
    public static void main(String[] args) {
     
     //   Simple Interest Calculator: Write a program that calculates simple interest given principal,
        //   rate, and time. Use conditionals to validate input values.
        //S.I. = (P × R × T)/100
        
        Scanner scP = new Scanner(System.in);
        Scanner scR = new Scanner(System.in);
        Scanner scT = new Scanner(System.in);
        System.out.println("Enter the Principle Amount");
        double Principle = scP.nextDouble();
        System.out.println("Enter the Rate");
        double Rate = scR.nextDouble();
        System.out.println("Enter the Time Period");
        double Time = scT.nextDouble();
        
        double SimpleInterest = Principle*Rate*Time/100;
        
        System.out.println("S.I for the given values are "+SimpleInterest);
        
        
        
        
        
        
        
    }
}
