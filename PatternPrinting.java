

/*
 For A = 4 pattern looks like:  
                             1 0 0 0
                             1 2 0 0
                             1 2 3 0
                             1 2 3 4
 So we will return it as two-dimensional array.
 */



public class Solution {
    public int[][] solve(int A) {
        
        int[][]arr=new int[A][A];
        
        for(int i=0;i<A;i++){
            
            
            for(int k=0;k<=i;k++){
               
                    arr[i][k]=k+1;
               
                
            }
        }
        return arr;
    }
}
