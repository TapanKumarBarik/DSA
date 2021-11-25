Problem Description

Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, following are some good questions to ask :

Q : Can the input have 0's before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
A : For the purpose of this question, YES
Q : Can the output have 0's before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.


Problem Constraints
1 <= size of the array <= 1000000



Input Format
First argument is an array of digits.



Output Format
Return the array of digits after adding one.



Example Input
Input 1:

[1, 2, 3]


Example Output
Output 1:

[1, 2, 4]


Example Explanation
Explanation 1:

Given vector is [1, 2, 3].
The returned vector should be [1, 2, 4] as 123 + 1 = 124.




  
  
  
  public class Solution {
    public int[] plusOne(int[] A) {
        
        
        int n=A.length;
        if(n==1 && A[0]!=9){
            A[0]=A[0]+1;
            return A;
        }
        int totalFirstZeroes=0;
        for(int i=0;i<n;i++){
            if(A[i]!=0){
                break;
            }
            totalFirstZeroes++;
        }
        
        int []arr1=new int[n-totalFirstZeroes];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=A[i+totalFirstZeroes];
        }
        int m=arr1.length;
        for(int i=m-1;i>=0;i--){
            if(arr1[i]<9){
                arr1[i]++;
                return arr1;
            }
            arr1[i]=0;
        }
        
        int []arr=new int[arr1.length+1];
        arr[0]=1;
        return arr;
    }
}
