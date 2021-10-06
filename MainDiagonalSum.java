public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        
        int sum=0;
        
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(i==j){
                  sum=sum+A[i][j];   
                }
               
            }
        }
        return sum;
    }
}
