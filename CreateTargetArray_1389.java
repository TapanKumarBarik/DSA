class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        
        
        List<Integer>arr=new ArrayList<>();
        int []res=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            
            arr.add(index[i],nums[i]);
            
             }
                for(int j=0;j<nums.length;j++){
                    
                    res[j]=arr.get(j);
                 }
        
       return res; 
    }
}
