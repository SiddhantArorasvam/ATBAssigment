package org.atbassignment;

import java.util.Scanner;

public class TempConverter {

    //Farenheit to celsius :- F = C * 9/5 + 32
    //Celsius to Farenheit :- C = F - 32 * 5/9
    
   // Temperature Converter: Create a program that converts temperatures from Fahrenheit to Celsius and vice versa,
    // using conditional statements to handle the direction of conversion.
    
    
    public static void main(String[] args) {
        
        Scanner F= new Scanner(System.in);
        
        double Number = F.nextDouble();
        
        Scanner op = new Scanner(System.in);
        String type = op.next();
        
        double x=0;
        
        if(type=="Farenheit")
        {
          x=  Number - 32 * 5/9;
            
            System.out.println("Answer for Celsium to Faren is"+x);
        }
        
        else {
            
            
            x= Number * 9/5 +32;
            
            System.out.println("Answer for Farenheit to celsium is"+ x);
            
        }
        
        
        
        
        
        
    }
}
