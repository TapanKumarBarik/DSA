public class Solution {
    public int solve(int[] A, int B) {
        
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<A.length;i++){
            
            int num=A[i];
            int rem=B-num;
            if(map.containsKey(rem)){
                
                return 1;
            }
            
            
            
          map.put(A[i],i);  
        }
        return 0;
        
    }
}
