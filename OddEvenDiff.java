
public class Solution {
    public int solve(int[] A) {
        
        int odd=Integer.MAX_VALUE;
        int even=Integer.MIN_VALUE;
        
        for(int i=0;i<A.length;i++){
            
            if(A[i] % 2!=0 && A[i]<odd){
                odd=A[i];
                
            }
               if(A[i] % 2==0 && A[i]>even){
                even=A[i];
                
            }
        }
        return even-odd;
        
    }
}
