class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
//          for(int i=0;i<matrix.length;i++){
            
            
//             for(int j=0;j<matrix[i].length;j++){
                
//                 if(matrix[i][j]==target){
//                     return true;
//                 }
                
//             }
//         }
        
        
        int row=0;
        int column=matrix[0].length-1;
        while(row<matrix.length&& column>=0){
            
            if(target==matrix[row][column]){
                return true;
            }
              if(target>matrix[row][column]){
                row++;
            }
            else{
                column--;
            }
            
        }
        
        
        
        return false;
        
    }
}
