public class Solution {
	public int numSetBits(long a) {

       int count =0;

       while(a>0){

           if((a&1)==1){
               count++;
           }
           a=a>>1;
       } 
       return count;
	}
}
