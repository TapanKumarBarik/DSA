Problem Description

Shaggy has an array A consisting of N elements. We call a pair of distinct indices in that array as a special pair if elements at that index in the array are equal.

Shaggy wants you to find a special pair such that distance between that pair is minimum. Distance between two indices is defined as |i-j|. If there is no special pair in the array then return -1.



Problem Constraints
1 <= |A| <= 105



Input Format
First and only argument is the array A.



Output Format
Return one integer corresponding to the minimum possible distance between a special pair.



Example Input
Input 1:

A = [7, 1, 3, 4, 1, 7]
Input 2:

A = [1, 1]


Example Output
Output 1:

 3
Output 2:

 1


Example Explanation
Explanation 1:

Here we have 2 options:
1. A[1] and A[4] are both 1 so (1,4) is a special pair and |1-4|=3.
2. A[0] and A[5] are both 7 so (0,5) is a special pair and |0-5|=5.
Therefore the minimum possible distance is 3. 
Explanation 2:

Only possibility is choosing A[1] and A[2].


  
  
  
  public class Solution {
    public int solve(int[] A) {
        
        //brut force
        
    //     int res=Integer.MAX_VALUE;
    //     for(int i=0;i<A.length-1;i++){
    //         for(int j=i+1;j<A.length;j++){
    //             if(A[i]==A[j]){
    //                 res=Math.min(res,j-i);
    //             }
    //         }
    //     }
    //     if(res==Integer.MAX_VALUE){
    //         return -1;
    //     }
    //     return res;
    
    
    
    
    //optimal
    
    HashMap<Integer,Integer>m=new HashMap<Integer,Integer>();
    int res=Integer.MAX_VALUE;
    for(int i=0;i<A.length;i++){
        
        if(m.containsKey(A[i])){
            int temp=m.get(A[i]);
                res=Math.min(res,i-temp);
        }
        else{
            m.put(A[i],i);
        }
    }
            if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;
    
     }
}
