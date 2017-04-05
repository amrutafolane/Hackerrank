//PROBLEM STATEMENT: Please refer the .pdf with the same name.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i=0; i<word.length(); i++) {
            hashMap.put(word.charAt(i), h[word.charAt(i) - 'a']);            
        }
        
        int max=0;
        for (int i=0; i<word.length(); i++) {
            int entry = hashMap.get(i);
            if (entry > max) 
                max = entry;
        }
        
        System.out.println("Area of the highlighted text is: " + (word.length()*1*max));
}
    
}