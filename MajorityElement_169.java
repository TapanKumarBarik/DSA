class Solution {
    public int majorityElement(int[] nums) {
        
        int ansIndex=0;
        int count=1;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==nums[ansIndex]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                count=1;
                ansIndex=i;
            }
            
        }
       
           return nums[ansIndex];
      
    }
}
