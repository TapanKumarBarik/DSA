https://leetcode.com/problems/reach-a-number/


class Solution {
    public int reachNumber(int target) {
        
        if(target==0)return 0;
        
        
        target=Math.abs(target);
        int sum=0;
        int step=0;
        
        while(sum<target){
            step++;
           sum+=step;   
        }
        while((sum-target)%2!=0 ){
            
            step++;
           sum+=step;
        }
        return step;
        
    }
}
