Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
  
  
  
  
  
  //Approach 1
  
  class Solution {
    public int[] productExceptSelf(int[] nums) {
           int[] left_array = new int[nums.length];
    int[] right_array = new int[nums.length];
    int[] res_array = new int[nums.length];
    // assign initial variables
    left_array[0] = 1;
    right_array[nums.length - 1] = 1;

    // calculate the left array
    for (int i = 1; i < nums.length; i++) {
      left_array[i] = left_array[i - 1] * nums[i - 1];
    }

    for (int i = nums.length - 2; i >= 0; i--) {
      right_array[i] = right_array[i + 1] * nums[i + 1];
    }

    for (int i = 0; i < res_array.length; i++) {
      res_array[i] = left_array[i] * right_array[i];
    }
        return res_array;
    }
}



//Approach 2

