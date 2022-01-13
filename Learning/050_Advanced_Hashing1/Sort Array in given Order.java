Problem Description

Given two array of integers A and B, Sort A in such a way that the relative order among the elements will be the same as those are in B. For the elements not present in B, append them at last in sorted order.

Return the array A after sorting from the above method.

NOTE: Elements of B are unique.



Problem Constraints
1 <= length of the array A <= 100000

1 <= length of the array B <= 100000

-10^9 <= A[i] <= 10^9



Input Format
The first argument given is the integer array A.

The second argument given is the integer array B.



Output Format
Return the array A after sorting as described.



Example Input
Input 1:

A = [1, 2, 3, 4, 5]
B = [5, 4, 2]
Input 2:

A = [5, 17, 100, 11]
B = [1, 100]


Example Output
Output 1:

[5, 4, 2, 1, 3]
Output 2:

[100, 5, 11, 17]


Example Explanation
Explanation 1:

 Simply sort as described.
Explanation 2:

 Simply sort as described.



×







public class Solution {
    public int[] solve(int[] A, int[] B) {
        
        
        
//  A : [ 10, 2, 18, 16, 16, 16 ]
// B : [ 3, 13, 2, 16, 4, 19 ]
// Your function returned the following :
// 2 16 10 16 16 18 
// The expected returned value :
// 2 16 16 16 10 18 
        
       Arrays.sort(A);
       
       HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
       for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                int freq=map.get(A[i]);
               map.put(A[i],freq+1);
               
            }else{
                 map.put(A[i],1);
            }
           
          
       }
       ArrayList<Integer>arr=new ArrayList();
       
       for(int i=0;i<B.length;i++){
           if(map.containsKey(B[i])){
              int count=map.get(B[i]);
              while(count>0){
                  arr.add(B[i]);
                  count--;
              }
               map.remove(B[i]);
               
           }
       }
       //adding back
       for(int i=0;i<A.length;i++){
           if(map.containsKey(A[i])){
             arr.add(A[i]);
               
            }
       }
       //
       int []newArr=new int[arr.size()];
       
       for(int i=0;i<newArr.length;i++){
           newArr[i]=arr.get(i);
       }
       return newArr;
    }
}
//
