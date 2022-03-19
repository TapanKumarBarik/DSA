https://leetcode.com/problems/majority-element/


class Solution {
    public int majorityElement(int[] nums) {
        
        int vote=1;
        
        int n=nums.length;
        
        int currNum=nums[0];
        
        
        
        for(int i=1;i<n;i++){
            
                 if(vote==0){
                currNum=nums[i];
            }
            if(nums[i]==currNum){
                vote++;
            }
            
            else{
                vote--;
            }
            
            
       
        }
        
        return currNum;
        
    }
}
