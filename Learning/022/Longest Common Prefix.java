Problem Description

Given the array of strings A, you need to find the longest string S which is the prefix of ALL the strings in the array.

Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

For Example: longest common prefix of "abcdefgh" and "abcefgh" is "abc".



Problem Constraints
0 <= sum of length of all strings <= 1000000



Input Format
The only argument given is an array of strings A.



Output Format
Return the longest common prefix of all strings in A.



Example Input
Input 1:

A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2:

A = ["abab", "ab", "abcd"];


Example Output
Output 1:

"a"
Output 2:

"ab"


Example Explanation
Explanation 1:

Longest common prefix of all the strings is "a".
Explanation 2:

Longest common prefix of all the strings is "ab".
  
  
  
  
## Using sorting
  
  public class Solution {
    public String longestCommonPrefix(String[] A) {
        
        String s="";
        
        if(A.length==0){
            return s;
        }
        if(A.length==1){
            return A[0];
        }
        else{
            
            Arrays.sort(A);
            int length = A[0].length();
            
            for(int i=0;i<length;i++){
                if(A[0].charAt(i)==A[A.length-1].charAt(i)){
                    s+=A[0].charAt(i);
                }
                else{
                    return s;
                }
            }
            
        }
        
        
        
        return s;
        
        
        
    }
}
