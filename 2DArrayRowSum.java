public class Solution {
    public int[] solve(int[][] A) {
        int []arr=new int[A.length];
        
        for(int i=0;i<A.length;i++){
            
        int sum=0;
            for(int j=0;j<A[i].length;j++){
               sum+=A[i][j]; 
            }
            arr[i]=sum;
        }
        return arr;
    }
}
