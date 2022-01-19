Problem Description

Given a sorted array A containing N integers both positive and negative.

You need to create another array containing the squares of all the elements in A and return it in non-decreasing order.

Try to this in O(N) time.


Problem Constraints
1 <= N <= 105.

-103 <= A[i] <= 103



Input Format
First and only argument is an integer array A.



Output Format
Return a integer array as described in the problem above.



Example Input
Input 1:

 A = [-6, -3, -1, 2, 4, 5]
Input 2:

 A = [-5, -4, -2, 0, 1]


Example Output
Output 1:

 [1, 4, 9, 16, 25, 36]
Output 2:

 [0, 1, 4, 16, 25]





//on

public class Solution {
    public int[] solve(int[] A) {
      int []res=new int[A.length];

      int start=0;
      int end=A.length-1;

    for(int i=A.length-1;i>=0;i--){

        if(Math.abs(A[start])>Math.abs(A[end])){
            res[i]=A[start]*A[start];
            start++;
        }

        else{
             res[i]=A[end]*A[end];
            end--;
        }
    }

    return res;
    }
}





//NLOG(N)
public class Solution {
    public int[] solve(int[] A) {
        for(int i=0;i<A.length;i++){
            A[i]=A[i]*A[i];
        }
          Arrays.sort(A);
        return A;
    }
}
