//PROBLEM STATEMENT:
//A kidnapper wrote a ransom note but is worried it will be traced back to him. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use whole words available in the magazine, meaning he cannot use substrings or concatenation to create the words he needs.
//
//Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.
//
//Input Format
//
//The first line contains two space-separated integers describing the respective values of  (the number of words in the magazine) and  (the number of words in the ransom note). 
//The second line contains  space-separated strings denoting the words present in the magazine. 
//The third line contains  space-separated strings denoting the words present in the ransom note.
//
//Constraints
//
//.
//Each word consists of English alphabetic letters (i.e.,  to  and  to ).
//The words in the note and magazine are case-sensitive.
//Output Format
//
//Print Yes if he can use the magazine to create an untraceable replica of his ransom note; otherwise, print No.
//
//Sample Input
//
//6 4
//give me one grand today night
//give one grand today
//Sample Output
//
//Yes
//Explanation
//
//All four words needed to write an untraceable replica of the ransom note are present in the magazine, so we print Yes as our answer.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean checkReplication(String[] magazine, String[] ransom) {
        
        boolean isValid = true;
        //populating HashMap "magazineMap" with magazine words
        Map<String, Integer> magazineMap = new HashMap<>();
        for (String word: magazine){  
            if (magazineMap.containsKey(word) == false) 
                magazineMap.put(word, 1);
            else
                magazineMap.put(word, magazineMap.get(word)+1);
        }
       
        //Checking for words of ransom note in magazineMap and deleting common ones, if uncommon set isValid = false
        
        for (String ransomNoteWord: ransom){
            if ( magazineMap.containsKey(ransomNoteWord) == false){
                isValid = false;
                break;
            } else {
                if( magazineMap.get(ransomNoteWord) == 0 ) {
                isValid = false;
                break;
            }
                magazineMap.put(ransomNoteWord, magazineMap.get(ransomNoteWord)-1);
            }
        }
        
        return isValid;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        
        boolean ans = checkReplication(magazine, ransom);
        if (ans == true) 
            System.out.println("Yes"); 
        else
            System.out.println("No");
    }
}
