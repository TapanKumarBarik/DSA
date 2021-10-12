public class Solution {
    public int numSetBits(int A) {
        
        int result =0;
        
        
        while(A>0){
            if((A&1)==1){
                result++;
            }
            
            A=A>>1;
        }
        
        return result;
    }
}
