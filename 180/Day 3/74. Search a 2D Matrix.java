Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false
 

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 100
-104 <= matrix[i][j], target <= 104
  
  
  
  
  
  class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int i=0;
        int j=matrix[0].length-1;
        
       while(i<m && j >=0){
                if(matrix[i][j]==target){
                    return true;
                }
                else if (matrix[i][j]>target){
                   j--;
                }
                else{
                   i++;
                }
                
            
        }
        return false;
    }
}
