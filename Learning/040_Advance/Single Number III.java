Problem Description

Given an array of numbers A , in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

Note: Output array must be sorted.



Problem Constraints
2 <= |A| <= 100000
1 <= A[i] <= 109



Input Format
First argument is an array of interger of size N.



Output Format
Return an array of two integers that appear only once.



Example Input
Input 1:

A = [1, 2, 3, 1, 2, 4]
Input 2:

A = [1, 2]


Example Output
Output 1:

[3, 4]
Output 2:

[1, 2]


Example Explanation
Explanation 1:

 3 and 4 appear only once.
Explanation 2:

 1 and 2 appear only once.
   
   
   
   
   
   
   
   public class Solution {
    public int[] solve(int[] A) {
        
        int xorOfAllNum=0;
        //calculate xor of all numbers 
        for(int i=0;i<A.length;i++){
            
            xorOfAllNum=xorOfAllNum^A[i];
        }
        
        //find the least set bit
        int lsb=xorOfAllNum & -xorOfAllNum; 
        
        int num1=0;
        int num2=0;
        
        for(int i=0;i<A.length;i++){
            
            if((A[i] & lsb)==0){
                num1 =num1^A[i];
            }
            else{
                num2 =num2^A[i];
            }
        }
        
        int []arr=new int[2];
        arr[0]=num1;
        arr[1]=num2;
        Arrays.sort(arr);
        
         return arr ;
    }
}
