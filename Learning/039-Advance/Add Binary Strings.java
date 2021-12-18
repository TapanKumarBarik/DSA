Problem Description

Given two binary strings, return their sum (also a binary string).
Example:

a = "100"

b = "11"
Return a + b = "111".

  
  
  
   Solution Approach
Since sizes of two strings may be different, we first make the size of smaller string equal to that of bigger string by adding leading 0s for simplicity
Note that you can handle the addition without adding zeroes as well by adding a few if statements.
After making sizes same, one by one, we add bits from rightmost bit to leftmost bit.
In every iteration, we need to sum 3 bits: 2 bits of 2 given strings and carry.

The sum bit will be 1 if, either all of the 3 bits are set or one of them is set.
So we can add all the bits and then take remainder with 2 to get the current bit in the answer.

How to find carry?

Carry will be 1 if any of the two bits is set. So we can find carry by adding the bits and dividing the result by 2.

Following is a step by step algorithm:

Make them equal sized by adding 0s at the begining of smaller string.

Perform bit addition

Boolean expression for adding 3 bits a, b, c

Sum = (a + b + c) % 2
Carry = (a + b + c ) / 2
  
  
  
  
  public class Solution {
    public String addBinary(String A, String B) {
        
        
        
        int a=A.length()-1;
        int b=B.length()-1;
        int carry=0;
        StringBuilder ans=new StringBuilder();
        
        while(a>=0 || b>=0){
            int temp=0;
            
            if(a>=0){
                temp+=A.charAt(a)-'0';
            }
            if(b>=0){
                 temp+=B.charAt(b)-'0'; 
            }
            temp+=carry;
            
            int toBeAdded=temp%2;
            carry=temp/2;
            ans.append(toBeAdded);
            
            a--;
            b--;
        }
        
        if(carry!=0){
            ans.append(carry);
        }
        
        return ans.reverse().toString();
    }
}
