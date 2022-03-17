Problem Description

The demons had captured the princess and imprisoned her in the bottom-right corner of a dungeon. The dungeon consists of M x N rooms laid out in a 2D grid. Our valiant knight was initially positioned in the top-left room and must fight his way through the dungeon to rescue the princess.

The knight has an initial health point represented by a positive integer. If at any point his health point drops to 0 or below, he dies immediately.

Some of the rooms are guarded by demons, so the knight loses health (negative integers) upon entering these rooms; other rooms are either empty (0's) or contain magic orbs that increase the knight's health (positive integers).

In order to reach the princess as quickly as possible, the knight decides to move only rightward or downward in each step.

Given a 2D array of integers A of size M x N. Find and return the knight's minimum initial health so that he is able to rescue the princess.



Problem Constraints
1 <= M, N <= 500

-100 <= A[i] <= 100



Input Format
First and only argument is a 2D integer array A denoting the grid of size M x N.



Output Format
Return an integer denoting the knight's minimum initial health so that he is able to rescue the princess.



Example Input
Input 1:

 A = [ 
       [-2, -3, 3],
       [-5, -10, 1],
       [10, 30, -5]
     ]
Input 2:

 A = [ 
       [1, -1, 0],
       [-1, 1, -1],
       [1, 0, -1]
     ]


Example Output
Output 1:

 7
Output 2:

 1


Example Explanation
Explanation 1:

 Initially knight is at A[0][0].
 If he takes the path RIGHT -> RIGHT -> DOWN -> DOWN, the minimum health required will be 7.
 At (0,0) he looses 2 health, so health becomes 5.
 At (0,1) he looses 3 health, so health becomes 2.
 At (0,2) he gains 3 health, so health becomes 5.
 At (1,2) he gains 1 health, so health becomes 6.
 At (2,2) he looses 5 health, so health becomes 1.
 At any point, the health point doesn't drop to 0 or below. So he can rescue the princess with minimum health 7.
 
Explanation 2:

 Take the path DOWN -> DOWN ->RIGHT -> RIGHT, the minimum health required will be 1.
                                                                                                                                                 
                                                                                                                                                 
                                                                                                                                                 
                                                                                                                                                 
                                                                                                                                                 
                                                                                                                                                 
                                                                                                                                                 
                                                                                                                                                 
                                                                                                                                                 
                                                                                                                                                 
                                                                                                                                                 
                                                                                                                                                 
                                                                                                                                                 public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        
    int row = dungeon.length;
    int col = dungeon[0].length;
    int[][] dp = new int[row][col];    
    
    // Min health required in last cell is 1 unless the cell has a deamon in it, 
    // then the min health required is 1 more than the absolute value of negative value in the cell
    dp[row][col] = Math.max(1, 1 - dungeon[row-1][col-1]); 
    
    for(int r=row-1; r >= 0; r--){
      for(int c=col-1; c >= 0; c--){
        // Ignoring the calculation of the last cell as we already did it
        if(r == row-1 && c == col-1) continue;
         
        
        int minHealthToGoRight = minHealth(r, c, r, c+1, dungeon, dp);
        int minHealthToGoDown = minHealth(r, c, r+1, c, dungeon, dp);
        
        // Min health at r,c is the min health needed to go down or right
        dp[r][c] = Math.min(minHealthToGoRight, minHealthToGoDown);
      }
    }    
    return dp[0][0];
  }
  
  int minHealth(int currRow, int currCol, int nextRow, int nextCol, int[][] dungeon, int[][]dp){
    if(nextRow >= dungeon.length || nextCol >= dungeon[0].length)
      return Integer.MAX_VALUE;
    
    // Min health to move in a cell is 1 unless the next cell requires additional health,
    // then we calculate that and the max out of these 2 will be minHealth required to move into the next cell
    return Math.max(1, dp[nextRow][nextCol] - dungeon[currRow][currCol]);
  }
}
