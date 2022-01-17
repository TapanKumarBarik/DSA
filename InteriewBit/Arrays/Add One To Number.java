Problem Description

Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, following are some good questions to ask :

Q : Can the input have 0's before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
A : For the purpose of this question, YES
Q : Can the output have 0's before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.


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
      if(n==1 && A[0]<9){
          A[0]++;
          return A;
      }
      
      //find total first zero
      
      int firstZero=0;
      
      for(int i=0;i<n;i++){
          if(A[i]!=0){
              break;
          }
          else{
              firstZero++;
          }
      }
      
      //create a new array and copy item to it;
      
      int []newArray=new int[n-firstZero];
      
      int m=newArray.length;
      
      //copy
      for(int i=0;i<m;i++){
          newArray[i]=A[i+firstZero];
      }
      
      
      for(int i=m-1;i>=0;i--){
          if(newArray[i]<9){
              newArray[i]++;
              return newArray;
          }
          else{
              newArray[i]=0;
          }
      }
      //return 999 case;
      
      int []arr=new int[m+1];
      arr[0]=1;
      return arr;
       
    }
}

