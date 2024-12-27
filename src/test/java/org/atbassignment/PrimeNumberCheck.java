package org.atbassignment;

import java.util.Scanner;

public class PrimeNumberCheck {
  
  //  Prime Number Checker: Create a program that checks if a given number is prime or not.
    //  Use loops to divide the number by all numbers lesser than it to check for divisibility.
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num<=1){
            
            System.out.println("Exclude 0 and 1");
        }
        boolean isprime =true;
        for (int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                isprime=false;
                break;
                
            }
            
           
      
        }
        if(isprime){
            System.out.println("Number is Prime");
        }
        else {
            System.out.println("Number is not Prime");
        }
        
    }
    
}
