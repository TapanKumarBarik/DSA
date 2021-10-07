public class Solution {
    public int solve(int[] A, int B) {

        int n=A.length;
        int currentSum=0;
        
        for(int i=0;i<B;i++){
            currentSum+=A[i];
        }

       int maxSum=currentSum;

       int include_num=n-1;
       int exclude_num=B-1;

       while(include_num>=0&& exclude_num>=0){

           currentSum=currentSum-A[exclude_num--];
           currentSum=currentSum+A[include_num--];
           maxSum=Math.max(currentSum,maxSum);
       }
       return maxSum;

    }
}
