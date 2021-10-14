public class Solution {
	public long reverse(long a) {
        long ans=0;
        for(int i=0;i<32;i++){
      ans=ans<<1;
     if((a & 1)==1){
       ans++;
}
a=a>>1;
        }

        return ans;
	}
}
