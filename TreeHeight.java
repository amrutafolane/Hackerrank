//PROBLEM STATEMENT: Find the height of the binary tree.

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
    
    public int heightOfTree(Node root) {
        
        if (root == null)
            return -1;
        
        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
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
        System.out.println("Tree height : " + (new BalancedTree()).heightOfTree(root));
        root.right.right.right = new Node (40);
        root.right.right.right.right = new Node (45);
        System.out.println("Tree height : " + (new BalancedTree()).heightOfTree(root));
    }
}  