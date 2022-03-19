https://leetcode.com/problems/sort-array-by-parity/


class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        
        int l=0;
        int n=nums.length;
        int r=n-1;
        
        
        while(l<r){
            
            
            if(nums[l]%2==1){
                
                swap(nums, l , r);
                r--;
            }
            else{
                l++;
            }
        }
        return nums;
    }
    
    private void swap(int[]arr, int l, int r){
        
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
