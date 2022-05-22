https://leetcode.com/problems/two-sum/





class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        HashMap<Integer,Integer>map=new HashMap();
        
        int n=nums.length;
        int []arr=new int[2];
        for(int i=0;i<n;i++){
            
            int req=target-nums[i];
            
            if(map.containsKey(req)){
                arr[0]=map.get(req);
                arr[1]=i;
                break;
                
            }
            
            map.put(nums[i],i);
        }
        
        return arr;
    }
}
