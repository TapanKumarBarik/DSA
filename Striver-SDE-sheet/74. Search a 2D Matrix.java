//https://leetcode.com/problems/search-a-2d-matrix/



//Approach 1 

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        int j=matrix[0].length-1;
        
        int i=0;
        
        
        while(i<matrix.length && j>=0){
            
            
            int curr=matrix[i][j];
            
            if(curr==target)return true;
            
            
            if(curr>target){
                j--;
            }
            else{
                i++;
            }
            
        }
        return false;
        
    }
}



//Approach 2 Binary search approach
