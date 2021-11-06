Find if Given number is power of 2 or not. 

More specifically, find if given number can be expressed as 2^k where k >= 1.

Input:

number length can be more than 64, which mean number can be greater than 2 ^ 64 (out of long long range)
Output:

return 1 if the number is a power of 2 else return 0

Example:

Input : 128
Output : 1
  
  
  
  
  
  public class Solution {
    public int power(String A) {
        if(A.equals("1") || A.equals("0"))
        {
          return 0;
        }
        
        int n=0;
        for(int i=0;i<A.length();i++)
       {
            n=n*10+A.charAt(i)-'0';
       }


        if((n&(n-1))==0)
        {
            return 1;
        }
       
        return 0;
    }
}
