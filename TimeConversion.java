// PROBLEM STATEMENT: Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Sample Input
07:05:45PM

Sample Output
19:05:45

//--------------------------------------------------------------------------------------------------------------------------------------


import java.io.*;
import java.util.*;

class Solution {

    public static void convert12To24(String time12) {
        
        int hours = Integer.parseInt(time12.substring(0,2));
        String mins = time12.substring(3,5);
        String secs = time12.substring(6,8);
        String ampm = time12.substring(8,10);
        
        if(ampm.equals("AM") && hours == 12){
            System.out.print("00:");   
        }
        else if (ampm.equals("PM") && (hours < 12)){
            System.out.print(12+hours + ":");
        } 
        else if (ampm.equals("PM") && (hours == 12)){
            System.out.print(hours + ":");
        } else {
            System.out.print("0" + hours + ":");
        }
        
        System.out.print(mins + ":");
        System.out.print(secs);
        
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */  
        Scanner scanner = new Scanner(System.in);
        String time12 = scanner.nextLine();
        
        convert12To24(time12);
    }
}