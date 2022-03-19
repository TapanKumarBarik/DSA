https://leetcode.com/problems/partition-labels/

//Array
class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i)
        {
             last[S.charAt(i) - 'a'] = i;
        }
        
        int j = 0;
        int anchor = 0;
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < S.length(); ++i) {
            j = Math.max(j, last[S.charAt(i) - 'a']);
            if (i == j) {
                ans.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return ans;
    }
}



//map

class Solution {
    public List<Integer> partitionLabels(String s) {
        
     List<Integer> list = new ArrayList<>();

       HashMap<Character,Integer>map=new HashMap();
        
        int n=s.length();
        
        for(int i=0;i<n;i++){
            map.put(s.charAt(i),i );
        }
        
        
        int prev=-1;
        
        int max=0;
        
        
        for(int i=0;i<n;i++){
            char curr=s.charAt(i);
            
            max=Math.max(map.get(s.charAt(i)),max);
            
        
            
            if(max==i ){
                list.add(max-prev);
                
                prev=max;
                
            }
        }
        
        return list;
    }
}
