

Problem Description

You have given a string A having Uppercase English letters.

You have to find that how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.



Problem Constraints
1 <= length(A) <= 105



Input Format
First and only argument is a string A.



Output Format
Return an integer denoting the answer.



Example Input
Input 1:

 A = "ABCGAG"
Input 2:

 A = "GAB"


Example Output
Output 1:

 3
Output 2:

 0


Example Explanation
Explanation 1:

 Subsequence "AG" is 3 times in given string 
Explanation 2:

 There is no subsequence "AG" in the given string.
   
   
   
   
   
   
public class Solution {
    public int solve(String A) {
        
        
      int count_g = 0;
      int ans = 0;
      for(int i = A.length() -1; i >= 0; i--) {
        char c = A.charAt(i);
        
        if (c == 'G'){ count_g ++;}
         
        
        if(c == 'A'){ ans += count_g;}
         
          
        
        }
        return ans;
    }
}

