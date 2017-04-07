//PROBLEM STATEMENT: 
//Output Format
//
//For each string, print whether or not the string of brackets is balanced on a new line. If the brackets are balanced, print YES; otherwise, print NO.
//
//Sample Input
//
//3
//{[()]}
//{[(])}
//{{[[(())]]}}
//Sample Output
//
//YES
//NO
//YES
//Explanation
//
//The string {[()]} meets both criteria for being a balanced string, so we print YES on a new line.
//The string {[(])} is not balanced, because the brackets enclosed by the matched pairs [(] and (]) are not balanced. Thus, we print NO on a new line.
//The string {{[[(())]]}} meets both criteria for being a balanced string, so we print YES on a new line.


//--------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
    
    // Must be even
    if ((expression.length() & 1) == 1) 
        return false;
    else {
    char[] brackets = expression.toCharArray();
    Stack<Character> s = new Stack<>();
    for (char bracket : brackets)
        switch (bracket) {
            case '{': s.push('}'); break;
            case '(': s.push(')'); break;
            case '[': s.push(']'); break;
            default :
                if (s.empty() || bracket != s.peek())
                    return false;
                s.pop();
        }
    return s.empty();
    }
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
