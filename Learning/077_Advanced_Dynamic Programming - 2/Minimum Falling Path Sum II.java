Problem Description

Given a square grid of integers A, a falling path with non-zero shifts is a choice of exactly one element from each row of A, such that no two elements chosen in adjacent rows are in the same column.

Return the minimum sum of a falling path with non-zero shifts.



Problem Constraints
1 <= |A| == |A[i]| <= 200
-99 <= A[i][j] <= 99



Input Format
First argument is a 2D array of integers.



Output Format
Return an integer denoting the minimum sum.



Example Input
Input 1:

 A =  [ [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9] ]
Input 2:

 A =  [ [17, 14, 19],
        [12, 18, 9],
        [20, 10, 1] ]


Example Output
Output 1:

 13
Output 2:

 27


Example Explanation
Explanation 1:

 The possible falling paths are:
 [1,5,9], [1,5,7], [1,6,7], [1,6,8],
 [2,4,8], [2,4,9], [2,6,7], [2,6,8],
 [3,4,8], [3,4,9], [3,5,7], [3,5,9]
 The falling path with the smallest sum is [1,5,7], so the answer is 13.
Explanation 2:

 The possible falling paths are:
 The falling path with the smallest sum is [14,12,1], so the answer is 27.




   
   
   
   
   
   public class Solution {
    public int solve(int[][] arr) {
        
        
         int n = arr.length;
         
        for (int row=n-2;row>=0;row--) {
            for (int col=0;col<n;col++) {
                
                int min = Integer.MAX_VALUE;
                // Values to the left.
                for(int k=0;k<col;k++) {
                    min = Math.min(arr[row+1][k],min);
                }
                // Values to the right.
                for (int k=col+1;k<n;k++) {
                    min = Math.min(arr[row+1][k],min);
                }
                arr[row][col]+= min;
            }
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            result = Math.min(result, arr[0][i]);
        }
        return result;
    }
}
