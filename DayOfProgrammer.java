//PROBLEM STATEMENT: Please refer the .pdf with the same name.



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean checkLeap(int y) {
            int flag = 0;
            
            if ( ((y%400) == 0) || (((y%4) == 0) && (y%100) != 0) )   //check for gregorian
                flag = 1;
            else 
                return false;
            
            
            if (y%4 == 0) {                                         //check for julian
                flag = 1;
            }
            
            if (flag == 1)
                return true;
            else
                return false;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        // your code goes here    
                
        //common sum of all months till August except the variable Feb
        int total_Feb = 31 + 31 + 30 + 31 + 30 + 31 + 31;
        int total = 0;
        
        if (checkLeap(y)){
            if (y == 1918) {
                total = total_Feb + (29-13);        //transitional leap year
            } else {
                total = total_Feb + 29;             //normal leap year
            }
        } else {
            if (y == 1918) {
                total = total_Feb + (28-13);        //transitional leap year
            } else {
                total = total_Feb + 28;             //normal leap year
            }
        }
        
        //calculate day
        int day = 256 - total;
        
        System.out.println(day + ".09." + y);
       
    }
}