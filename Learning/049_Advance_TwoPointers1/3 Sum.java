Problem Description

Given an array A of N integers, find three integers in A such that the sum is closest to a given number B. Return the sum of those three integers.

Assume that there will only be one solution.



Problem Constraints
-108 <= B <= 108
1 <= N <= 104
-108 <= A[i] <= 108


Input Format
First argument is an integer array A of size N.

Second argument is an integer B denoting the sum you need to get close to.



Output Format
Return a single integer denoting the sum of three integers which is closest to B.



Example Input
Input 1:

A = [-1, 2, 1, -4]
B = 1
Input 2:

 
A = [1, 2, 3]
B = 6


Example Output
Output 1:

2
Output 2:

6


Example Explanation
Explanation 1:

 The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
Explanation 2:

 Take all elements to get exactly 6.

   
   
   
   
   
   
   public class Solution {
    public int threeSumClosest(int[] A, int B) {
        Arrays.sort(A);
        if(A.length==3){
            return A[0]+A[1]+A[2];
        }
        int min_ans=Integer.MAX_VALUE;
        int res=0;
        
        for(int i=0;i<A.length-2;i++){
            
            int low=i+1;
            int high=A.length-1;
          while(low<high){
              
              int sum=A[i]+A[low]+A[high];
              int diff=Math.abs(sum-B);
              if(diff<min_ans){
                  min_ans=diff;
                  res=sum;
              }
              if(sum>B)high--;
              if(sum<B)low++;
              if(sum==B)return B;
          }
        }
        return res;
    }
}
