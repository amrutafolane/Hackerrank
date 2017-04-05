//PROBLEM STATEMENT: Given two strings of alphabets, return the no. of alphabets to be deleted form both in order to make them anagrams. Please refer the .pdf with the same name for more detailed description.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
    public static int numberNeeded(String a, String b) {
    
        int[] freq = new int[26];
        int result = 0;
        
        //fill the freq of first string to freq[]
        for (int i=0; i<a.length(); ++i) {
            freq[a.charAt(i) - 'a']++;
        }
        
        //deduct the common chars from second string and first
        for (int i=0; i<b.length(); ++i) {
            freq[b.charAt(i) - 'a']--;
        }
        
        //remaining add up as they are to be deleted uncommon ones
        for (int iter: freq)
            result += Math.abs(iter);
        
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
      
        System.out.println(numberNeeded(a, b));
    }
}
