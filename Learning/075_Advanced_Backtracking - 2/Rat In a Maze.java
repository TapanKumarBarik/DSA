Problem Description

Given a grid A, a rat is at position (1, 1). He wants to go to the position (n, n) where n is size of the square matrix A.

1 represents a traversable cell and 0 represents a non-traversable cell. Rat can only move right or down.

Return a path that the rat can take.



Problem Constraints
1 <= |A| <= 4



Input Format
First and only argument is the vector of vectors A.



Output Format
Return a vector of vectors that denotes a path that can be taken.



Example Input
Input 1:

A = [   [1, 0]
        [1, 1]
    ]
Input 2:

A = [    [1, 1, 1]
         [1, 0, 1]
         [0, 0, 1]
    ]


Example Output
Output 1:

[   [1, 0]
    [1, 1]
]
Output 2:

[    [1, 1, 1]
     [0, 0, 1]
     [0, 0, 1]
]


Example Explanation
Explanation 1:

 Path is shown in output.
Explanation 2:

 Path is shown in output.


   
   
   
   
         
         
         public class Solution {
    public int[][] solve(int[][] A) {
        
        int n=A.length;
        
        int[][]res=new int[n][n];
        
        backtrack(A, res, 0,0,n);
        
        return res;
    }
    
    private boolean backtrack(int[][]A, int[][]res, int i, int j , int n){
        
        
        if(i==n-1 && j==n-1 && A[i][j]==1){
            res[i][j]=1;
            return true;
        }
        
        if(i>=0 && i<n && j>=0 && j<n && A[i][j]==1){
            
            if(res[i][j]==1)return false;
            
            res[i][j]=1;
            
            if(backtrack(A, res, i+1,j,n))return true;
            if(backtrack(A, res, i,j+1,n))return true;
            if(backtrack(A, res, i-1,j,n))return true;
            if(backtrack(A, res, i,j-1,n))return true;
            
            res[i][j]=0;
            return false;
            
        }
        return false;
    }
}

         
         
         
         
   
   
   public class Solution {
    
    public int[][] solve(int[][] A) {
        
        int N=A.length;
         int sol[][] = new int[N][N];
        solveMazeUtil(A, 0, 0, sol,N);
        return sol;
    }


    boolean solveMazeUtil(int maze[][], int x, int y, int sol[][],int N)
    {

        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        if (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1) {
              if (sol[x][y] == 1)return false;
                  
            sol[x][y] = 1;
            
            if (solveMazeUtil(maze, x + 1, y, sol,N)) return true;
            if (solveMazeUtil(maze, x, y + 1, sol,N)) return true;
            if (solveMazeUtil(maze, x - 1, y, sol,N)) return true;
            if (solveMazeUtil(maze, x, y - 1, sol,N)) return true;

            sol[x][y] = 0;
            
            return false;
        }
 
        return false;
    }
}
