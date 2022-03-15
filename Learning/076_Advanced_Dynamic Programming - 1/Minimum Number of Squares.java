Problem Description

Given an integer A. Return minimum count of numbers, sum of whose squares is equal to A.



Problem Constraints
1 <= A <= 105



Input Format
First and only argument is an inetegr A.



Output Format
Return an integer denoting the minimum count.



Example Input
Input 1:

 A = 6
Input 2:

 A = 5


Example Output
Output 1:

 3
Output 2:

 2


Example Explanation
Explanation 1:

 Possible combinations are : (12 + 12 + 12 + 12 + 12 + 12) and (12 + 12 + 22).
 Minimum count of numbers, sum of whose squares is 6 is 3. 
Explanation 2:

 We can represent 5 using only 2 numbers i.e. 12 + 22 = 5
   
   
   
   
   
   
   
   public class Solution {
    public int countMinSquares(int A) {
        
        
        if(A==1)return 1;
        int[]dp=new int[A+1];
        
        for(int i=0;i<=A;i++){
            dp[i]=-1;
        }
        
        //int res=solve(A, dp);
        
        int res=solve1(A, dp);
        return res;
    }
    
    private int solve1(int n,int[]dp){
        
        if(n==0)return 0;
        
        if(dp[n]!=-1)return dp[n];
        
        dp[n]=1;
        
        int min=Integer.MAX_VALUE;
        
        for(int i=1;i*i<=n;i++){
            
            int x=i*i;
            min=Math.min(min, solve1(n-x, dp) );
            
            
        }
        dp[n]+=min;
        return dp[n];
    }
    
    private int solve(int A, int[]dp){
        
        
        if(A==0)return 0;
        
        if(dp[A]!=-1){
            return dp[A];
        }
        
        dp[A]=1;
        
        int min=Integer.MAX_VALUE;
        
        for(int i=1;i*i<=A;i++){
            int x=i*i;
            min=Math.min(min, solve(A-x,dp));
        }
        dp[A]+=min;
        
        return dp[A];
    }
}
