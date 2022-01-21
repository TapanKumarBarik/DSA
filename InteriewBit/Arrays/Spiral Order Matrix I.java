Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example:

Given the following matrix:

[
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
]
You should return

[1, 2, 3, 6, 9, 8, 7, 4, 5]
Problem Approach :







public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
          int row = A.length;
        int col = A[0].length;
        int top = 0;
        int bottom = row - 1;
        int right = col - 1;
        int left = 0;
        int direction = 0;
        int[] spiralArray = new int[row * col];
        int count = 0;
        
        while (left <= right && top <= bottom){
            //going from left to right
            if(direction == 0){
                for(int i = left; i <= right; i++){
                    spiralArray[count] = A[top][i];
                    count++;
                }
                top++;
                direction = 1;
            }
            //going from top to bottom
            else if(direction == 1 ){
                for(int i = top; i <= bottom; i++){
                    spiralArray[count] = A[i][right];
                    count++;
                }
                right--;
                direction = 2;
            }
            //going from right to left
            else if(direction == 2 ){
                for(int i = right; i >= left; i--){
                    spiralArray[count] = A[bottom][i];
                    count++;
                }
                bottom--;
                direction = 3;
            }
            else if(direction == 3){
                for(int i = bottom; i >= top; i--){
                    spiralArray[count] = A[i][left];
                    count++;
                }
                left++;
                direction = 0;
            }
        }
        
        return spiralArray;
    }
}
