public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        
        
        
        for(int i=0;i<A.length;i++){
            
            for(int j=0;j<A[i].length;j++){
                
                if(A.length != A[i].length){ 
                    
                    return 0;
                }
                if(i==j && A[i][j]!=1){
                   
                        return 0;
                       // break;
                    
                }
                else if(i!=j && A[i][j]!=0){
                      
                        return 0;
                        //break;
                    
                }
                
                
             
            }
            
        }
        return 1;
        
    }
}
