Problem Description

Given a string A and integer B, remove all consecutive same characters that have length exactly B.



Problem Constraints
1 <= |A| <= 100000

1 <= B <= |A|



Input Format
First Argument is string A.

Second argument is integer B.



Output Format
Return a string after doing the removals.



Example Input
Input 1:

A = "aabcd"
B = 2
Input 2:

A = "aabbccd"
B = 2


Example Output
Output 1:

 "bcd"
Output 2:

 "d"


Example Explanation
Explanation 1:

 "aa" had length 2.
Explanation 2:

 "aa", "bb" and "cc" had length of 2.


   
   
   
   
   public class Solution {
    public String solve(String A, int B) {
        String s="";
        int start=0;
        int end=A.length();

        while(start<end){
            int start_1=start;
                while(start_1<end && A.charAt(start)==A.charAt(start_1)){
                    start_1++;
                }
            
            if(start_1-start==B){
                start=start_1;
            }
            else{
                s=s+A.charAt(start);
                start++;
            }
            
        }
     return s;

    }
}
