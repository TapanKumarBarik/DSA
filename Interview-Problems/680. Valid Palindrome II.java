//https://leetcode.com/problems/valid-palindrome-ii/


class Solution {
    public boolean validPalindrome(String s) {
     
        int i=0;
        int n=s.length();
        
        int j=n-1;
        
       while(i<j){
           
           if(s.charAt(i)!=s.charAt(j)){
               return solve(s,i+1,j)|| solve(s, i, j-1);
           }
           i++;
           j--;
       }
        return true;
    }
    
    private boolean solve(String s, int i, int j){
         while(i<j){
           
           if(s.charAt(i)!=s.charAt(j)){
               return false;
           }
           i++;
           j--;
       }
        return true;
    }
}
