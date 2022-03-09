Problem Description

Given an array A of N numbers, you have to perform B operations. In each operation, you have to pick any one of the N elements and add original value(value stored at index before we did any operations) to it's current value. You can choose any of the N elements in each operation.

Perform B operations in such a way that the largest element of the modified array(after B operations) is minimised. Find the minimum possible largest element after B operations.



Problem Constraints
1 <= N <= 106
0 <= B <= 105
-105 <= A[i] <= 105



Input Format
First argument is an integer array A.
Second argument is an integer B.



Output Format
Return an integer denoting the minimum possible largest element after B operations.



Example Input
Input 1:

 A = [1, 2, 3, 4] 
 B = 3
Input 2:

 A = [5, 1, 4, 2] 
 B = 5


Example Output
Output 1:

 4
Output 2:

 5


Example Explanation
Explanation 1:

 Apply operation on element at index 0, the array would change to [2, 2, 3, 4]
 Apply operation on element at index 0, the array would change to [3, 2, 3, 4]
 Apply operation on element at index 0, the array would change to [4, 2, 3, 4]
 Minimum possible largest element after 3 operations is 4.
Explanation 2:

 Apply operation on element at index 1, the array would change to [5, 2, 4, 2]
 Apply operation on element at index 1, the array would change to [5, 3, 4, 2]
 Apply operation on element at index 1, the array would change to [5, 4, 4, 2]
 Apply operation on element at index 1, the array would change to [5, 5, 4, 2]
 Apply operation on element at index 3, the array would change to [5, 5, 4, 4]
 Minimum possible largest element after 5 operations is 5.

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   public class Solution {
    
    class Pair{
        int val;
        int index;
        
        public Pair(int val, int index){
         this.val=val;
         this.index=index;
        }
    }

    public int solve(ArrayList<Integer> A, int B) {
        
        PriorityQueue<Pair>pq=new PriorityQueue<>((o1,o2)->o1.val-o2.val);
        
        int n=A.size();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            pq.offer(new Pair( 2*A.get(i),i ));
            max=Math.max(max, A.get(i) );
        }
        
        while(B!=0){
            
            Pair temp=pq.poll();
            int curr=temp.val;
            max=Math.max(curr, max);
            
                 curr+=A.get(temp.index);
                 pq.offer(new Pair(curr,temp.index) );
                  B--;
            
        }
        return max;
    }
}
