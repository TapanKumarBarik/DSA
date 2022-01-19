Problem Description
 
 

You are given two numbers represented as integer arrays A and B, where each digit is an element.

You have to return an array which representing the sum of the two given numbers.

The last element denotes the least significant bit, and the first element denotes the most significant bit.



Problem Constraints
1 <= |A|, |B| <= 105
0 <= Ai, Bi <= 9


Input Format
The first argument is an integer array A. The second argument is an integer array B.


Output Format
Return an array denoting the sum of the two numbers.


Example Input
Input 1:
A = [1, 2, 3]
B = [2, 5, 5]
Input 2:

A = [9, 9, 1]
B = [1, 2, 1]


Example Output
Output 1:
[3, 7, 8]
Output 2:

[1, 1, 1, 2]


Example Explanation
Explanation 1:
Simply, add all the digits in their place.
Explanation 2:

991 + 121 = 1112
Note that the resultant array size might be larger.



  
  
  
  
  public class Solution {
    public int[] addArrays(int[] A, int[] B) {

        ArrayList<Integer>arr=new ArrayList();

   

        int i=A.length-1;
        int j=B.length-1;
        int carry=0;
        while(i>=0 && j>=0){
            int sum=A[i]+B[j]+carry;
            carry=sum/10;
            sum=sum%10;
            arr.add(sum);
            i--;
            j--;
        }

        while(i>=0){
            int sum=A[i]+carry;
            carry=sum/10;
            sum=sum%10;
            arr.add(sum);
            i--;
        }


        
        while(j>=0){
            int sum=  B[j]+carry;
            carry=sum/10;
            sum=sum%10;
            arr.add(sum);
            j--;
        }
        if(carry!=0)arr.add(carry);
        int n=arr.size()-1;
        int[]newArr=new int[arr.size()];
        for(int k=0;k<newArr.length;k++){
            newArr[k]=arr.get(n-k);
        }

return newArr;
    }
}
