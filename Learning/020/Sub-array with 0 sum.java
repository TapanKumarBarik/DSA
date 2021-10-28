Problem Description

Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1 else return 0.



Problem Constraints
1 <= |A| <= 100000

-10^9 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return whether the given array contains a subarray with a sum equal to 0.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [-1, 1]


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No subarray has sum 0.
Explanation 2:

 The array has sum 0.
   
   
   
   
   public class Solution {
    public int solve(int[] A) {
        
            long [] parr = new long[A.length];

    // prefix
    parr[0] = A[0];
    for (int i = 1; i < A.length; i++) {
      parr[i] = parr[i - 1] + A[i];
    }
    HashMap<Long, Long> m = new HashMap<Long, Long>();
    m.put((long)0, (long)1);
  
    for (int i = 0; i < parr.length; i++) {
      if (m.containsKey(parr[i])) {
        long temp=m.get((long)parr[i]);
          // m.put(parr[i], temp+1);
          return 1;
      } else {
        m.put((long)parr[i], (long)1);
      }
    }

        return 0;
    }
}
