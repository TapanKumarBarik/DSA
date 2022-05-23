//https://leetcode.com/problems/subsets/



class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        int n=nums.length;
        List<List<Integer>>list=new ArrayList();
        solve(0,n,list, new ArrayList(),nums);
        return list;
    }
    
private void solve(int start,int n,List<List<Integer>>list,ArrayList<Integer>temp, int[]nums){
    
        list.add(new ArrayList(temp));
    
        for(int i=start;i<n;i++){
            temp.add(nums[i]);
            solve(i+1,n,list,temp,nums);
            temp.remove(temp.get(temp.size()-1));
        }
    }
}
