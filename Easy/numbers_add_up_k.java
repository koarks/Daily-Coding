import java.util.*;

// Trying to solve the problem in 1 pass
//-------------------------------- PROBLEM STATEMENT -------------------------------
// This problem was recently asked by Google.
// 
// Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
// 
// For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
// 
// Bonus: Can you do this in one pass?
//---------------------------------------------------------------





class numbers_add_up_k{
	public static void main(String args[]){
		int [] arr = new int[]{10,15,3,7};
		int k = 17;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

		for(int i =0;i<arr.length;i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i],1);
				if(map.containsKey(Math.abs(k - arr[i]))){
					System.out.println(arr[i]+" "+Math.abs(k - arr[i]));
				}
			}
		

		}
	}
}