Problem Description

You are given two strings A and B of size N and M respectively.

You have to find the count of all permutations of A present in B as a substring. You can assume a string will have only lowercase letters.



Problem Constraints
1 <= N < M <= 105



Input Format
Given two argument, A and B of type String.



Output Format
Return a single Integer, i.e number of permutations of A present in B as a substring.



Example Input
Input 1:

 A = "abc"
 B = "abcbacabc"
Input 2:

 A = "aca"
 B = "acaa"


Example Output
Output 1:

 5
Output 2:

 2


Example Explanation
Explanation 1:

 Permutations of A that are present in B as substring are:
    1. abc
    2. cba
    3. bac
    4. cab
    5. abc
    So ans is 5.
Explanation 2:

 Permutations of A that are present in B as substring are:
    1. aca
    2. caa 








public class Solution {
    public int solve(String A, String B) {
        int count = 0;
    HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
    HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();

    // B is Big
    // hm1 is big

    for (int i = 0; i < A.length(); i++) {
      if (hm1.containsKey(B.charAt(i))) {
        int temp = hm1.get(B.charAt(i));
        hm1.put(B.charAt(i), temp + 1);
      } else {
        hm1.put(B.charAt(i), 1);
      }
    }

    // small A
    // hm2 is small

    for (int i = 0; i < A.length(); i++) {
      if (hm2.containsKey(A.charAt(i))) {
        int temp = hm2.get(A.charAt(i));
        hm2.put(A.charAt(i), temp + 1);
      } else {
        hm2.put(A.charAt(i), 1);
      }
    }
    // iterate
    
    if(CheckIfEqual(hm1, hm2)){
        count++; 
    }
    
    int start = 1;
    int end = A.length();

    while (end < B.length() ) {

   
      char temp = B.charAt(start-1);
      char tempend = B.charAt(end );

      int tempB = hm1.get(temp);

      hm1.put(temp, tempB - 1);
      
      if (hm1.get(temp) == 0) {
        hm1.remove(temp);
      }

      if (hm1.containsKey(tempend)) {
        int tempEnd = hm1.get(tempend);
        hm1.put(tempend, tempEnd + 1);

      } else {
        hm1.put(tempend, 1);
      }
   boolean ch = CheckIfEqual(hm1, hm2);

      if (ch) {
        count++;
      }


      start++;
      end++;
    }

    ////
     return count;
    //System.out.println(count);
  }

  private static boolean CheckIfEqual(HashMap<Character, Integer> hm1, HashMap<Character, Integer> hm2) {

    // Using for-each loop
    for (Map.Entry mapElement : hm1.entrySet()) {
      char key = (char) mapElement.getKey();

      // Add some bonus marks
      // to all the students and print it
      int value = ((int) mapElement.getValue());

      if (  !hm2.containsKey(key) || hm2.get(key) != value) {
        return false;
      }
    }
    return true;
  }
}



