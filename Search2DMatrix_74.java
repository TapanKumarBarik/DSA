//O(n)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i=0;i<matrix.length;i++){
            
            
            for(int j=0;j<matrix[i].length;j++){
                
                if(matrix[i][j]==target){
                    return true;
                }
                
            }
        }
        
        
        
        
        
        
        return false;
        
        
    }
}



//lon(n)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int start=0;
        int end=(matrix.length*matrix[0].length)-1;
        
        while(start<=end){
            
            int mid=start+(end-start)/2;
            
            int midElement=matrix[mid/matrix[0].length][mid%matrix[0].length];
            
           if(target==midElement){
               return true;
           }
            
            if(target>midElement){
                
                start=mid+1;
            }
            if(target<midElement){
                end=mid-1;
            }
            
            
            
            
        }
        
        return false;
        
        
    }
}
