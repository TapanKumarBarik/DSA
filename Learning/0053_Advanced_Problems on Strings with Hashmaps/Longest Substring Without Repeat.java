Problem Description

Given a string A, find the length of the longest substring without repeating characters.

Note: Users are expected to solve in O(N) time complexity.



Problem Constraints

1 <= size(A) <= 106

String consists of lowerCase,upperCase characters and digits are also present in the string A.



Input Format

Single Argument representing string A.



Output Format

Return an integer denoting the maximum possible length of substring without repeating characters.



Example Input

Input 1:

 A = "abcabcbb"
Input 2:

 A = "AaaA"


Example Output

Output 1:

 3
Output 2:

 2


Example Explanation

Explanation 1:

 Substring "abc" is the longest substring without repeating characters in string A.
Explanation 2:

 Substring "Aa" or "aA" is the longest substring without repeating characters in string A.
   
   
   
   
   
   public class Solution {
    public int lengthOfLongestSubstring(String A) {
        
        int i=0;
        int j=0;
        int n=A.length();
        HashSet<Character>map=new HashSet();
        int curr=0;
        int max=0;
        while(j<n){
            
            if(!map.contains(A.charAt(j))){
                map.add(A.charAt(j));
                max=Math.max(max,map.size());
             j++;

            }
            else{
                map.remove(A.charAt(i));
                i++;
            }  
        }
    return max;
    }
}
