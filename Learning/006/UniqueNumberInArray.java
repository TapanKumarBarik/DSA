public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        
        int res=0;
        
        for(int i=0;i<A.length;i++){
            res=res^A[i];
        }
        
        return res;
    }
}
