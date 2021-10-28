Problem Description

Given an array A of N integers.

Find the largest continuous sequence in a array which sums to zero.



Problem Constraints
1 <= N <= 106

-107 <= A[i] <= 107



Input Format
Single argument which is an integer array A.



Output Format
Return an array denoting the longest continuous sequence with total sum of zero.

NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.



Example Input
A = [1,2,-2,4,-4]


Example Output
[2,-2,4,-4]


Example Explanation
[2,-2,4,-4] is the longest sequence with total sum of zero.


public class Solution {
    public int[] lszero(int[] A) {
        
         int[] parr = new int[A.length];

    // prefix
    parr[0] = A[0];
    for (int i = 1; i < A.length; i++) {
      parr[i] = parr[i - 1] + A[i];
    }
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    m.put(0, -1);
    int ans = Integer.MIN_VALUE;
    int lastIndex = -1;
    int num = 0;
    for (int i = 0; i < parr.length; i++) {
      if (m.containsKey(parr[i])) {
        if (ans < i + 1 - m.get(parr[i])) {
          ans = i + 1 - m.get(parr[i]);
          lastIndex = i;
          num = parr[i];
        }

      } else {
        m.put(parr[i], i);
      }
    }
    int a = m.get(num) + 1;
    int count = 0;
    if(lastIndex==-1){
        return new int[0];
    }
    int[] arr = new int[lastIndex - m.get(num)];
    for (int i = a; i < lastIndex + 1; i++) {
      arr[count] = A[i];
      count++;
    }
    
        return arr;
    }
}
