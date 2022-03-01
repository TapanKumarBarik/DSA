//https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        
        int res=nums[0];
        int vote =1;
        
        for(int i=1;i<nums.length;i++){
              if(vote==0 ){
                res=nums[i];
            }   
            if(res==nums[i]){
                vote++;
            }
            else{
                vote--;
            }
        }
        return res;
    }
}
