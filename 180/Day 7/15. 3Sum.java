Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []
 

Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105
  
  
  
  
  class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
  Arrays.sort(nums);
        int n=nums.length;
        
   List<List<Integer>> arr= new ArrayList<>();
        
        for(int i=0;i<n-2;i++){
            
            if( i==0 ||( i>0 && nums[i]!=nums[i-1])){
                
                int lo=i+1;
                int hi=n-1;
                
                int target=0-nums[i];
                
                while(lo<hi){
                    if(nums[lo]+nums[hi]==target){
                        arr.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                           while(lo<hi && nums[lo]==nums[lo+1]){
                        lo++;
                    }
                    
                    while(lo<hi && nums[hi]==nums[hi-1]){
                        hi--;
                    }
                        lo++; hi--;
                    }
                     else if (nums[lo] + nums[hi] < target) 
                {
                    lo++;
                }
                else 
                {
                    hi--;
                }
                 
                    
                }
                
            }
            
            
            
            
        }
        
        
        
        return arr;
        
    }
}
