Given an unsorted integer array, find the first missing positive integer.

Example:

Given [1,2,0] return 3,

[3,4,-1,1] return 2,

[-8, -7, -6] returns 1

Your algorithm should run in O(n) time and use constant space








public class Solution {
    public int firstMissingPositive(int[] A) {
    int i=0;
        while(i<A.length){
            if(A[i]<=0 || A[i]>=A.length || A[i]==i+1){

                i++;
            }
            else if(A[i] !=A[A[i]-1]){

                swap(A, i, A[i]-1);

            }
            else{
                i++;
            }
        }
        i=0;

    while(i<A.length && A[i]==i+1){
        i++;
    }
return i+1;
    }

    private void swap(int[]A,int i, int j){
        int temp=A[j];
        A[j]=A[i];
        A[i]=temp;
    }
}
