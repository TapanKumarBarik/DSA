https://www.hackerearth.com/practice/notes/get-the-modulo-of-a-very-large-number-that-cannot-be-stored-in-any-data-type-in-cc-1/

Problem Description
You are given a huge number in the form of a string A where each character denotes a digit of the number.
You are also given a number B. You have to find out the value of A % B and return it.



Problem Constraints
1 <= A.size() <= 105
0 <= Ai <= 9
1 <= B <= 109


Input Format
The first argument is the string A.
The second argument is the integer B.


Output Format
Return a single integer denoting the value of A % B.


Example Input
Input 1:
A = "143"
B = 2
Input 2:

A = "43535321"
B = 47


Example Output
Output 1:
1
Output 2:

20


Example Explanation
Explanation 1:
143 is an odd number so 143 % 2 = 1.
Explanation 2:

43535321 % 47 = 20
  
  //////////////////////////////////////////////////////////////////////////////////////////////////////
  E.g. 12345 % 100:
ans = 0
ans = (o*10 + 1)%100
ans = (1*10 + 2)%100
ans = (12*10 + 3)%100
ans = (23*10 + 4)%100
ans = (34*10 + 5)%100
ans = 45
  
  
  //////////////////////////////////////////////////////////////////////
  
  
  
  
  
  
  public class Solution {
    public int findMod(String A, int B) {
        

        
        long res=0;
        
        for(int i=0 ;i <A.length();i++){
          
                 res=(res*10+(int)A.charAt(i)-'0')%B;
            
        }
        int ans=(int)res%B;
        return ans;
    }
}
