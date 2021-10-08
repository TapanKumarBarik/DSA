public class Solution {
    public int solve(int[][] A) {
        
        
        int count=0;
        int row=0;
        for(int i=0;i<A.length;i++){
            int temp=0;
            for(int j=0;j<A[i].length;j++){
                
                if((A[i][j]&1)==1){
                    temp++;
                }
                
            }
            if(temp>count){
                row=i;
                count=Math.max(count,temp);
            }
            
            
            
        }
        return row;
    }
}
