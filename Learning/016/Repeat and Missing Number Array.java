You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3] 

Output:[3, 4] 

A = 3, B = 4

×

///



public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
  int dup=0;
  int miss=1;
  Arrays.sort(A);
  for(int i=1;i<A.length;i++){
  
        if(A[i-1]==A[i]){
          dup=A[i];
      }
          else if(A[i-1]+1!=A[i]){
          miss=A[i]-1;
      }
      
  }
      return new int[]{dup,miss};
      
      
      
      
      
      
        
    }
}



////

