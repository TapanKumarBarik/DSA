// [1, 0, 0, 0]
//    [1, 2, 0, 0]
//    [1, 2, 3, 0]
//    [1, 2, 3, 4]
   
public class Solution {
    public int[][] solve(int A) {
        
        int[][]arr=new int[A][A];
        for(int i=0;i<A;i++){
            int count=1;
            for(int j=0;j<=i;j++){
                arr[i][j]=count;
                count++;
            }
        }
        return arr;
    }
}
