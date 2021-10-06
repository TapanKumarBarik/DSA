public class Solution {
    public int solve(int[] A) {
        int max=Integer.MIN_VALUE;
        
        for (int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        
        //logic
        int count=0;
        for(int i=0;i<A.length;i++){
            
                count+=max-A[i];
            
        }
        return count;
    }
}
