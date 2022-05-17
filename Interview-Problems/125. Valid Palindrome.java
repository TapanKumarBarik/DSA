//https://leetcode.com/problems/valid-palindrome/


class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        
        int i=0;
        int n=s.length();
        int j=n-1;
        
        while(i<j){
            
            if(i<n && Character.isLetterOrDigit(s.charAt(i)) == false){
                i++;
                continue;
            }
            if(j>=0 && Character.isLetterOrDigit(s.charAt(j)) == false){
                j--;
                continue;
            }
            
            //
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        
        return true;
    }
}
