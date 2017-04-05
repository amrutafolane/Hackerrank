//PROBLEM STATEMENT: Check if binary tree is balanced.


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

 class Node
{
	int data;
	Node left, right;

	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}

 class BalancedTree
{
    
    public boolean checkBal(Node root) {
        int result = isBal(root);
        if (result == -1)
            return false;
        else
            return true;
    }
    
    public int isBal(Node root) {
        
        if (root == null)
            return 0;
        
        int leftH = isBal(root.left);
        if (leftH == -1) 
            return -1;
        
        int rightH = isBal(root.right);
        if (rightH == -1) 
            return -1;
        
        int diff = leftH - rightH;
        if (Math.abs(diff) > 1)
            return -1;
            
        return 1 + Math.max(leftH, rightH);
        
    }
    
     
    /* Driver program to test above functions */
	public static void main(String args[])
	{
		Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);		
		System.out.println(" Is Tree Balanced : " + (new BalancedTree()).checkBal(root));
		root.right.right.right = new Node (40);
		root.right.right.right.right = new Node (45);
		System.out.println(" Is Tree Balanced : " + (new BalancedTree()).checkBal(root));
	}
}  