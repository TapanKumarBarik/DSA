class Solution {
    public int findComplement(int n) {
        
        
        
         int ans=0;
        
        int power=1;
        
        if(n==0){
            return 1;
        }
        
        while(n>0){
            
            int lastBit=n&1;
            if(lastBit==0){
                ans+=(1*power);
            }
            
            n=n>>1;
            power=power*2;
        }
        
        
        return ans;
    }
}
