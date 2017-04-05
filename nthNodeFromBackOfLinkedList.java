//PROBLEM STATEMENT: Find the nth node from back in a linkedList.

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node {

	int data;
	Node next;

	public Node (int d) {
		data = d;
		next = null;
	}
}

class LinkedList {

	Node head;

	public int lengthOfLinkedList() {
		Node temp = head;
		int count = 0; 

		while(temp != null) {
			temp = temp.next;
			count++;
		}

		return count;
	}

	public void printNthLast (int n) {

		int len = lengthOfLinkedList();
		System.out.println("len" + len);
		Node temp = head;
        int count = 1;
		//print the (len - n + 1)th node from the start
		while (temp != null && count != len-n+1) {
			temp = temp.next;
			count++;
		}
		System.out.println(temp.data);
	}
	
	public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
 
        /* 3. Make next of new Node as head */
        new_node.next = head;
 
        /* 4. Move the head to point to new Node */
        head = new_node;
    }

	public static void main(String [] args)
    {
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);
 
        llist.printNthLast(4);
    }
}
