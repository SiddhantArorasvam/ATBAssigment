package org.atbassignment;

import java.util.Scanner;

public class CountVowelConsonant {
    
    public static void main(String[] args) {
    
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the sentence");
//        String sentence = sc.next();

        String sentence = "My Name is Sid";
        int countvowel=0,countconsonent=0;
        String lowercase = sentence.toLowerCase();
        
        
        
        
        for (int i=0;i<lowercase.length();i++){
        
            char st = lowercase.charAt(i);
            
            if (st=='a' || st=='e'|| st=='i'|| st=='o'|| st=='u'){
                countvowel++;
                
            }
            else if((st>='a' && st<='z')) {
                
                countconsonent++;
            }
            
        }
        
        System.out.println("Vowel Count is "+countvowel);
        System.out.println("Vowel Count is "+countconsonent);
        
        
        
    
    
    }

}
