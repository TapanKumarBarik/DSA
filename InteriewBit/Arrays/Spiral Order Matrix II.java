Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.



Input Format:

The first and the only argument contains an integer, A.
Output Format:

Return a 2-d matrix of size A x A satisfying the spiral order.
Constraints:

1 <= A <= 1000
Examples:

Input 1:
    A = 3

Output 1:
    [   [ 1, 2, 3 ],
        [ 8, 9, 4 ],
        [ 7, 6, 5 ]   ]

Input 2:
    4

Output 2:
    [   [1, 2, 3, 4],
        [12, 13, 14, 5],
        [11, 16, 15, 6],
        [10, 9, 8, 7]   ]




public class Solution {
    public int[][] generateMatrix(int A) {

      int[][]arr=new int[A][A];
        int count=1;
        int rowBegin=0;
        int rowEnd=A-1;
        int columnBegin=0;
        int columnEnd=A-1;
        
        
  while(rowEnd>=rowBegin && columnEnd>=columnBegin){
      //1
            for(int i=columnBegin;i<=columnEnd;i++){
            arr[rowBegin][i]=count;
            count++;
        }
        
        rowBegin++;
        //2
        for(int i=rowBegin;i<=rowEnd;i++){
            arr[i][columnEnd]=count;
            count++;
        }
        columnEnd--;
        
        //3
        
        for(int i=columnEnd;i>=columnBegin;i--){
            arr[rowEnd][i]=count;
            count++;
        }
        //4
        
        rowEnd--;
        for(int i=rowEnd;i>=rowBegin;i--){
           arr[i][columnBegin]=count;
           count++;
        }
        columnBegin++;
        
  }
        
        return arr;
    }
}
