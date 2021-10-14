public class Solution {
    public int findMinXor(int[] A) {

        int xorv=Integer.MAX_VALUE;
        Arrays.sort(A);

        for(int i=0;i<A.length-1;i++){
  xorv=Math.min(xorv,A[i]^A[i+1]);
            
        }
        return xorv;
    }
}
