https://leetcode.com/problems/longest-substring-without-repeating-characters/



class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        int i=0;
        int n=s.length();
        
        HashSet<Character>set=new HashSet();
        int res=0;
        
        int j=0;
        
        while(j<n){
            
            char curr=s.charAt(j);
            
            while(set.contains(curr)){
               
                set.remove(s.charAt(i));
                i++; 
            }
            set.add(curr);
            
            j++;
            res=Math.max(res, set.size());
        }
        return res;
    }
}
