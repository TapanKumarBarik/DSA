//https://leetcode.com/problems/maximum-subarray/


class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum=Integer.MIN_VALUE;
        int currentSum=0;
        int i=0;
        int n=nums.length;
        while(i<n){
            
            currentSum+=nums[i];
            sum=Math.max(sum, currentSum);
            
            if(currentSum<0){
                
                currentSum=0;
            }
            
            i++;
        
        }
        
        return sum;
        
    }
}
