public class Solution {
    public long cntBits(int[] A) {
        long res=0;
        for(int i=0;i<=31;i++ ){
                    long count1=0;
                    long count0=0;
                    for(int j=0;j<A.length;j++){
                                if(((A[j]>>i) & 1)==1){
                                    count1++;
                                }
                                else{
                                    count0++;
                                }
                    }
                    res+=(count1*count0)*2;

        }
       return  res%1000000007;

    }
}
