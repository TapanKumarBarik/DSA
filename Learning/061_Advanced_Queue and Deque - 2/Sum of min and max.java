Problem Description
Given an array A of both positive and negative integers.

Your task is to compute the sum of minimum and maximum elements of all sub-array of size B.

NOTE: Since the answer can be very large, you are required to return the sum modulo 109 + 7.



Problem Constraints
1 <= size of array A <= 105

-109 <= A[i] <= 109

1 <= B <= size of array



Input Format
The first argument denotes the integer array A.
The second argument denotes the value B



Output Format
Return an integer that denotes the required value.



Example Input
Input 1:

 A = [2, 5, -1, 7, -3, -1, -2]
 B = 4
Input 2:

 A = [2, -1, 3]
 B = 2


Example Output
Output 1:

 18
Output 2:

 3


Example Explanation
Explanation 1:

 Subarrays of size 4 are : 
    [2, 5, -1, 7],   min + max = -1 + 7 = 6
    [5, -1, 7, -3],  min + max = -3 + 7 = 4      
    [-1, 7, -3, -1], min + max = -3 + 7 = 4
    [7, -3, -1, -2], min + max = -3 + 7 = 4   
    Sum of all min & max = 6 + 4 + 4 + 4 = 18 
Explanation 2:

 Subarrays of size 2 are : 
    [2, -1],   min + max = -1 + 2 = 1
    [-1, 3],   min + max = -1 + 3 = 2
    Sum of all min & max = 1 + 2 = 3 
      
      
      
      
      
      
      
      
      public class Solution {
    public int solve(int[] A, int B) {
        // we need to have 2 arrays which store max and min 
        int [] max = computeMax(A, B);
        int [] min = computeMin(A, B);

        long sum = 0;
        int mod = (int)Math.pow(10,9)+7;
        for (int i =0;i<max.length;i++){
            sum = (max[i]+min[i])%mod + sum %mod;
        }
        return (int)((sum+mod)%mod);
    }

    // B denotes sliding window - compute max 
    public int [] computeMax(int [] A, int B){
        Deque<Integer> deque = new LinkedList();
        int [] res= new int [A.length-B+1];

        //lets compute for 1st window
        for (int i =0;i<B;i++){
            while (!deque.isEmpty() && deque.getLast()<A[i]){
                deque.removeLast();
            }
            deque.addLast(A[i]);
        }
        
        res[0] = deque.getFirst();

       //lets iterate next set of elements using sliding window
        int ii =1;
        for (int i=B; i <A.length;i++){
            while (!deque.isEmpty() && deque.getLast()<A[i]){
                deque.removeLast();
            }
            deque.addLast(A[i]);

            //condition remvoe out going element
            if (deque.getFirst()== A[i-B]){
                 deque.removeFirst();   
            }
            res[ii++]=deque.getFirst();
        }
        return res;
    }

    // compute min 
    public int [] computeMin(int [] A, int B){
        Deque <Integer> deque = new LinkedList();
        int [] res= new int [A.length-B+1];
        //lets compute for 1st window
        for (int i =0;i<B;i++){
            while (!deque.isEmpty() && deque.getLast()>A[i]){
                deque.removeLast();
            }
            deque.addLast(A[i]);
        }
        
        res[0] = deque.getFirst();

        //lets iterate next set of elements using sliding window
        int ii =1;
        for (int i=B; i <A.length;i++){

            while (!deque.isEmpty() && deque.getLast()>A[i]){
                deque.removeLast();
            }
            deque.addLast(A[i]);

            //condition remove out going element
            if (deque.getFirst()== A[i-B]){
                 deque.removeFirst();   
            }
            res[ii++]=deque.getFirst();
        }
        return res;
    }
}
