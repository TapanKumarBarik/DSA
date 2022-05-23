https://leetcode.com/problems/subsets-ii/



class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>>list=new ArrayList();
        Arrays.sort(nums);
        solve(0, list, new ArrayList(), nums);
        
        return list;
    }
    
    private void solve(int start, List<List<Integer>>list, ArrayList<Integer>temp, int[]nums){
        
        list.add(new ArrayList(temp));
        
        for(int i=start;i<nums.length;i++){
            
            if(i>start  && nums[i]==nums[i-1]){
                continue;
            }
            
            temp.add(nums[i]);
            solve(i+1, list, temp, nums);
            
            temp.remove(temp.get(temp.size()-1));
        }
        
    }
}
