public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        
        int num=0;
        
        for(int i=0;i<32;i++){
            
            num=num<<1;
            if((n&1)==1)num++;
            
            n=n>>1;
        }
        return num;
        
    }
}
