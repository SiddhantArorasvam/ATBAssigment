package org.atbassignment;

import java.util.Scanner;

public class PalindromeCheck {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check whether the number is palindrome or not");
        int a = sc.nextInt();
        
        int b = a;
        int y = 0;
        if(a<0){
            System.out.println("Number is not palindrome");
        }
        
        while (a>0){
            
            int z = a%10;
           
            
            y= (y*10)+z;
            a=a/10;
            
        }
        
        if(b==y){
            
            System.out.println("Number is Palindrome");
        
        }
        else {
            System.out.println("Number is not Palindrome");
        }
        
        
        
    }
}
