Delete one
Problem Description

Given an integer array A of size N. You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.

Find the maximum value of GCD.



Problem Constraints
2 <= N <= 105
1 <= A[i] <= 109



Input Format
First argument is an integer array A.



Output Format
Return an integer denoting the maximum value of GCD.



Example Input
Input 1:

 A = [12, 15, 18]
Input 2:

 A = [5, 15, 30]


Example Output
Output 1:

 6
Output 2:

 15


Example Explanation
Explanation 1:

 
 If you delete 12, gcd will be 3.
 If you delete 15, gcd will be 6.
 If you delete 18, gcd will 3.
 Maximum vallue of gcd is 6.
Explanation 2:

 If you delete 5, gcd will be 15.
 If you delete 15, gcd will be 5.
 If you delete 30, gcd will be 5.
   
   
   
   
   
   public class Solution {
    public int solve(int[] A) {
        
        int n=A.length;
        int[] prefixGcd=new int[n];
        int [] suffixGcd=new int[n];
        int result=0;
        
        //calculate Perfix GCD
        for(int i=0;i<n;i++){
            if(i==0){
                prefixGcd[i]=A[i];
            }
            else{
                prefixGcd[i]=gcd(prefixGcd[i-1],A[i]);
            }
        }
        
        //calculate Suffix GCD
        
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
               suffixGcd[i]=A[i]; 
            }
            else{
                suffixGcd[i]=gcd(suffixGcd[i+1],A[i]);
            }
        }
        
        //calculate the max gcd
        
        
        for(int i=0;i<n;i++){
            int temp=0;
            if(i==0){
              temp=gcd(0,suffixGcd[i+1]);  
            }
            else if(i==n-1){
               temp=gcd(prefixGcd[i-1],0);
            }
              else{
                  temp=gcd(prefixGcd[i-1],suffixGcd[i+1]);
              }
              result=Math.max(result,temp);
        }
        
        return result;
    }
    
    private int gcd(int a, int b){
        
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}
