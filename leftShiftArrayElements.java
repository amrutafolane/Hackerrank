//PROBLEM STATEMENT: Shift array elements to left by given number of shifts. 
//LEFT-SHIFT ARRAY ELEMENTS -- O(N^2) 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        for (int i=0; i<d; i++) {
            int temp = a[0];
            for (int j=0; j<n-1; j++) {
                a[j] = a[j+1];                
            }
            a[n-1] = temp;
        }
        
        //printing the new left-shifted array
        //System.out.println("New Left-Shifted Array: ");
        for (int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
