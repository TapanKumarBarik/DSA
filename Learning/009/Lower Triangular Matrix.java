Problem Description

You are given a N X N integer matrix A. You have to tell whether it is a lower triangular matrix or not.

A square matrix is called lower triangular if all the entries above the main diagonal are zero. For any matrix P if elements P[i, j] = 0 (where j > i (1-based)).

image



Problem Constraints
2 <= N <= 103

-1000 <= A[i][j] <= 1000



Input Format
First and only argument is a 2D integer matrix A.



Output Format
Return 1 if A is a lower triangular matrix, else return 0.



Example Input
Input 1:

 A = [[1, 0, 0],
      [0, 0, 0],
      [-7, -8, 9]]
Input 2:

 A = [[0, 2],
      [0, 0]]


Example Output
Output 1:

 1 
Output 2:

 0 


Example Explanation
Explanation 1:

 As A[1][2], A[1][3] and A[2][3] are zero, it is a lower triangular matrix.
Explanation 2:

 As A[1][2] is not equal to zero, it is not a lower triangular matrix.
   
   public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        
        
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                
                if((i<j) && A[i][j]!=0){
                    return 0;
                    
                }
            }
        }
        return 1;
    }
}
