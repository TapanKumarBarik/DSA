Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.

 

Example 1:

Input: nums = [1,2,0]
Output: 3
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
 

Constraints:

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1
  
  
  
  
  class Solution {
    public int firstMissingPositive(int[] nums) {
        //Approach 1
        int n=nums.length;
        boolean []arr=new boolean [n]; 
        for (int i = 0; i < n; i++) {
      if (nums[i] >= 1 && nums[i] <= n) {
        arr[nums[i] - 1] = true;
      }   
        } 
        for(int i=0;i<n;i++){   
            if(!arr[i]){
                return i+1;
            }
        }
        return n+1;
    }
}
