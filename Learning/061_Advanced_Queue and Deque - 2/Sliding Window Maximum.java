Problem Description

Given an array of integers A. There is a sliding window of size B which is moving from the very left of the array to the very right. You can only see the B numbers in the window. Each time the sliding window moves rightwards by one position. You have to find the maximum for each window.

Return an array C, where C[i] is the maximum value in the array from A[i] to A[i+B-1].

Refer to the given example for clarity.

NOTE: If B > length of the array, return 1 element with the max of the array.



Problem Constraints
1 <= |A|, B <= 106



Input Format
The first argument given is the integer array A.

The second argument given is the integer B.



Output Format
Return an array C, where C[i] is the maximum value of from A[i] to A[i+B-1].



Example Input
Input 1:

 A = [1, 3, -1, -3, 5, 3, 6, 7]
 B = 3
Input 2:

 A = [1, 2, 3, 4, 2, 7, 1, 3, 6]
 B = 6


Example Output
Output 1:

 [3, 3, 5, 5, 6, 7]
Output 2:

 [7, 7, 7, 7]


Example Explanation
Explanation 1:

 Window position     | Max
 --------------------|-------
 [1 3 -1] -3 5 3 6 7 | 3
 1 [3 -1 -3] 5 3 6 7 | 3
 1 3 [-1 -3 5] 3 6 7 | 5
 1 3 -1 [-3 5 3] 6 7 | 5
 1 3 -1 -3 [5 3 6] 7 | 6
 1 3 -1 -3 5 [3 6 7] | 7
Explanation 2:

 Window position     | Max
 --------------------|-------
 [1 2 3 4 2 7] 1 3 6 | 7
 1 [2 3 4 2 7 1] 3 6 | 7
 1 2 [3 4 2 7 1 3] 6 | 7
 1 2 3 [4 2 7 1 3 6] | 7

   
   
   
   
   
   
   
   
   
   
   public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        
        TreeMap<Integer, Integer> order = new TreeMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for (int i = 0; i <B ; i++) {
            if(order.containsKey(A.get(i)))
            {
                order.put(A.get(i), order.get(A.get(i))+1);
            }else
            {
                order.put(A.get(i),1);
            }
        }
        res.add(order.lastKey());

        for (int i = B; i <A.size() ; i++) {
            
            if(order.get(A.get(i-B))>1)
            {
                order.put(A.get(i-B),order.get(A.get(i-B))-1);
            }else{
                order.remove(A.get(i-B));
            }

            if(order.containsKey(A.get(i)))
            {
                order.put(A.get(i), order.get(A.get(i))+1);
            }else {
                order.put(A.get(i), 1);
            }
            
            res.add(order.lastKey());
        }
        return res;
    }
}










