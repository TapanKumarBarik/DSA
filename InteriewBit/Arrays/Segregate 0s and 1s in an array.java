Problem Description
 
 


You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array [Basically you have to sort the array]. Traverse array only once. 



Problem Constraints
1<=|A|<=1e6


Input Format
First argument is array of integers consisting of 0's and 1's only.


Output Format
Return a sorted array.


Example Input
Input 1:
a=[0 1 0]
Input 2:

A=[1 1 0 ]


Example Output
Ouput 1:
[0 0 1]
Ouput 2:

[0 1 1]


Example Explanation
Explanation 1:
 above is sorted array.
Explanation 2:

sort the array.



  
  
  
  
  
  
  
  public class Solution {
    public int[] solve(int[] A) {
     int start=0;
     int end=A.length-1;
     while(start<end){
         if(A[start]==1){
            // swap(A,start,end);
            int temp=A[start];
            A[start]=A[end];
            A[end]=temp;
             end--;
         }
         else{
             start++;
         }
     }
     return A;
    }
}

