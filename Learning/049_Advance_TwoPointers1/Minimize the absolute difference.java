

SAME PROBLEM AS ARRAY 3 POINTERS


Given three sorted arrays A, B and Cof not necessarily same sizes.

Calculate the minimum absolute difference between the maximum and minimum number from the triplet a, b, c such that a, b, c belongs arrays A, B, C respectively. i.e. minimize | max(a,b,c) - min(a,b,c) |.

Example :

Input:

A : [ 1, 4, 5, 8, 10 ]
B : [ 6, 9, 15 ]
C : [ 2, 3, 6, 6 ]
Output:

1
Explanation: We get the minimum difference for a=5, b=6, c=6 as | max(a,b,c) - min(a,b,c) | = |6-5| = 1.


×




public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[] A, final int[] B, final int[] C) {
        
        int i=0;
        int j=0;
        int k=0;
        int res=Integer.MAX_VALUE;
        
        while(i<A.length  && j<B.length && k<C.length){
            
            
            
            int min=Math.min(A[i],Math.min(B[j],C[k]));
            int max=Math.max(A[i],Math.max(B[j],C[k]));
            int diff=max-min;
            res=Math.min(res,diff);
            if(res==0)break;
            if(min==A[i])i++;
            if(min==B[j])j++;
            if(min==C[k])k++;
            
        }
        return res;
    }
}

