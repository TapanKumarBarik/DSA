Problem Description

Given two integer array A and B of size N and M respectively. Your task is to find all the common elements in both the array.

NOTE:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.


Problem Constraints
1 <= N, M <= 105

1 <= A[i] <= 109



Input Format
First argument is an integer array A of size N.

Second argument is an integer array B of size M.



Output Format
Return an integer array denoting the common elements.



Example Input
Input 1:

 A = [1, 2, 2, 1]
 B = [2, 3, 1, 2]
Input 2:

 A = [2, 1, 4, 10]
 B = [3, 6, 2, 10, 10]


Example Output
Output 1:

 [1, 2, 2]
Output 2:

 [2, 10]


Example Explanation
Explanation 1:

 Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
Explantion 2:

 Elements (2, 10) appears in both the array.

   
   
   
   public class Solution {
    public int[] solve(int[] A, int[] B) {
        
        
        HashMap<Integer,Integer>m1=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer>m2=new HashMap<Integer,Integer>();
        //

    //
      for (int i = 0; i < A.length; i++) {
          if (m1.containsKey(A[i])) {
            int temp = m1.get(A[i]);
            m1.put(A[i], temp + 1);
          } 
          else {
            m1.put(A[i], 1);
          }
      }
    // b
      for (int i = 0; i < B.length; i++) {
          if (m2.containsKey(B[i])) {
            int temp = m2.get(B[i]);
            m2.put(B[i], temp + 1);
          } 
          else {
            m2.put(B[i], 1);
          }
      } //

    ArrayList<Integer> arr = new ArrayList<Integer>();

      if (A.length < B.length) {
          for (int i = 0; i < A.length; i++) {

              if ( m1.containsKey(A[i])&& m2.containsKey(A[i]) ) {

               if(m1.get(A[i]) > 0 && m2.get(A[i]) > 0){
                arr.add(A[i]);
                m1.put(A[i], m1.get(A[i]) - 1);
                m2.put(A[i], m2.get(A[i]) - 1);
              }
              }
          }
      }
      else{
           for (int i = 0; i < B.length; i++) {

              if ( m1.containsKey(B[i])&& m2.containsKey(B[i]) ) {

               if(m1.get(B[i]) > 0 && m2.get(B[i]) > 0){
                arr.add(B[i]);
                m1.put(B[i], m1.get(B[i]) - 1);
                m2.put(B[i], m2.get(B[i]) - 1);
              }
              }
          }
      }
       //
       int []ar=new int[arr.size()];
       
      for(int i=0;i<ar.length;i++){
          ar[i]=arr.get(i);
      }
       return ar;
    }
}
