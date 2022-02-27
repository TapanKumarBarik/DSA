//https://leetcode.com/problems/sort-colors/


class Solution {
    public void sortColors(int[] nums) {
        
      
        
        int zero=0;
        int n=nums.length;
        int two=n-1;
        
        for(int i=0;i<n;i++){
            
            while(nums[i]==2  && i<two){
                swap(nums, i, two--);
            }
            
             while(nums[i]==0  && i>zero){
                swap(nums, i, zero++);
            }
        }
        

    }
            private void swap(int []nums, int i, int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
}
