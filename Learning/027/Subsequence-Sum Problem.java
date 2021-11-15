Problem Description

You are given an array of integers of N size.

You have to find that there is any subsequence exists or not whose sum is equal to B.



Problem Constraints
1 <= N <= 20
1 <= A[i] <= 100000
0 <= B <= 1e9


Input Format
First Argument is array of integers A
Second Argument is B



Output Format
Return 1 if any subsequence sum is equal to B otherwise return 0.



Example Input
Input 1:
    
A=[1,20,13,4,5]
B=18
Input 2:

              
A=[2,2,2,2]
B=5


Example Output
1
Output 1:


1
Output 2:


0


Example Explanation
Explanation 1:
 There is as subsequence present at indexes 1,3,4 whose sum is 18
Explanation 2:

 
There is no possible subsequence whose sum is 5
NOTE: Array is considered 1 based indexing for the above explanation.
  
  
  
  
  
  
  public class Solution {
    boolean r1,r2;
    public int solve(int[] A, int B) {
        
    boolean ans= rec(0,A,0,B);
    if(ans){
        return 1;
    }
    return 0;
    }
    
    
    private boolean rec (int sum, int[] A, int i , int  b ){
    
    if(sum>b){
        return false;
        
    }
    
    if(sum==b){
        return true;
    }
    
    if(i<A.length){
        r1= rec(sum+A[i],A,i+1,b);
         r2=rec(sum,A,i+1,b);
    }
    
    return r1 || r2;
    
}


    
    
}
//pseudo 







int Solution::solve(vector<int> &A, int B) {
    int n; n=A.size();
    int k; k=B;
    int flag=0;
    for(int i=0;i<(1<<n);i++) {
        int sum=0;
        for(int j=0;j<n;j++){
            if(i&(1<<j)) sum+=A[j];
        }
        if(sum==k) flag=1;
    }
    if(flag) return 1;
    else return 0;
}

