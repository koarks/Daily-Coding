// This problem was asked by Facebook.
// 
// Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).
// 
// For example, given the string "([])[]({})", you should return true.
// 
// Given the string "([)]" or "((()", you should return false.


import java.util.*;

class balanced_brackets_27{
   
   static HashMap<Character,Character> map = new HashMap<Character,Character>(){
      { 
         put('}','{');
         put(']','[');
         put(')','(');
      
      }
   
   };
   
   
   public static void main(String args[]){
      String s1 = "([])[]({})";
      String s2 = "([)]";
      String s3 = "((()";
      String s4 = "";
      String s5 = "}";
      String s6 = "())(";
      String s7 = "[([]){}()]";
      
      System.out.println(is_balanced(s1));
      System.out.println(is_balanced(s2));
      System.out.println(is_balanced(s3));
      System.out.println(is_balanced(s4));
      System.out.println(is_balanced(s5));
      System.out.println(is_balanced(s6));
      System.out.println(is_balanced(s7));
         
   }
   
   public static boolean is_balanced(String exp){
      Stack<Character> stack = new Stack<Character>();
      char ch;
      
      if(exp.length() == 0)
         return false;
         
      for(int i =0;i< exp.length();i++){
         ch = exp.charAt(i);
         if(map.containsKey(ch)){
            if(stack.size() == 0)
               return false;
            char popped = (char) stack.peek();
            if(popped != map.get(ch))
               return false;
            stack.pop();            
         }
         if(!map.containsKey(ch)){
            stack.push(ch);
         }
      }       
      return stack.size() == 0;  
      
   }

}


// -----------------------------------------------Proposed Solution -------------------------
// def balance(s):
//     stack = []
//     for char in s:
//         if char in ["(", "[", "{"]:
//             stack.append(char)
//         else:
//             # Check character is not unmatched
//             if not stack:
//                 return False
// 
//             # Char is a closing bracket, check top of stack if it matches
//             if (char == ")" and stack[-1] != "(") or \
//                (char == "]" and stack[-1] != "[") or \
//                (char == "}" and stack[-1] != "{"):
//                 return False
//             stack.pop()
// 
//     return len(stack) == 0