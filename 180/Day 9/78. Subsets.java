Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
  
  
  
  
  
  class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        generateSubset(0,nums,new ArrayList(),res);
        
        return res;
    }
    
    private void generateSubset(int index,
                                int[]nums,
                                List<Integer> curr,
                                List<List<Integer>> res)
    {
        
        res.add(new ArrayList(curr));
        
        for(int i=index;i<nums.length;i++){
            
            curr.add(nums[i]);
             generateSubset(i+1,nums,curr,res);
            curr.remove(curr.size()-1);
        }
        
    }
}
