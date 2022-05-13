Problem Description
You are given a string A of lowercase English alphabets. Rearrange the characters of the given string A such that there is no boring substring in A.

A boring substring has the following properties:

Its length is 2.
Both the characters are consecutive, for example - "ab", "cd", "dc", "zy" etc.(If the first character is C then the next character can be either (C+1) or (C-1)).
Return 1 if it is possible to rearrange the letters of A such that there are no boring substrings in A else, return 0.



Problem Constraints
1 <= |A| <= 105



Input Format
The only argument given is a string A.



Output Format
Return 1 if it is possible to rearrange the letters of A such that there are no boring substrings in A else, return 0.



Example Input
Input 1:

 A = "abcd"
Input 2:

 A = "aab"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 String A can be rearranged into "cadb" or "bdac" 
Explanation 2:

 No arrangement of string A can make it free of boring substrings.
   
   
   
   
   
   
   
   
   
   
   public class Solution {
    public int solve(String A) {

        ArrayList<Character>odd=new ArrayList();

        ArrayList<Character>even=new ArrayList();

        int n=A.length();
        for(int i=0;i<n;i++){
            int curr=A.charAt(i)-'a';
            if(curr%2==0){
                odd.add(A.charAt(i));
            }
            else{
               even.add(A.charAt(i)); 
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        int m=odd.size();
        int k=even.size();
        if(Math.abs(odd.get(m-1)-even.get(0))!=1){
            return 1;
        }
        if(Math.abs(even.get(k-1)-odd.get(0))!=1){
            return 1;
        }
        return 0;
    }
}
