Problem Description

Given an array of integers A, find and return the peak element in it. An array element is peak if it is NOT smaller than its neighbors.

For corner elements, we need to consider only one neighbor. We ensure that answer will be unique.

NOTE: Users are expected to solve this in O(log(N)) time.



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 109



Input Format
The only argument given is the integer array A.



Output Format
Return the peak element.



Example Input
Input 1:

A = [1, 2, 3, 4, 5]
Input 2:

A = [5, 17, 100, 11]


Example Output
Output 1:

 5
Output 2:

 100


Example Explanation
Explanation 1:

 5 is the peak.
Explanation 2:

 100 is the peak.




   
   
   
   public class Solution {
    public int solve(int[] A) {
        int n=A.length;
        if(n==1)return A[0];
        
        if(A[0]>=A[1])return A[0];
        
        if(A[n-1]>=A[n-2])return A[n-1];
        
        
        //apply binary search
        
        int start=1;
        int end=n-2;
        
        while(start<=end){
            
            int mid=(start+end)/2;
            
            
            if(A[mid-1]<=A[mid] &&  A[mid]>=A[mid+1]){
                
                return A[mid];
                
            }
            if(A[mid-1]<A[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
        
    }
}
