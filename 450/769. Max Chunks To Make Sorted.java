https://leetcode.com/problems/max-chunks-to-make-sorted/



class Solution {
    public int maxChunksToSorted(int[] arr) {
        
        
        int res=0;
        
        int max=0;
        
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            
            
            max=Math.max(max, arr[i]);
            
            
            if(i==max){
                res++;
            }
        }
        
        return res;
    }
}
