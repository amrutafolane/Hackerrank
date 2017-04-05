PROBLEM STATEMENT: Find max value in a Binary Tree.

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BinaryTree 
{
    public static class TreeNode  
 {  
  int data;  
  TreeNode left;  
  TreeNode right;  
  TreeNode(int data)  
  {  
   this.data=data;  
  }  
 } 

    public static int findMax (TreeNode root) {
        
        if (root == null)
            return -1;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int max = Integer.MIN_VALUE;
        
        while (!q.isEmpty()) {
            
            TreeNode temp = q.poll();
            
            if (max < temp.data)
                max = temp.data;
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
        return max;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BinaryTree bi=new BinaryTree();  
        // Creating a binary tree  
        TreeNode rootNode=createBinaryTree();  
        System.out.println("Max node using iteration :"+findMax(rootNode));  
		
	}
	
	public static TreeNode createBinaryTree()  
 {  
  
  TreeNode rootNode =new TreeNode(40);  
  TreeNode node20=new TreeNode(20);  
  TreeNode node10=new TreeNode(10);  
  TreeNode node30=new TreeNode(30);  
  TreeNode node60=new TreeNode(60);  
  TreeNode node50=new TreeNode(50);  
  TreeNode node70=new TreeNode(70);  
  
  rootNode.left=node20;  
  rootNode.right=node60;  
  
  node20.left=node10;  
  node20.right=node30;  
  
  node60.left=node50;  
  node60.right=node70;  
  
  return rootNode;  
 }  

}
