Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.

 

Example 1:

Input: nums = [2,3,-1,8,4]
Output: 3
Explanation:
The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4
Example 2:

Input: nums = [1,-1,4]
Output: 2
Explanation:
The sum of the numbers before index 2 is: 1 + -1 = 0
The sum of the numbers after index 2 is: 0
Example 3:

Input: nums = [2,5]
Output: -1
Explanation:
There is no valid middleIndex.
Example 4:

Input: nums = [1]
Output: 0
Explantion:
The sum of the numbers before index 0 is: 0
The sum of the numbers after index 0 is: 0
 

Constraints:

1 <= nums.length <= 100
-1000 <= nums[i] <= 1000
 

Note: This question is the same as 724: https://leetcode.com/problems/find-pivot-index/






class Solution {
    public int pivotIndex(int[] nums) {
        
//         int[]p=new int[nums.length];
//         int[]s=new int[nums.length];
//         p[0]=nums[0];
//         s[nums.length-1]=nums[nums.length-1];
//         for(int i=1;i<nums.length;i++){
//             p[i]=nums[i]+p[i-1];
//         }
        
//         for(int i=nums.length-2;i>=0;i--){
//             s[i]=nums[i]+s[i+1];
//         }
        
        
//         for(int i=0;i<nums.length;i++){
//             if(p[i]==s[i]){
//                 return i;
//             }
//         }
//         return -1;
        
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        
        int leftIndexSum=0;
        for(int i=0;i<nums.length;i++){
            if(leftIndexSum==sum-leftIndexSum-nums[i]){
                return i;
            }
            leftIndexSum+=nums[i];
        }
        
        return -1;
        
    }
}
