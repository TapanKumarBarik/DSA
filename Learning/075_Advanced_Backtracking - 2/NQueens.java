Problem Description

The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.



Given an integer A, return all distinct solutions to the n-queens puzzle.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
The final list should be generated in such a way that the indices of the queens in each list should be in reverse lexicographical order.


Problem Constraints
1 <= A <= 10



Input Format
First argument is an integer n denoting the size of chessboard



Output Format
Return an array consisting of all distinct solutions in which each element is a 2d char array representing a unique solution.



Example Input
Input 1:

A = 4
Input 2:

A = 1


Example Output
Output 1:

[
 [".Q..",  // Solution 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // Solution 2
  "Q...",
  "...Q",
  ".Q.."]
]
Output 1:

[
 [Q]
]


Example Explanation
Explanation 1:

There exist only two distinct solutions to the 4-queens puzzle:
Explanation 1:

There exist only one distinct solutions to the 1-queens puzzle:















public class Solution {
    
    public ArrayList<ArrayList<String>> solveNQueens(int a) 
    {
            ArrayList<ArrayList<String>> result = new ArrayList();
        
        if (a <= 0) {
            return result;
        }
        
        int[] colx = new int[a];
        compute(result, a, 0, colx);
        return result;
    }
    
    private void compute(ArrayList<ArrayList<String>> output, int len, int row, int[] columns) {
        
        if (row == len) {
            addResults(output, columns);
            return;
        }
        
        for (int col = 0; col < len; col++) {
            if (canQueenBePlaced(row, col, columns)) {
                columns[row] = col;
                compute(output, len, row + 1, columns);
            }
        }
    }
    
    private boolean canQueenBePlaced(int row1, int column1, int[] columns1) {
        for (int row2 = 0; row2 < row1; row2++) {
            int column2 = columns1[row2];
            
            if (column1 == column2) {
                return false;
            }
            
            int dColumn = Math.abs(column2 - column1);
            int dRow = row1 - row2;
            
            if (dColumn == dRow) {
                return false;
            }
        }
        return true;
    }
    
    private void addResults (ArrayList<ArrayList<String>> output, int[] tempCol) {
        ArrayList<String> res = new ArrayList<String>();
        
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < tempCol.length; i++) {
            int pos = tempCol[i];
            for (int j = 0; j < tempCol.length; j++) {
                if (pos == j) {
                    builder.append('Q');
                } else {
                    builder.append('.');
                }
            }
            if (i != tempCol.length - 1) {
                builder.append(' ');
            }
        }
        res.add(builder.toString());
        output.add(res);
    }
}
