Problem Description

Given an integer array A of size N.
You have to find all possible non-empty subsequence of the array of numbers and then, for each subsequence, find the difference between the largest and smallest numbers in that subsequence Then add up all the differences to get the number.

As the number may be large, output the number modulo 1e9 + 7 (1000000007).

NOTE: Subsequence can be non-contiguous.



Problem Constraints
1 <= N <= 10000

1<= A[i] <=1000



Input Format
First argument is an integer array A.



Output Format
Return an integer denoting the output.



Example Input
Input 1:

A = [1, 2]
Input 2:

A = [1]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

All possible non-empty subsets are:
[1]    largest-smallest = 1 - 1 = 0
[2]    largest-smallest = 2 - 2 = 0
[1 2]  largest-smallest = 2 - 1 = 1
Sum of the differences = 0 + 0 + 1 = 1
So, the resultant number is 1
Explanation 2:

 Only 1 subsequence of 1 element is formed.
   
   
   
   
   
   public class Solution {
    public int solve(int[] A) {
        
        long max=0;
        long min=0;
        
        Arrays.sort(A);
        
        for(int i=0;i<A.length;i++){
            
            max=(max+mul(A[i],pow((long)2,(long)i)))%1000000007;
            max=max%1000000007;
           
        }
        
        long mull=0;
            
        for(int i=A.length-1;i>=0;i--){
            
            min=(min+mul(A[i],pow((long)2,mull)))%1000000007;
            mull++;
            min=min%1000000007;
        }
        
       return (int)(max%1000000007-min%1000000007+1000000007)%1000000007;
       
        
    }
    
    private long mul(long a , long b  ){
        return (a*b)%1000000007;
    }
    private long pow(long a, long b){
        
        long res=1;
        
        
        while(b>0){
            
            if(b%2==1){
                res=mul(res,a);
                
            }
            a=mul(a,a);
            b=b/2;
            
        }
        return res;
        
    }
}
