class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        
        List<Integer>arr=new ArrayList<>();
        
        for(int i=0;i<nums.length;i+=2){
            int temp=nums[i];
            while(temp>0){
                arr.add(nums[i+1]);
                temp--;
            }
            
        }
        
        int[]res=new int[arr.size()];
        
        for(int j=0;j<res.length;j++){
            
            res[j]=arr.get(j);
        }
        return res;
        
    }
}
