//PROBLEM STATEMENT: 

//Sample Input 
//2
//4
//1 0 3 2
//3
//2 1 0
//Sample Output 
//
//Yes
//No

//--------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean checkSorted(int[] a) {
    
        for (int i=1; i<a.length; i++) {
            if (a[i] < a[i-1])
                return false;
        }
        return true;
    }
    
    public static void sortMyNos(int[] a) {
        
        for (int i = 1; i<a.length; i++) {
            if ((Math.abs(a[i]-a[i-1]) == 1) && a[i] < a[i-1]) {
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
        }
        
        //check if they're sorted
        if (checkSorted(a))
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            // Write Your Code Here
            sortMyNos(a);    
                        
        }
    }
}
