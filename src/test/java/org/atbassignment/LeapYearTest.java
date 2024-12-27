package org.atbassignment;

import java.util.Scanner;

public class LeapYearTest {
    
    public static void main(String[] args) {
    
        //Find a number of year is leap year or not
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if((year%4==0 && year%100!=0)||year%400==0){
            
            
            System.out.println("Year is leap Year");
            
            
        }
        else{
            System.out.println("Not a Leap Year");
        }
    
    
    }
}
