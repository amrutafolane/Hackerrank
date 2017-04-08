//PROBLEM STATEMENT: Refer .pdf with the same name as this code file.

//In this challenge, you must first implement a queue using two stacks. Then process  queries, where each query is one of the following  types:
//
//1 x: Enqueue element  into the end of the queue.
//2: Dequeue the element at the front of the queue.
//3: Print the element at the front of the queue.
//Input Format
//
//The first line contains a single integer, , denoting the number of queries. 
//Each line  of the  subsequent lines contains a single query in the form described in the problem statement above. All three queries start with an integer denoting the query , but only query  is followed by an additional space-separated value, , denoting the value to be enqueued.
//
//Constraints
//
//It is guaranteed that a valid answer always exists for each query of type .
//Output Format
//
//For each query of type , print the value of the element at the front of the queue on a new line.
//
//Sample Input
//
//10
//1 42
//2
//1 14
//3
//1 28
//3
//1 60
//1 78
//2
//2
//Sample Output
//
//14
//14



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class MyQueue {
    
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    
    
    //enqueue -- keep pushing onto s1
    public  void enqueue(int val) {
        
        s1.push(val);
    }
    
    //dequeue -- remove front
    public  void dequeue () {
        
        if (s2.isEmpty()){
            prepStack();
        }
        
        s2.pop();                            
    }
    
    //print the front element
    public  int peek() {        
       
        if (s2.isEmpty())
             prepStack();
        return s2.peek();
        
    } 
    
    //get all elements from s1 to s2 for front operations
    public  void prepStack() {
        while (!s1.isEmpty()) {
            int temp = s1.pop();
            s2.push(temp);
        }
    }
}

public class Solution {
    
    public static void main(String[] args) { 
        MyQueue queue = new MyQueue();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
