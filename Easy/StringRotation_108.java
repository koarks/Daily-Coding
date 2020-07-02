// Given two strings A and B, return whether or not A can be shifted some number of times to get B.
// 
// For example, if A is abcde and B is cdeab, return true. If A is abc and B is acb, return false.


// The solution takes O(n^2), n is the size of s1; Concatenation is O(n^2)
// Can be improved

import java.util.*;

class StringRotation_108{
   public static boolean isRotation(String s1, String s2){
      
      if(s1.length() != s2.length())
         return false;
      
      String s3 = s1 + s1;     
      
      return s3.contains(s2);
            
   }
   public static void main(String args[]){
      System.out.println(isRotation("abcde","cdeab"));
      System.out.println(isRotation("abc","acb"));   
   }
}
