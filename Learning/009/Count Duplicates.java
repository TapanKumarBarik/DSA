Problem Description

You are given an integer array A having length N. You have to find the number of duplicate(redundant) elements in the array.



Problem Constraints
1 <= N <= 1000

-109 <= A[i] <= 109



Input Format
First and only argument is an integer array A.



Output Format
Return a single integer.



Example Input
Input 1:

 A = [1, 10, 20, 1, 25, 1, 10, 30, 25, 1] 
Input 2:

 A = [1, 2, 3] 


Example Output
Output 1:

 5 
Output 2:

 0 


Example Explanation
Explanation 1:

 1 is present 4 times in the array. So, 3 of them are redundant.
 10 is present 2 times in the array. So, 1 of them is redundant.
 25 is present 2 times in tha array. So, 1 of them is redundant.
 Total duplicates(redundants) = 3 + 1 + 1 = 5 
Explanation 2:

 There are no duplicates in the array (Each element has distinct value).
   
   
   //code 1
   
   public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[] A) {
        int count=0;
        
        for (int i=0;i<A.length;i++){
            
            
            for(int j=i+1;j<A.length;j++){
                
                if(A[i]==A[j]){
                    count++;
                    break;
                }
                
            }
        }
        return count;
    }
}
//code 2

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[] A) {
        int count=0;
        Arrays.sort(A);
        
        for (int i=0;i<A.length-1;i++){
                if(A[i]==A[i+1]){
                    count++;
                }
        }
        return count;
    }
}
