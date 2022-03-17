Problem Description

Given a 2-D binary matrix A of size N x M filled with 0's and 1's, find the largest rectangle containing all ones and return its area.



Problem Constraints
1 <= N, M <= 100



Input Format
First argument is an 2-D binary array A.



Output Format
Return an integer denoting the area of largest rectangle containing all ones.



Example Input
Input 1:

 A = [
       [1, 1, 1]
       [0, 1, 1]
       [1, 0, 0] 
     ]
Input 2:

 A = [
       [0, 1, 0]
       [1, 1, 1]
     ] 


Example Output
Output 1:

 4
Output 2:

 3


Example Explanation
Explanation 1:

 As the max area rectangle is created by the 2x2 rectangle created by (0,1), (0,2), (1,1) and (1,2).
Explanation 2:

 As the max area rectangle is created by the 1x3 rectangle created by (1,0), (1,1) and (1,2).
   
   
   
   
   
   public class Solution {
    public int maximalRectangle(int[][] matrix) {
        
        
        if(matrix.length==0) return 0;
        
        // for each cell with value=1, we look upward (north), the number of continuous '1' is the height of cell
        int[] heights = new int[matrix[0].length];
        int maxArea=-1;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    heights[j] = 0;
                } else {
                    heights[j] ++;
                }
            }            
            int area = yourLeetCode84Method(heights);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    
     public int yourLeetCode84Method(int[] heights) {
          int n = heights.length;
        if (n == 1) {
            return heights[0];
        }
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;
        while (index < n) {
            if (stack.isEmpty() || heights[index] >= heights[stack.peek()]) {
                stack.push(index++);
            } else {
                int top = stack.pop();
                int area = heights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = heights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    
}
