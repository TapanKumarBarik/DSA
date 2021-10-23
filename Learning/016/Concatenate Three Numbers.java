Problem Description

Given three 2-digit integers, A, B and C, find out the minimum number that can be obtained by concatenating them in any order.

Return the minimum result that can be obtained.



Problem Constraints
10 <= A, B, C <= 99



Input Format
The first argument of input contains an integer, A.

The second argument of input contains an integer, B.

The third argument of input contains an integer, C.



Output Format
Return an integer, representing the answer.



Example Input
Input 1:

 A = 10
 B = 20
 C = 30
Input 2:

 A = 55
 B = 43
 C = 47 


Example Output
Output 1:

 102030 
Output 2:

 434755 


Example Explanation
Explanation 1:

 10 + 20 + 30 = 102030 
Explanation 2:

 43 + 47 + 55 = 434755 

   
   
   public class Solution {
    public int solve(int A, int B, int C) {
        

  if(A <= B  &&  B <= C)
        return A*10000 + B*100 + C;
    else if(A <= C && C <= B)
        return A*10000 + C*100 + B;
    else if(B <= A  &&  A <= C)
        return B*10000 + A*100 + C;
    else if(B <= C  &&  C <= A)
        return B*10000 + C*100 + A;
    else if(C <= A  &&  A <= B)
        return C*10000 + A*100 + B;
    else
        return C*10000 + B*100 + A;
    }
}
