
//https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        
        int num=0;
        if(x<0)return false;
        if(x==0)return true;
        if(x%10==0)return false;
        
        while(x>=num){
        if(x==num)return true;
            int temp=x%10;
            num*=10;
            num+=temp;
             if(x==num)return true;
            x/=10;
        }
        return false;
    }
}
