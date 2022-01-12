Problem Description

Given two sorted arrays of distinct integers, A and B, and an integer C, find and return the pair whose sum is closest to C and the pair has one element from each array.

More formally, find A[i] and B[j] such that abs((A[i] + B[j]) - C) has minimum value.

If there are multiple solutions find the one with minimum i and even if there are multiple values of j for the same i then return the one with minimum j.

Return an array with two elements {A[i], B[j]}.



Problem Constraints
1 <= length of both the arrays <= 100000

1 <= A[i], B[i] <= 109

1 <= C <= 109



Input Format
The first argument given is the integer array A.
The second argument given is the integer array B.
The third argument given is integer C.



Output Format
Return an array of size 2 denoting the pair which has sum closest to C.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = [2, 4, 6, 8]
 C = 9
Input 2:

 A = [5, 10, 20]
 B = [1, 2, 30]
 C = 13


Example Output
Output 1:

 [1, 8]
Output 2:

 [10, 2]


Example Explanation
Explanation 1:

 There are three pairs: (1, 8), (3, 6), (5, 4), that gives the minimum value.
 Since we have to return the value with minimum i and then with minimum j. We will return [1, 8].
Explanation 2:

 [10, 2] is the only pair such abs(10+2-13) is minimum.
   
   
   
   
   public class Solution {
    public int[] solve(int[] A, int[] B, int C) {
        
        //first Array Pointers
        int p1Left=0;
        int p1Right=A.length-1;
        
        //Second Array Pointers
        int p2Left=0;
        int p2Right=B.length-1;
        
        //Result array Pointers
        
        int resp1=0;
        int resp2=B.length-1;
        
        //Initilized the result
        int ans=Integer.MAX_VALUE;
        
        
        //While Loop 
        while(p1Left<=p1Right   &&  p2Right>=0){
            
           int sum=Math.abs(A[p1Left]+B[p2Right]) ;
           
           //if sum-c <ans?
           if(Math.abs(sum-C)<ans){
               resp1=p1Left;
               resp2=p2Right;
               ans=Math.min(Math.abs((sum - C)),ans);
           }
            
            if(Math.abs((sum - C))==ans){
                
                //if i is same so second array is minimum now
                if(resp1==p1Left){
                resp1=p1Left;
                resp2=p2Right;
                }
                
            }
            //most impostant thing to check >=
            if(sum>=C)p2Right--;
            if(sum<C)p1Left++;
            
        }
        
        int[]arr=new int[2];
        arr[0]=A[resp1];
        arr[1]=B[resp2];
        return arr;
    }
}
