package org.atbassignment;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
      
      //  Sum of Digits: Create a program that calculates the sum of all digits of a given number.
        //  For instance, if the input is 123, the output should be 6 (1+2+3).
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for which you want to make the sum");
        int num = sc.nextInt();
        int sum = 0;
        
        while (num>0){
            
            int remainder = num%10;  //121/10=1
            sum = sum+remainder;
            num=num/10;
            
            
            
        }
        
        System.out.println("The Sum is "+sum);
        
        
        
        
        
        
        
        
        
    }
    
    
}
