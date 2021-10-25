Given a number A in the form of string. Check if the number is divisible by 8 or not.

Return 1 if it is divisible by 8 else return 0.


Input Format

The only argument given is string A.
Output Format

Return 1 if it is divisible by 8 else return 0.

Constraints

1 <= length of the String <= 100000
'0' <= A[i] <= '9'
For Example

Input 1:
    A = "16"
Output 1:
    1

Input 2:
    A = "123"
Output 2:
    0
      
      
      
      
      
      
      public class Solution {
    public int solve(String A) {

        if (A.length() == 0) {
            return 0;
        }
        if (A.length() == 1) {
            int num = A.charAt(0) - '0';
            if (num % 8 == 0) {
                return 1;
            } else {
                return 0;
            }

        }
        if (A.length() == 2) {
            int num = A.charAt(1) - '0';
            int num1 = A.charAt(0) - '0';
            int res = num1 * 10 + num;
            if (res % 8 == 0) {
                return 1;
            } else {
                return 0;
            }
        } else if (A.length() >= 3) {
            int num = A.charAt(A.length() - 1) - '0';
            int num1 = A.charAt(A.length() - 2) - '0';
            int num2 = A.charAt(A.length() - 3) - '0';
            int res = (num2 * 100) + (num1 * 10) + num; //a.length-3
            if (res % 8 == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        return 0;
    }
}
