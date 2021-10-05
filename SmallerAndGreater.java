//find from array how many items have smaller as well as greter elements

public class Solution {
    public int solve(int[] A) {
        
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<A.length;i++){
           max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        
        int ans=0;
        for(int j=0;j<A.length; j++){
            
            if(A[j]>min&& A[j]<max){
                ans++;
            }
        }
        return ans;
    }
}

