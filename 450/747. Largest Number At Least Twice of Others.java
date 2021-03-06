https://leetcode.com/problems/largest-number-at-least-twice-of-others/


class Solution {
    public int dominantIndex(int[] nums) {
        
        
        int n=nums.length;
        if(n==1)return 0;
        
        
        HashMap<Integer, Integer>map=new HashMap();
        
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        
        if(nums[n-1]>=2*nums[n-2]){
            return map.get(nums[n-1]);
        }
        return -1;
    }
}



class Solution {
    public int dominantIndex(int[] nums) {
        
        
        int n=nums.length;
        if(n==1)return 0;
        
        
        int max=Integer.MIN_VALUE;
        int maxindex=-1;;
        
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxindex=i;
            }
        }
        Arrays.sort(nums);
        
        if(nums[n-1]>=2*nums[n-2]){
            return maxindex;
        }
        return -1;
    }
}
