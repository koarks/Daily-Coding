//Print the nodes in a binary tree level-wise. For example, the following should print 1, 2, 3, 4, 5.
//   1
//  / \
// 2   3
//    / \
//   4   5

// This Solution takes O(N) time and space, as we need to run through all the elements.

import java.util.*;

class level_order_binary_tree_107{
   Node root;
   
   static class Node{
      int data;
      Node right,left;
      Node(int d){
         this.data = d;
         this.left = null;
         this.right = null;
      }   
   }
   
   public static Node construct(int arr[], Node root, int i){
      if(i < arr.length){
         if(arr[i] != -1){
            Node temp = new Node(arr[i]);
            root = temp;
            
            root.left = construct(arr, root.left, 2*i + 1);
            root.right = construct(arr, root.right, 2*i + 2);
         }
         
      }
      return root;         
   }
   
   public static void print_level_order(Node root){
      Queue<Node> q = new LinkedList<Node>();
      q.add(root);
      
      while(!q.isEmpty()){
         int size_q = q.size();
         for(int i =0;i<size_q;i++){
            Node temp = q.poll();
            System.out.println(temp.data);
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null)q.add(temp.right);
         }         
      }
        
   }
   
   public static void inOrder(Node root) 
    { 
        if (root != null) { 
            inOrder(root.left); 
            System.out.print(root.data + " "); 
            inOrder(root.right); 
        } 
    }

   public static void main(String args[]){
      level_order_binary_tree_107 tree = new level_order_binary_tree_107();
      int[] arr = new int[]{1,2,3,-1,-1,4,5};
      tree.root = construct(arr, tree.root, 0);
      print_level_order(tree.root);
      
   }


}