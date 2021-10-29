Problem Description

Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: Using library sort function is not allowed.



Problem Constraints
1 <= N <= 1000000
0 <= A[i] <= 2


Input Format
First and only argument of input contains an integer array A.


Output Format
Return an integer array in asked order


Example Input
Input 1 :
    A = [0 1 2 0 1 2]
Input 2:

    A = [0]


Example Output
Output 1:
    [0 0 1 1 2 2]
Output 2:

    [0]


Example Explanation
Explanation 1:
    [0 0 1 1 2 2] is the required order.
    
    
    
    
    
    
    public class Solution {
    public int[] sortColors(int[] A) {
        
    //   int n = arr.length;
    //     for (int i = 0; i < n-1; i++){
    //         for (int j = 0; j < n-1-i; j++){
    //             if (arr[j] > arr[j+1])
    //             {
    //                 // swap arr[j+1] and arr[j]
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    // }}
    
    int no0=0;
    int no1=0;
    int no2=0;
    for(int i=0;i<A.length;i++){
        if(A[i]==0){
            no0++;
        }
         if(A[i]==1){
            no1++;
        }
         if(A[i]==2){
            no2++;
        }
    }
    
    for(int i=0;i<no0;i++){
        A[i]=0;
    }
     for(int i=no0;i<no0+no1;i++){
        A[i]=  1;
    }
      for(int i=no0+no1;i<A.length;i++){
        A[i]=  2;
    }
        return A;
    }
}
