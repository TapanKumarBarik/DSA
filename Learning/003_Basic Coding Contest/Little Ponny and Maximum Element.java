public class Solution {
    public int solve(int[] A, int B) {
        
        int count=0;
        boolean isThere=false;
        
        
          for(int i=0;i<A.length; i++)
        {
            if(A[i]==B){
                isThere=true;
                
            }
        }
        
        if(isThere){
              for(int i=0;i<A.length; i++)
        {
            if(A[i]>B){
                count++;
            }
        }
        }
      
        if(count==0){
            return -1;
        }
        return count;
        
    }
}
