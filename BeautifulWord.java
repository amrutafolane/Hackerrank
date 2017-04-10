//PROBLEM STATEMENT: 
//We consider a word, , to be beautiful if the following two conditions are satisfied:
//
//No two consecutive characters are the same.
//No two consecutive characters are in the following vowel set: a, e, i, o, u, y. Note that we consider y to be a vowel in this challenge.
//
//Sample Input 1
//
//badd
//Sample Output 1
//
//No
//Explanation 1
//
//There are two consecutive occurrences of d, so it is not beautiful and we print No.
//
//Sample Input 2
//
//yes
//Sample Output 2
//
//No
//Explanation 2
//
//The first pair of letters (y and e) both appear in our set of vowel characters, so the word is not beautiful and we print No.
//
//--------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean checkIfVowel(char c) {
        
        char[] vowels = {'a','e','i','o','u','y'};
        
        for(char itrChar : vowels){
            if (c == itrChar)
                return true;
        }
        return false;
    }

    public static boolean isBeautiful(String w) {
        
        char[] str = w.toCharArray();       
        
        if (w.length() == 1)
            return true;
        
        for (int i=1; i<w.length(); i++) { 
            if ((str[i] == str[i-1]) || (checkIfVowel(str[i]) && checkIfVowel(str[i-1]))){
                return false;
            } 
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        //# Print 'Yes' if the word is beautiful or 'No' if it is not.
        
        boolean ans = isBeautiful(w);
        if (ans == true)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}
