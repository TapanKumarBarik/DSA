Problem Description

Little Ponny is given a string A and he wants to find out the lexicographically minimum subsequence from it of size >= 2. Can you help him?

A string a is lexicographically smaller than a string b, if the first different letter in a and b is smaller in a. For example, "abc" is lexicographically smaller than "acc" because the first different letter is 'b' and 'c' which is smaller in "abc".

 



Problem Constraints
1 <= |A| <= 105

A only contains lowercase alphabets.



Input Format
The first and the only argument of input contains the string, A.



Output Format
Return a string representing the answer.



Example Input
Input 1:

 A = "abcdsfhjagj" 
Input 2:

 A = "ksdjgha" 


Example Output
Output 1:

 "aa" 
Output 2:

 "da" 


Example Explanation
Explanation 1:

 "aa" is the lexicographically minimum subsequence from A. 
Explanation 2:

 "da" is the lexicographically minimum subsequence from A. 

   
   
   
   public class Solution {
    public String solve(String A) {
        
        String s="";
        
        int fm=0;
        
        for(int i=1;i<A.length()-1;i++){
            if(A.charAt(i)<A.charAt(fm)){
                fm=i;
            }
            
        }
        
        s+=A.charAt(fm);
        int sm=fm+1;
        
         for(int i=sm+1;i<A.length();i++){
            if(A.charAt(i)<A.charAt(sm)){
                sm=i;
            }
            
        }
           s+=A.charAt(sm);
           return s;
    }
}
