Problem Description

Write a program to solve a Sudoku puzzle by filling the empty cells. Empty cells are indicated by the character '.' You may assume that there will be only one unique solution.



A sudoku puzzle,



and its solution numbers marked in red.



Problem Constraints
N = 9


Input Format
First argument is an array of array of characters representing the Sudoku puzzle.


Output Format
Modify the given input to the required answer.


Example Input
Input 1:

A = [[53..7....], [6..195...], [.98....6.], [8...6...3], [4..8.3..1], [7...2...6], [.6....28.], [...419..5], [....8..79]]


Example Output
Output 1:

[[534678912], [672195348], [198342567], [859761423], [426853791], [713924856], [961537284], [287419635], [345286179]]


Example Explanation
Explanation 1:

Look at the diagrams given in the question.
  
  
  
  
  
  
  
  
  import java.util.*;

public class Solution {
       public void solveSudoku(char[][] board) {
        doSolve(board, 0, 0);
    }
    
    private boolean doSolve(char[][] board, int row, int col) {
        col=0;
        for (int i = row; i < 9; i++) { 
            for (int j = col; j < 9; j++) {
                
                if (board[i][j] != '.') {
                    continue;
                }
                
                for (char num = '1'; num <= '9'; num++) {
                    if (isValid(board, i, j, num)) {
                        board[i][j] = num;
                        
                        if (doSolve(board, i, j + 1))
                            {
                                return true;
                            }
                        board[i][j] = '.';
                    }
                }
                return false;
            }
        }
        return true;
    }
    
    private boolean isValid(char[][] board, int row, int col, char num) {
        int blkrow = (row / 3) * 3;
        int blkcol = (col / 3) * 3; 
        for (int i = 0; i < 9; i++)
            if (
                board[i][col] == num ||
                board[row][i] == num || 
                board[blkrow + i / 3][blkcol + i % 3] == num)
                {
                    return false;
                }
        return true;
    }
}
