https://leetcode.com/problems/product-of-array-except-self/


class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        
        int n=nums.length;
        int[]left=new int[n];
        int[]right=new int[n];
        
        int[]arr=new int[n];
        
        left[0]=nums[0];
        for(int i=1;i<n;i++){
            left[i]=nums[i]*left[i-1];
            
        }
        
        right[n-1]=nums[n-1];
        
        for(int i=n-2;i>=0;i--){
            
            right[i]=nums[i]*right[i+1];
        }
        
         arr[0]=right[1];
        arr[nums.length-1]=left[nums.length-2];
        for(int i=1;i<n-1;i++){
            arr[i]=left[i-1]* right[i+1];
        }
        
        return arr;
    }
}
//input [1,2,3,4]
//left  [1,2,6,24]
//right [24,24,12,4]
//op    [24,12,8,6]
