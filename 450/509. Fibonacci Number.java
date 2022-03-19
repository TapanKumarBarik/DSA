https://leetcode.com/problems/fibonacci-number/


class Solution {
    public int fib(int n) {
        if(n<=1)return n;
        
         return fib(n-1)+fib(n-2);
    }
}



class Solution {
    public int fib(int n) {
        int fib1=0;
        int fib2=1;
        
        
        if(n<2)return n;
        
        int fib3=0;
        
        for(int i=2;i<=n;i++){
            
            fib3=fib1+fib2;
            
            fib1=fib2;
            fib2=fib3;
            
        }
        return fib3;
    }
}
