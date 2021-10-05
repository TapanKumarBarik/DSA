class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            
            
            int num=nums[i];
            
            int rem=target-num;
            
            if(map.containsKey(rem)){
                
                int index=map.get(rem);
                return new int[]{i,index};
            }
            
            
            map.put(num,i);
        }
         return new int[]{};
    }
}
