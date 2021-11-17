Problem Description

Given an array of integers A of size N.

Value of a subarray is defined as BITWISE OR of all elements in it.

Return the sum of Value of all subarrays of A % 109 + 7.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 108



Input Format
The first argument given is the integer array A.



Output Format
Return the sum of Value of all subarrays of A % 109 + 7.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [7, 8, 9, 10]


Example Output
Output 1:

 71
Output 2:

 110


Example Explanation
Explanation 1:

 Value([1]) = 1
 Value([1, 2]) = 3
 Value([1, 2, 3]) = 3
 Value([1, 2, 3, 4]) = 7
 Value([1, 2, 3, 4, 5]) = 7
 Value([2]) = 2
 Value([2, 3]) = 3
 Value([2, 3, 4]) = 7
 Value([2, 3, 4, 5]) = 7
 Value([3]) = 3
 Value([3, 4]) = 7
 Value([3, 4, 5]) = 7
 Value([4]) = 4
 Value([4, 5]) = 5
 Value([5]) = 5
 Sum of all these values = 71
Explanation 2:

 Sum of value of all subarray is 110.



public class Solution {
    public int solve(int[] A) {
        long ans =0;
        int mod=1000000007;
        long contrib=0;
        int N =A.length;
        for(int i=0; i<=30;i++){
            int [] bit = new int[N];
            for(int j=0; j<N;j++){
                if(checkBit(A[j],i)){
                    bit[j]=1;
                } else {
                    bit[j]=0;
                }
            }

         long c= countOR(bit, N); 
         
         ans = (ans+((c*(1<<i))%mod))%mod;
        }
        
        return (int) ans;
    }
    
    public boolean checkBit(int x, int i){
          if((x&(1<<i))!=0) return true;
        else  return false;
    }
    
    public long countOR (int[] x, int N) {
        long total = ((long)N*(long)(N+1))/2;
        long count=0;
    
        int z =x.length;
        long result=0;
        for(int i=0; i<z; i++){
            if(x[i]==0) count++;
            else {
                result+=(count*(count+1))/2;
                count=0;
            }
        }
        if(count>0) result+=(count*(count+1))/2;
        
        return total-result;
        
    }
}

   
   
   
   
   
   
   
   
