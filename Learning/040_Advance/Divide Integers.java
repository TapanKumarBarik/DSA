Problem Description

Divide two integers without using multiplication, division and mod operator.

Return the floor of the result of the division.

Also, consider if there can be overflow cases i.e output is greater than INT_MAX, return INT_MAX.

NOTE: INT_MAX = 2^31 - 1



Problem Constraints
-231 <= A, B <= 231-1

B!= 0



Input Format
First argument is an integer A denoting the dividend.
Second argument is an integer B denoting the divisor.



Output Format
Return an integer denoting the floor value of the division.



Example Input
Input 1:

 A = 5
 B = 2
Input 2:

 A = 7
 B = 1


Example Output
Output 1:

 2
Output 2:

 7


Example Explanation
Explanation 1:

 floor(5/2) = 2
   
   
   
   
   
   
   public class Solution {
    public int divide(int a, int b) {
        
         if(a==Integer.MIN_VALUE && b==-1) return Integer.MAX_VALUE;
         
        if(a==Integer.MAX_VALUE && b==1) return Integer.MAX_VALUE;
        
        a=Math.abs(a);
        b=Math.abs(b);
        
        int res=0;
        
        while(a-b>=0){
            int x=0;
            while(a-(b<<1<<x)>=0){
               x++;
            }
            res+=(1<<x);
            a-=(b<<x);
        }
     return ((a>0 && b>0) || (a<0 && b<0))?res:-res;
    }
}
