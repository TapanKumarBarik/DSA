Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
  
  
  
  
  class Solution {
    public String longestCommonPrefix(String[] strs) {
     
        
        Arrays.sort(strs);
        
        //
        int l=strs[0].length();
        int n=strs.length;
        
        String s="";
        
        for(int i=0;i<l;i++){
            if(strs[0].charAt(i)!=strs[n-1].charAt(i)){
                return s;
            }
            else{
                s+=strs[0].charAt(i);
            }
        }
        return s;
    }
}
