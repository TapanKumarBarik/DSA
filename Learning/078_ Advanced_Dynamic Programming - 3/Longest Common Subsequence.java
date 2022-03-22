Problem Description

Given two strings A and B. Find the longest common subsequence ( A sequence which does not need to be contiguous), which is common in both the strings.

You need to return the length of such longest common subsequence.



Problem Constraints
1 <= Length of A, B <= 1005



Input Format
First argument is a string A.
Second argument is a string B.



Output Format
Return an integer denoting the length of the longest common subsequence.



Example Input
Input 1:

 A = "abbcdgf"
 B = "bbadcgf"
Input 2:

 A = "aaaaaa"
 B = "ababab"


Example Output
Output 1:

 5
Output 2:

 3


Example Explanation
Explanation 1:

 The longest common subsequence is "bbcgf", which has a length of 5.
Explanation 2:

 The longest common subsequence is "aaa", which has a length of 3.
   
   
   
   
   
   
   
   public class Solution {
    public int solve(String s1, String s2) {
        
                int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < s1.length(); ++i)
   {
                for (int j = 0; j < s2.length(); ++j)
                {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        dp[i + 1][j + 1] = 1 + dp[i][j];
                    }
                else {
                    dp[i + 1][j + 1] =  Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
                }

   }
        return dp[s1.length()][s2.length()];
    }
}
