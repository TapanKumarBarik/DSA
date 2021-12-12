Problem Description

Given an array of integers A, find and return the count of divisors of each element of the array.

NOTE: Order of the resultant array should be same as the input array.



Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 106



Input Format
The only argument given is the integer array A.



Output Format
Return the count of divisors of each element of the array in the form of an array.



Example Input
Input 1:

 A = [2, 3, 4, 5]
Input 2:

 A = [8, 9, 10]


Example Output
Output 1:

 [2, 2, 3, 2]
Output 1:

 [4, 3, 4]


Example Explanation
Explanation 1:

 The number of divisors of 2 : [1, 2], 3 : [1, 3], 4 : [1, 2, 4], 5 : [1, 5]
 So the count will be [2, 2, 3, 2].
Explanation 2:

 The number of divisors of 8 : [1, 2, 4, 8], 9 : [1, 3, 9], 10 : [1, 2, 5, 10]
 So the count will be [4, 3, 4].
   
   
   
   
   
   //
   
   public class Solution {
 
    public int[] solve(int[] A) {
        
        for(int i=0;i<A.length;i++){
            
            A[i]=find(A[i]);
        }
        return A;
    }
    
    
    private int find(int num){
        
        int sum=0;
        int c=1;
        
        while(c<=Math.sqrt(num)){
            if(num%c==0){
                sum++;
                if(num/c!=c){
                    sum++;
                }
            }
            
            
            c++;
            
        }
        return sum;
    }
}
//
