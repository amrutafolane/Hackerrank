//PROBLEM STATEMENT: Check if BST is valid BST, satifying the property.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
//using preorder traversal

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

 class BinaryTree
{
    Node root; 
    Node prev; //earlier data element --keep track
    
    boolean isBST() {
        prev = null;
        return isBST(root);
    }
    
    boolean isBST(Node root) {
        
        if(root != null){
            
            if (!isBST(root.left))
                return false;
            
            if (prev != null && root.data <= prev.data)
                return false;
            
            prev = root;
            return isBST(root.right);
        }
        return true;
    }
    
    /* Driver program to test above functions */
	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);

		if (tree.isBST())
			System.out.println("IS BST");
		else
			System.out.println("Not a BST");
	}
}  