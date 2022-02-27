//https://leetcode.com/problems/next-permutation/




class Solution {
    public void nextPermutation(int[] nums) {
        
          int n=nums.length;
        
        
        int firstDecresingIndex=n-2;
        
        while(firstDecresingIndex>=0 && nums[firstDecresingIndex]>=nums[firstDecresingIndex+1]){
            firstDecresingIndex--;
        }
        
        
           //here we got the firstDecresingIndex;
        
        if(firstDecresingIndex>=0)
        {
            int secondDecresingIndex=nums.length-1;
            
            while(secondDecresingIndex>=0 &&
                 nums[secondDecresingIndex]<=nums[firstDecresingIndex])
            {
             secondDecresingIndex--;   
            }
            
            //here we got secondDecresingIndex
            
            //swap
            swap(nums,firstDecresingIndex,secondDecresingIndex);
        }
        //reverse
        reverse(nums,firstDecresingIndex+1);
    
    }
    
    
  private void reverse(int []nums,int start)
    {
       int end=nums.length-1;
        
        while(start<=end){
            
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    
    private void swap(int[]nums, int left, int right){
        
        
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        
    }
}
