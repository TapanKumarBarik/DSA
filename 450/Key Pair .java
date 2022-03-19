https://practice.geeksforgeeks.org/problems/key-pair5616/1/#

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        
        HashMap<Integer, Integer>map=new HashMap();
        
        for(int i=0;i<n;i++){
            
            
            int curr=arr[i];
            
            int target=x-curr;
            
            if(map.containsKey(target) ){
                return true;
            }
            
            map.put(curr, i);
        }
        
        return false;
    }
}
