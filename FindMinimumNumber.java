import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void stringToCompute(int n){
        
        int k = n;
        System.out.print("min(int,"); 
        while (k > 2) {
            System.out.print(" min(int,");       
            k--;
        } 
        
        System.out.print(" int)");
        
        while (n>2) {
            System.out.print(")");
            n--;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        stringToCompute(n);
    }
}
