Problem Description

Implement pow(x, n) % d.
In other words, given x, n and d,

find (xn % d)

Note that remainders on division cannot be negative. In other words, make sure the answer you return is non negative.

Input : x = 2, n = 3, d = 3
Output : 2

2^3 % 3 = 8 % 3 = 2.


  
  
  
  public class Solution {
    public int pow(int A, int B, int C) {
        
          // Base cases
    if (A == 0)
        return 0;
    if (B == 0)
        return 1;
     
    // If B is even
    long y;
    if (B % 2 == 0)
    {
        y = pow(A, B / 2, C);
        y = (y * y) % C;
    }
     
    // If B is odd
    else
    {
        y = pow(A, B / 2, C);
        y = (((y * y)%C) * A) % C; 
    }
     
    return (int)((y+C)  % C);
        
    }
}
