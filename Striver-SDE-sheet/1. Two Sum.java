//https://leetcode.com/problems/two-sum/



class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        HashMap<Integer,Integer>map=new HashMap();
        
        int []arr=new int[2];
        
        
        for(int i=0;i<nums.length;i++){
            
            int curr=target-nums[i];
            
        if(map.containsKey(curr)){
            
            
            arr[0]=i;
            arr[1]=map.get(curr);
            break;
        }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}
