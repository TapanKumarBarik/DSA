Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
  
  
  
  
  
class Solution {
    public boolean checkInclusion(String s1, String s2) {
int[] arr = new int[26];

    for (int i = 0; i < s1.length(); i++) {
      arr[s1.charAt(i) - 'a']--;
    }

    int startIndex = 0;
    for (int i = 0; i < s2.length(); i++) {
      arr[s2.charAt(i) - 'a']++;

      while (arr[s2.charAt(i) - 'a'] > 0) {

        arr[s2.charAt(startIndex++) - 'a']--;

      }

      if (i - startIndex + 1 == s1.length()) {
        return true;
      }
    }

    return false;
    }
}
