Problem Description

Given a string A, you are asked to reverse the string and return the reversed string.



Problem Constraints
1 <= |A| <= 105

String A consist only of lowercase characters.



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the reversed string.



Example Input
Input 1:

 A = "scaler"
Input 2:

 A = "academy"


Example Output
Output 1:

 "relacs"
Output 2:

 "ymedaca"


Example Explanation
Explanation 1:

 Reverse the given string.

   
   
   
   
   public class Solution {
    public String solve(String s) {
    String res = "";
    // create an array of size s and store all values;

    char[] arr = new char[s.length()];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = s.charAt(i);
    }
    // reverse the array

    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      char temp = arr[end];
      arr[end] = arr[start];
      arr[start] = temp;
      start++;
      end--;
    }

    for (int i = 0; i < arr.length; i++) {
      res += arr[i];
    }

      return res;
    }
}
