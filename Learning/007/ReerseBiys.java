public class Solution {
	public long reverse(long a) {
	    
	    long num=0;
	    
	    for(int i=0;i<32;i++){
	        
	        num=num<<1;
	        if((a&1)==1){
	            num++;
	        }
	        
	        a=a>>1;
	    }
	    
	    return num;
	}
}
