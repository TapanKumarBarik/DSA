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


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
    int row=matrix.length;
        
        int column=matrix[0].length;
        
        
        int right=row*column -1;
        
        
        int left=0;
        
        
        while(left<=right){
            
            
            int mid=(left+right)/2;
            
            
            int curr= matrix[mid/column][mid%column];
            
            if(curr==target){
                return true;
            }
            
            if(curr>target){
                right=mid-1;
                
            }
            else{
                left=mid+1;
            }
        }
        
        return false;
        
    }
}
