Problem Description

Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).



Problem Constraints
1 <= N <= 10000



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the longest palindromic substring of string A.



Example Input
A = "aaaabaaa"


Example Output
"aaabaaa"


Example Explanation
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".



public class Solution {
    public String longestPalindrome(String A) {
        
        
        
        int start=0;
        int end=0;
        
        for(int i=0;i<A.length()-1;i++){
            
            int len1=getStartAndEndIndex(A,i,i);
            
            int len2=getStartAndEndIndex(A,i,i+1);
            
            int len=Math.max(len1,len2);
        if (len > end - start+1) {
            start = i - (len - 1) / 2;
            end = i + len / 2;
           }
        }
        //
        return A.substring(start,end+1);
    }
    //
    private int getStartAndEndIndex(String A, int left,int right){
        
        
        
        while(left>=0 && right<A.length() && A.charAt(left)== A.charAt(right) ){
            left--;
            right++;
            
        }
        return right-left-1;
    }
}
