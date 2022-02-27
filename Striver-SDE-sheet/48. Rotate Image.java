//https://leetcode.com/problems/rotate-image/

class Solution {
    public void rotate(int[][] matrix) {
        
        
        //Transpose
        int index=0;
        
        for(int i=0;i<matrix[0].length;i++){
            
            
            for(int j=i;j<matrix.length;j++){
             
                
                swap(matrix, i, j);
                
                
            }
        }
        
        //reverse 
        
        
        for(int i=0;i<matrix.length;i++){
            
            int left=0;
            int right=matrix[i].length-1;
            
            while(left<right){
               
                int temp=matrix[i][left];
                
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                
                left++;
                right--;
            }
            
        }
      
        
        
    }
    
    private void swap(int[][]matrix, int i, int j){
        
        int temp=matrix[i][j];
        
        matrix[i][j]=matrix[j][i];
        
        matrix[j][i]=temp;
        
    }
}
