https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/



class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        
    int res = 0;
    int i = 0;
    int j = 0;
    int count = 0;
        
    while (j < nums.length) {
        
        if (nums[j] > right) {
            i = j + 1;
            count = 0;
        } else if (nums[j] < left) {
            res += count;
        } else {
            count = (j - i + 1);
            res += count;
        }
        j++;
    }
    return res;
        
    }
}
