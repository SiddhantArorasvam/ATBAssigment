package org.atbassignment;

public class Test001 {
    
    public static void main(String[] args) {
        
        
        
                int x,y,z,a=0;
                
                x = 101;
                
                y = x;
                
                if(x<0|| (x % 10 == 0 && x != 0))
                {
                    System.out.println("not Palindrome");
                }
                
                while(x>0)
                {
                    z= x%10;
                    a= (a*10)+z;
                    x=x/10;
                    
                }
                
                
                
                if(y==a || x == y / 10){
                    
                    System.out.println("number is palindrome");
                }
                else{
                    System.out.println("Not a palindrome");
                }
            }
        }
        
    

