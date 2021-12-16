Problem Description

Write a recursive function that, given a string S, prints the characters of S in reverse order.



Problem Constraints
1 <= |s| <= 1000



Input Format
First line of input contains a string S.



Output Format
Print the character of the string S in reverse order.



Example Input
Input 1:

 scaleracademy
Input 2:

 cool


Example Output
Output 1:

 ymedacarelacs
Output 2:

 looc


Example Explanation
Explanation 1:

 Print the reverse of the string in a single line.
   
   
   
   
   
   
   
   
   
   import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner sc=new Scanner(System.in);
        
        String ss=sc.nextLine();
        String res="";
        
        for(int i=ss.length()-1;i>=0;i--){
            res+=ss.charAt(i);
            
        }
       System.out.println(res);
    }
}
