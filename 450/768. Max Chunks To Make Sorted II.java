https://leetcode.com/problems/max-chunks-to-make-sorted-ii/


class Solution {
    public int maxChunksToSorted(int[] arr) {
      
        
        int n=arr.length;
        int []rmin=new int[n+1];
        
        rmin[n]=Integer.MAX_VALUE;
        
        
        for(int i=n-1;i>=0;i--){
            
            rmin[i]=Math.min(rmin [i+1], arr[i]);
        }
        
        
        int lmax=Integer.MIN_VALUE;
        
        int res=0;
        for(int i=0;i<n;i++){
            
            lmax=Math.max(lmax, arr[i]);
            
            if(lmax<=rmin[i+1]){
                res++;
            }
        }
        return res;
        
    }
}
