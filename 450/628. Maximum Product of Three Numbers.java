https://leetcode.com/problems/maximum-product-of-three-numbers/




//sol1
class Solution {
    public int maximumProduct(int[] nums) {
        int len=nums.length;

        Arrays.sort(nums);
         return Math.max(nums[0]*nums[1]*nums[len-1], nums[len-1] * nums[len-2] * nums[len-3]);

    }
}



class Solution {
    public int maximumProduct(int[] nums) {
    int min1=Integer.MAX_VALUE;
        
        int min2=Integer.MAX_VALUE;
        
        int max1=Integer.MIN_VALUE;
        
        int max2=Integer.MIN_VALUE;
        
        int max3=Integer.MIN_VALUE;
        
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            
            
            if(nums[i]>max1){
                max3=max2;
                max2=max1;
                max1=nums[i];
                
            }
            
            else if(nums[i]>max2){
                max3=max2;
                max2=nums[i];
            }
            else if(nums[i]>max3){
                max3=nums[i];
            }
            
            //min
            
            if(nums[i]<min1){
                min2=min1;
                min1=nums[i];
            }
            
            else if(nums[i]<min2){
                min2=nums[i];
            }
        }
        
        return Math.max(max1*max2*max3, max1*min1*min2);
    }
}
