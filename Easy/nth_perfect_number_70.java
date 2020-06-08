// A number is considered perfect if its digits sum up to exactly 10.
// 
// Given a positive integer n, return the n-th perfect number.
// 
// For example, given 1, you should return 19. Given 2, you should return 28.

class nth_perfect_number_70{

   public static void main(String args[]){
      int n = 15;
      int res = get_nth(n);
      System.out.println(res);
   }
   
   public static int get_nth(int n){
      int start = 19;
      int result = 19;
      if (n == 0)
         return 0;
      if (n == 1)
         return 19;
      
      for(int i=0;i<n-1;i++){
         result += 9;
      }  
      return result;    
   }
  }
