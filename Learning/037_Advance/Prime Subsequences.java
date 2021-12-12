Given an array A having N positive numbers. You have to find the number of Prime subsequences of A.

A Prime subsequence is one that has only prime numbers, for example [2, 3], [5] are the Prime subsequences where [2, 4] and [1, 2, 3, 4] are not.



Input Format

The first argument given is an Array A, having N integers.
Output Format

Return an integer X, i.e number of Prime subsequences. 
As X can be very large print X % (1000000007), here % is modulus operator.
Constraints

1 <= N <= 1e3
1 <= A[i] <= 1e6
For Example

Input:
    A = [1, 2, 3]
Output:
     3

Explanation:
    no. Subsequences      Prime subsequences
    1.  [1]                     No
    2.  [1, 2]                  No
    3.  [1, 3]                  No
    4.  [1, 2, 3]               No
    5.  [2]                     Yes
    6.  [2, 3]                  Yes
    7.  [3]                     Yes
    8.  []                      No

    here we have 3 subsequences(5, 6, 7) those have only prime number(s). 
      
      
      
      
      
      public class Solution {
    public int solve(int[] A) {
        
        int count=0;
        for(int i=0;i<A.length;i++){
            if(isPrime(A[i])){
                count++;
            }
        }
        return power(2,count)-1;
    }
    
    private boolean isPrime (int num){
        
        if(num==1){
            return false;
        }
        
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    private int power(int num, int count){
        
        if(count==0){
            return 1;
        }
        if(num==0){
            return 0;
        }
        
        long y=0;
         if(count%2==0){
            
             y=power(num, count/2);
            y=(y*y)%1000000007;
        }
        else{
             y=power(num, count/2);
            y=(((y*y)%1000000007)*num)%1000000007;
            
            
        }
        
        return (int) (y+1000000007)%1000000007;
    }
}
