// PROBLEM STATEMENT: N steps problem using DP
//Objective: A child is climbing up a staircase with n steps, and can hop either 1 step, 2 steps, or 3 steps at a time. Imple­ment a method to count how many possible ways the child can jump up the stairs.
//
//Example:
//
//Number of stairs : 3
//
//Number of ways = 4 ( {1,1,1}, {1,2}, {2,1}, {3} )
//Approach:
//
//Say child has to take n steps.
//At every step the child has 3 options, to take 1 step, 2 step or 3 steps.
//So if child take 1 step then find the number of ways to complete n-1 steps +1.
//Similarly if child take 2 steps then find the number of ways to complete n-2 steps +1.
//If child take 3 step then find the number of ways to complete n-3 steps +1.
//So total number of ways to complete n steps = No of ways to complete (n-1)steps + No of ways to com­plete (n-2)steps + No of ways to complete (n-3)steps +1.
//--------------------------------------------------------------------------------------------------------------------------------------

public class Steps {
	
	public int possibleWays(int n, int[] dyn){

		if (n < 0) 
			return 0;

		if (dyn[n] > 0 ) 
			return dyn[n];
		else
			dyn[n] = 1 + possibleWays(n-1, dyn) + possibleWays(n-2, dyn) + possibleWays(n-3, dyn);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Steps steps = new Steps();
		int[] dyn = new int[n+1];
		System.out.println("Total no. of ways: " + steps.possibleWays(n, dyn));

	}
}