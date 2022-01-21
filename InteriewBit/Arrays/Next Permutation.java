Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers for a given array A of size N.

If such arrangement is not possible, it must be rearranged as the lowest possible order i.e., sorted in an ascending order.

Note:

1. The replacement must be in-place, do **not** allocate extra memory.
2. DO NOT USE LIBRARY FUNCTION FOR NEXT PERMUTATION. Use of Library functions will disqualify your submission retroactively and will give you penalty points.
Input Format:

The first and the only argument of input has an array of integers, A.
Output Format:

Return an array of integers, representing the next permutation of the given array.
Constraints:

1 <= N <= 5e5
1 <= A[i] <= 1e9
Examples:

Input 1:
    A = [1, 2, 3]

Output 1:
    [1, 3, 2]

Input 2:
    A = [3, 2, 1]

Output 2:
    [1, 2, 3]

Input 3:
    A = [1, 1, 5]

Output 3:
    [1, 5, 1]

Input 4:
    A = [20, 50, 113]

Output 4:
    [20, 113, 50]







public class Solution {
    public int[] nextPermutation(int[] A) {
        int []arr=new int[A.length];

        int index=-1;

        for(int i=A.length-2;i>=0;i--){
            if(A[i]<A[i+1]){
                index=i;
                break;
            }
        }
        int n=A.length;
        if(index==-1){
            for(int i=0;i<A.length;i++){
                arr[i]=A[n-1-i];
            }
            return arr;
        }

        //i is not -1 now
        //find the next incresing index;
        int index2=-1;
        for(int i=n-1;i>=0;i--){
            if(A[index]<A[i]){
                index2=i;
                break;
            }
        }
        swap(A,index,index2);
        reverse(A,index+1);
        return A;


    }
      void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

     void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
