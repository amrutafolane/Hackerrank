//PROBLEM STATEMENT: Fibonacci Number Series.

import java.util.*;


public class FibonacciNos {

	public int findFibo (int n) {

		if (n == 0 || n == 1) {				 //base cases
			return n;
		}               

		else {                      		  //recursive
			int fib = (findFibo(n-1) + findFibo(n-2));
			return fib;
		}   
	}  



	public static void main (String []args) {

		FibonacciNos fib = new FibonacciNos();

		for (int i=0; i<=5; i++) {
			System.out.println(fib.findFibo(i));

		}
	}

}