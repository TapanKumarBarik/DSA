Problem Description

Given an array of integers A denoting a stream of integers. New arrays of integer B and C are formed. Each time an integer is encountered in a stream, append it at the end of B and append median of array B at the C.

Find and return the array C.

NOTE:

If the number of elements are N in B and N is odd then consider medain as B[N/2] ( B must be in sorted order).
If the number of elements are N in B and N is even then consider medain as B[N/2-1]. ( B must be in sorted order).


Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 109



Input Format
The only argument given is the integer array A.



Output Format
Return an integer array C, C[i] denotes the median of first i elements.



Example Input
Input 1:

 A = [1, 2, 5, 4, 3]
Input 2:

 A = [5, 17, 100, 11]


Example Output
Output 1:

 [1, 1, 2, 2, 3]
Output 2:

 [5, 5, 17, 11]


Example Explanation
Explanation 1:

 stream          median
 [1]             1
 [1, 2]          1
 [1, 2, 5]       2
 [1, 2, 5, 4]    2
 [1, 2, 5, 4, 3] 3
Explanation 2:

 stream          median
 [5]              5
 [5, 17]          5
 [5, 17, 100]     17
 [5, 17, 100, 11] 11 




   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        
        PriorityQueue<Integer>maxHeap=new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        
        ArrayList<Integer>arr=new ArrayList();
        
        int n=A.size();

        for(int i=0;i<n;i++){
            
            int curr=A.get(i);
            
                if (maxHeap.size() != 0 && (curr > maxHeap.peek())){
                     minHeap.offer(curr);
                }
                else{
                     maxHeap.offer(curr);
                }
                 
                if (Math.abs(maxHeap.size() - minHeap.size()) >1) {
                  if (maxHeap.size() > minHeap.size()) {
                    int temp = maxHeap.poll();
                    minHeap.offer(temp);
                  } else {
                    int temp = minHeap.poll();
                    maxHeap.offer(temp);
                  }
                }
            if(i%2==0){
                
                if(maxHeap.size()>minHeap.size()){
                    arr.add(maxHeap.peek() );
                }
                else{
                     arr.add(minHeap.peek() );
                }
            }
            else{
               arr.add(maxHeap.peek() );
            }
        }
        return arr;
    }
}

  
