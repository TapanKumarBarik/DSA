Given an unsorted array, find the maximum difference between the successive elements in its sorted form.

Try to solve it in linear time/space.

Example :

Input : [1, 10, 5]
Output : 5 
Return 0 if the array contains less than 2 elements.

You may assume that all the elements in the array are non-negative integers and fit in the 32-bit signed integer range.

  
  
  public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) { 
        int n=A.length;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=A[i];
        }
        Arrays.sort(arr);
        int max=0;
        for(int i=0;i<n-1;i++){
            int temp=Math.abs(arr[i]-arr[i+1]);
            max=Math.max(temp,max);
        }
        return max;
    }
}
