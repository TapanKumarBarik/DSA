//https://leetcode.com/problems/palindrome-number/



class Solution {
    public boolean isPalindrome(int x) {
            if(x==0)return true;
        
        if(x<0 || x%10==0){
            return false;
        }
    
        
        int reversedNum=0;
        
        while(x>reversedNum){
            
            
      int pop=x%10;
            reversedNum=(reversedNum*10)+pop;
            
            x=x/10;
            
            
        }
        
        if(x==reversedNum || x== (reversedNum/10))return true;
        
        return false;
        
    }
}
