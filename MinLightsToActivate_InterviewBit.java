public class Solution {
    public int solve(int[] A, int B) {

        int n=A.length;
        int res=0;
        int i=0;
        while(i<n){
            int right=Math.min(i+B-1,n-1);
            int left=Math.max(i-B+1,0);

            boolean isBuldFound=false;
            while(right>=left){
                if(A[right]==1){
                    isBuldFound=true;
                    break;

                }
                right--;

            }

            if(!isBuldFound){
                return -1;

            }

                  i=right+B;
            res++;




        }
        return res;
    }
}
