Given an integer array nums that may contain duplicates, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
  
  
  
  class Solution {
    List<List<Integer>> res=new ArrayList();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
   
        Arrays.sort(nums);
        generateSubset(0,nums,new ArrayList());
        return res;
    }
    
private void generateSubset(int index,int[]nums,  List<Integer> curr)
    {
        res.add(new ArrayList(curr));
        
        for(int i=index;i<nums.length;i++){
            
            if(i>index && nums[i-1]==nums[i]){
                continue;
            }
            curr.add(nums[i]);
             generateSubset(i+1,nums,curr);
            curr.remove(curr.size()-1);
        }
        
        
    }
}
