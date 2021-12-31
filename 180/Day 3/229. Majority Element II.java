Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 

Follow up: Could you solve the problem in linear time and in O(1) space?







class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
        int fitem=-1;
        
        int fcnt=0;
        
        int litem=-1;
        int lcnt=0;
        int n=nums.length;
        
        int i=0;
        while(i<nums.length){
            
            
            if(nums[i]==fitem)fcnt++;
            else if(nums[i]==litem)lcnt++;
            else if(fcnt==0){
                fitem=nums[i];
                fcnt=1;
            }
            else if(lcnt==0){
                litem=nums[i];
                lcnt=1;
            }
            
            else{
                fcnt--;
                lcnt--;
            }
            i++;
        }
        List<Integer> list=new ArrayList<>();
        
        
        
      int ctr1=0;
       int ctr2=0;
        for(int k : nums)
        {
            if(k==fitem)
                ctr1++;
            else if(k==litem)
                ctr2++;
        }
        if(ctr1>n/3)list.add(fitem);
        if(ctr2>n/3)list.add(litem);
        return list;
        
       
 
        
    }
}
