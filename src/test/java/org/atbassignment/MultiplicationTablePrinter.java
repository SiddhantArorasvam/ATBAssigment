package org.atbassignment;

import java.util.Scanner;

public class MultiplicationTablePrinter {
    
   // Multiplication Table Printer: Write a program that prints the multiplication
    // table of a given number up to a certain range.
    
    
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want the table");
        int number = sc.nextInt();
        
        for (int i=1;i<=10;i++){
            
            int total = number*i;
            
            System.out.println(number+"X"+i+"="+total);
    
    }
    
//    public String table(){
//
//
//
//        }
//        return ;
    
    
    
    }
    
}



