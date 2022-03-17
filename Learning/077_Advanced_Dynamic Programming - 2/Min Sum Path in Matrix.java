Problem Description

Given a M x N grid A of integers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Return the minimum sum of the path.

NOTE: You can only move either down or right at any point in time.



Problem Constraints
1 <= M, N <= 2000

-1000 <= A[i][j] <= 1000



Input Format
First and only argument is a 2-D grid A.



Output Format
Return an integer denoting the minimum sum of the path.



Example Input
Input 1:

 A = [
       [1, 3, 2]
       [4, 3, 1]
       [5, 6, 1]
     ]
Input 2:

 A = [
       [1, -3, 2]
       [2, 5, 10]
       [5, -5, 1]
     ]


Example Output
Output 1:

 8
Output 2:

 -1


Example Explanation
Explanation 1:

 The path will be: 1 -> 3 -> 2 -> 1 -> 1.
Input 2:

 The path will be: 1 -> -3 -> 5 -> -5 -> 1.
   
   
   
   
   
   
   
   
   
   
   
   
   public class Solution {
    public int minPathSum(int[][] A) {
        
        int row=A.length;
        int col=A[0].length;
        
        int [][]dp=new int[row][col];
        
        dp[row-1][col-1]=A[row-1][col-1];
        
        
        
        for(int r=row-1;r>=0;r--){
            
            for(int c=col-1;c>=0;c--){
                
                
                if(r==row-1 && c==col-1)continue;
                
                
                int min=minFunc(r,c,r,c+1, A, dp);
                
                int max=minFunc(r,c,r+1, c, A, dp);
                
                dp[r][c]=Math.min(min, max)+A[r][c];
            }
        }
        
        return dp[0][0];
        
    }
    
    private int minFunc(int currRow, int currCol, int nextRow, int nextCol, int [][]A, int [][]dp){
        
        
        if(nextRow>=A.length  || nextCol>=A[0].length){
            return Integer.MAX_VALUE;
        }
        
        return  dp[nextRow][nextCol];
    }
}
