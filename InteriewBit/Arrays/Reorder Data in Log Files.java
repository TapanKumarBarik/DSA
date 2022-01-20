//copied solution

Problem Description
 
 

You are given an array of logs. Each log is a space-delimited string of words, where the first word is the identifier.

There are two types of logs:

Letter-logs: All words (except the identifier) consist of lowercase English letters.
Digit-logs: All words (except the identifier) consist of digits.

Reorder these logs so that:

The letter-logs come before all digit-logs.
The letter-logs are sorted lexicographically by their contents. If their contents are the same, then sort them lexicographically by their identifiers.
The digit-logs maintain their relative ordering.

Return the final order of the logs.


Problem Constraints
1 <= logs.length <= 1000
3 <= logs[i].length <= 1000
All the tokens of logs[i] are separated by a single space.
logs[i] is guaranteed to have an identifier and at least one word after the identifier.


Input Format
The first argument is a string array A where each element is a log.


Output Format
Return the string array A after making the changes.


Example Input
Input 1:
A = ["dig1-8-1-5-1", "let1-art-can", "dig2-3-6", "let2-own-kit-dig", "let3-art-zero"]
Input 2:

A = ["a1-9-2-3-1","g1-act-car","zo4-4-7","ab1-off-key-dog","a8-act-zoo"]


Example Output
Output 1:
["let1-art-can","let3-art-zero","let2-own-kit-dig","dig1-8-1-5-1","dig2-3-6"]
Output 2:

["g1-act-car", "a8-act-zoo", "ab1-off-key-dog", "a1-9-2-3-1", "zo4-4-7"]


Example Explanation
Explanation 1:
The letter-log contents are all different, so their ordering is "art-can", "art-zero", "own-kit-dig".
The digit-logs have a relative order of "dig1-8-1-5-1", "dig2-3-6".
Explanation 2:

The array has been sorted restricted to the conditions given.



  
  
  
  
  
  public class Solution {
    public String[] reorderLogs(String[] A) {
         Arrays.sort(A, new Comparator<String>(){
            public int compare(String s1, String s2)
            {
                int ind1 = s1.indexOf('-');
                int ind2 = s2.indexOf('-');
                String id1 = s1.substring(0, ind1);
                String id2 = s2.substring(0, ind2);
                String word1 = s1.substring(ind1+1);
                String word2 = s2.substring(ind2+1);
                boolean let1 = Character.isLetter(word1.charAt(0));
                boolean let2 = Character.isLetter(word2.charAt(0));
                if(let1 && let2)
                {
                    int comp = word1.compareTo(word2);
                    if(comp == 0)
                        return id1.compareTo(id2);
                    return comp;
                }
                else if(let1 && !let2)
                {
                    return -1;
                }
                else if(!let1 && let2)
                {
                    return 1;
                }
                return 0;
            }
        });
        return A;
    }
}
