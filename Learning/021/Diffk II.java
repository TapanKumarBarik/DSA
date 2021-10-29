Diffk II
Given an array A of integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

Example :

Input :

A : [1 5 3]
k : 2
Output :

1
as 3 - 1 = 2

Return 0 / 1 for this problem.
  
  
  
  public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int diffPossible(final int[] A, int B) {
        
        
      
        
        HashMap<Integer,Integer>m=new HashMap<Integer,Integer>();
        //hashmap
        for(int i=0;i<A.length;i++){
            if(m.containsKey(A[i])){
                m.put(A[i],m.get(A[i])+1);
            }
            else{
                 m.put(A[i],1);
            }
        }
        //
        
        for(int i=0;i<A.length;i++){
            int a1=A[i];
            int a2=a1-B;
            //edge case 1
            if(a1==a2){
                if(m.get(a2)>1){
                    return 1;
                    
                }
            }
            //case 2
            else{
                  if(m.containsKey(a2)){
                    return 1;
                    
                } 
            }
            //
            
        }
        //
        return 0;
    }
}
