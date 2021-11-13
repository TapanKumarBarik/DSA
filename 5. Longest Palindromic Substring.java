Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
Example 3:

Input: s = "a"
Output: "a"
Example 4:

Input: s = "ac"
Output: "a"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
  
  
  
  
  
  class Solution {
    public String longestPalindrome(String s) {
        
        
        
        int start=0;
        int end=0;
     for(int i=0;i<s.length();i++){
         
            
        int l1=getApalinDrome(s,i,i);
        int l2=getApalinDrome(s,i,i+1);
         
        int len=Math.max(l1,l2);
        if (len > end - start+1) {
            start = i - (len - 1) / 2;
            end = i + len/ 2;
           }
         
         
        }
         
         
     
        return s.substring(start,end+1);
    }
    
    private int getApalinDrome(String s, int left, int right){
        
        
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
            
        }
        
        return right-left-1;
    }
}
