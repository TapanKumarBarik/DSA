There are certain problems which are asked in the interview to also check how you take care of overflows in your problem.

This is one of those problems.

Please take extra care to make sure that you are type-casting your ints to long properly and at all places. Try to verify if your solution works if number of elements is as large as 105

Food for thought :

Even though it might not be required in this problem, in some cases, you might be required to order the operations cleverly so that the numbers do not overflow.
For example, if you need to calculate n! / k! where n! is factorial(n), one approach is to calculate factorial(n), factorial(k) and then divide them.
Another approach is to only multiple numbers from k + 1 ... n to calculate the result.
Obviously approach 1 is more susceptible to overflows.
You are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3] 

Output:[3, 4] 

A = 3, B = 4

  
  
  
  
  public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int xor=0;
         for(int i =1 ;i<=A.length ;i++){
            xor ^= i ;
        }

        for(int i =0 ; i<A.length ;i++){
            xor ^= A[i] ;
        }

      //  find the last Possible 1
   int rmsb = xor & -xor ;

        int f = 0 ;
        int s = 0 ;

        for(int i =0 ;i<A.length ;i++ ){
            if((A[i]&rmsb)==0)
                f ^= A[i] ;
            else
                s ^= A[i] ;
        }

        for(int i = 1 ;i<=A.length ;i++ ){
            if((i&rmsb)==0)
                f ^= i ;
            else
                s ^= i ;
        }
  

 
        int[] arr = new int[2] ;

        int first = -1 ;

        for(int i = 0 ;i<A.length ;i++ ){
            if(A[i]==f){
            first = f ;
            }
            if(A[i]==s){
            first = s ;
            }
        }
        

        if(first==f){
            arr[0] = first ;
            arr[1] = s ;
            return arr ;
        }

        arr[0] = s ;
        arr[1] = f ;
        return arr ;

    }
}

