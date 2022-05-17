//https://leetcode.com/problems/find-first-palindromic-string-in-the-array/

class Solution {
    public String firstPalindrome(String[] words) {
        
        
        int n=words.length;
        for(int i=0;i<n;i++){
            
            if(solve(words[i])){
                return words[i];
            }
        }
        return "";
    }
    boolean solve(String s){
        
        int i=0;
        int n=s.length();
        int j=n-1;
        
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
