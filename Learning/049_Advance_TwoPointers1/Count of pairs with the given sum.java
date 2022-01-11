Given a sorted array of distinct integers A and an integer B, find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.


Input Format

The first argument given is the integer array A.
The second argument given is integer B.
Output Format

Return the number of pairs for which sum is equal to B.
Constraints

1 <= length of the array <= 100000
1 <= A[i] <= 10^9 
1 <= B <= 10^9
For Example

Input 1:
    A = [1, 2, 3, 4, 5]
    B = 5
Output 1:
    2

Input 2:
    A = [5, 10, 20, 100, 105]
    B = 110
Output 2:
    2


      
      
      
      
      
      
      public class Solution {
    public int solve(int[] A, int B) {
        int res=0;
        
        //brut force
        // for(int i=0;i<A.length;i++){
        //   for(int j=i+1;j<A.length;j++){
        //         int count=A[i]+A[j];
        //         if(count==B){
        //             res++;
        //         }
                
        //   }
            
        // }
        
        //two pointer
        //////////////////////////////////////////////
        
        //Putting all the items to the hashmap with their frequencies;
        
        // HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        
        // for(int i=0;i<A.length;i++){
        //     if(map.containsKey(A[i])){
        //         int freq=map.get(A[i]);
        //         map.put(A[i],freq+1);
        //     }
        //     else{
        //          map.put(A[i],1);
        //     }
        // }
        
        // //i+j=b
        // //i=b-j
        // for(int i=0;i<A.length;i++){
        //     int a=A[i];
        //     int whatWeNeed=B-a;
        //     if(map.containsKey(whatWeNeed)){
        //         res++;

        //     }
        // }
        
        // return res/2;
        
        
        ///////////////////////////////
     //Most Optimal
     int l=0;
     int r=A.length-1;
     int ans=0;
     while(l<r){
         int sum=A[l]+A[r];
         if(sum==B)ans++;
         if(sum<=B)l++;
         else r--;
     }
     return ans;
    }
}
