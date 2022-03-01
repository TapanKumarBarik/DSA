//https://leetcode.com/problems/powx-n/


class Solution {
    public double myPow(double x, int n) {
        double res=pow(x, n);
        return res;
    }
    
    private double pow(double x, long n){
        
        if(n==0)return 1.0;
        if(n==1)return x;
        if(n<0){ return pow(1/x, -n); }
        double  res=pow(x*x, n/2);
        if(n%2==1){ return res*x;}
         return res;
    }
}
