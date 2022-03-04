Problem Description

Given an array A of integers of size N. Find the subarray AL, AL+1, AL+2, ... AR with 1<=L<=R<=N which has maximum XOR value.

NOTE: If there are multiple subarrays with same maximum value, return the subarray with minimum length. If length is same, return the subarray with minimum starting index.



Problem Constraints
1 <= N <= 100000
0 <= A[i] <= 109



Input Format
First and only argument is an integer array A.



Output Format
Return an integer array B of size 2. B[0] is the starting index(1-based) of the subarray and B[1] is the ending index(1-based) of the subarray.



Example Input
Input 1:

 A = [1, 4, 3]
Input 2:

 A = [8]


Example Output
Output 1:

 [2, 3]
Output 2:

 [1, 1]


Example Explanation
Explanation 1:

 There are 6 possible subarrays of A:
 subarray            XOR value
 [1]                     1
 [4]                     4
 [3]                     3
 [1, 4]                  5 (1^4)
 [4, 3]                  7 (4^3)
 [1, 4, 3]               6 (1^4^3)

 [4, 3] subarray has maximum XOR value. So, return [2, 3].
Explanation 2:

 There is only one element in the array. So, the maximum XOR value is equal to 8 and the only possible subarray is [1, 1]. 


   
   
   
   
   
   
   
   
   
   
   
   
   
   
   //Brut force
   
   public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        
        
        ArrayList<Integer>arr=new ArrayList<Integer>();
        
        int minIndex =0; int maxIndex=0;
        
        int maxXor=Integer.MIN_VALUE;
        
        for(int i=0;i<A.size();i++){
            
            int currXor=0;
            for(int j=i;j<A.size();j++){
                
                currXor=currXor^A.get(j);
                
                if(currXor>maxXor){
                    
                minIndex=i;
                maxIndex=j;
                maxXor=currXor;
                }
                else if(currXor==maxXor){
                   if( maxIndex-minIndex>j-i){
                         minIndex=i;
                         maxIndex=j;
                   }
                }
                
            }
            
            
        }
        
        arr.add(minIndex+1);
        arr.add(maxIndex+1);
        
        return arr;
    }
}
