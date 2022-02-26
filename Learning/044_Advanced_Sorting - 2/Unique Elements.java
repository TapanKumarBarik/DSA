Problem Description

You are given an array A of N elements. You have to make all elements unique, to do so in one step you can increase any number by one.

Find the minimum number of steps.



Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109



Input Format
The only argument given is an Array A, having N integers.



Output Format
Return the Minimum number of steps required to make all elements unique.



Example Input
Input 1:

 A = [1, 1, 3]
Input 2:

 A = [2, 4, 5]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 We can increase the value of 1st element by 1 in 1 step and will get all unique elements. i.e [2, 1, 3].
Explanation 2:

 All elements are distinct.
   
   
   
   
   
   
   
   
   public class Solution {
    public int solve(int[] A) {
        
        int n = A.length;

        Arrays.sort(A);
        
        int steps = 0;
        int i = 1;
        int j = 0;
        
        while (j < n) {
            
            // make current element unique
            if (i >= A[j]) {
                
                steps += (i - A[j]);
                j++;
                i++;
            } else {
                i = A[j] + 1;
                j++;
            }
        }
        // return the answer
        return steps;
        
    }
}
