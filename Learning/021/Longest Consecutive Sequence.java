Problem Description

Given an unsorted integer array A of size N.

Find the length of the longest set of consecutive elements from the array A.



Problem Constraints
1 <= N <= 106

-106 <= A[i] <= 106



Input Format
First argument is an integer array A of size N.



Output Format
Return an integer denoting the length of the longest set of consecutive elements from the array A.



Example Input
Input 1:

A = [100, 4, 200, 1, 3, 2]
Input 2:

A = [2, 1]


Example Output
Output 1:

 4
Output 2:

 2


Example Explanation
Explanation 1:

 The set of consecutive elements will be [1, 2, 3, 4].
Explanation 2:

 The set of consecutive elements will be [1, 2].



×
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {
        
        HashSet<Integer>hm=new HashSet<Integer>();
        
        for(int i=0;i<A.length;i++){
            hm.add(A[i]);
        }
        
        //
        int count=0;
        for(int i=0;i<A.length;i++){
            if(hm.contains(A[i]-1)==false){
                
                    int currentNum = A[i];
                int currentStreak = 1;

                while (hm.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                count = Math.max(count, currentStreak);
            }
                
                
            }
            
                return count;
    }
}

