Problem Description
Given a bitonic sequence A of N distinct elements, write a program to find a given element B in the bitonic sequence in O(logN) time.

NOTE:

A Bitonic Sequence is a sequence of numbers which is first strictly increasing then after a point strictly decreasing.


Problem Constraints
3 <= N <= 105

1 <= A[i], B <= 108

Given array always contain a bitonic point.

Array A always contain distinct elements.



Input Format
First argument is an integer array A denoting the bitonic sequence.

Second argument is an integer B.



Output Format
Return a single integer denoting the position (0 index based) of the element B in the array A if B doesn't exist in A return -1.



Example Input
Input 1:

 A = [3, 9, 10, 20, 17, 5, 1]
 B = 20
Input 2:

 A = [5, 6, 7, 8, 9, 10, 3, 2, 1]
 B = 30


Example Output
Output 1:

 3
Output 2:

 -1


Example Explanation
Explanation 1:

 B = 20 present in A at index 3
Explanation 2:

 B = 30 is not present in A
 
 
 
 
 
 public class Solution {
    public int solve(int[] a, int target) {
         int maxIndex = findMaxElement(a);
        int targetIndex = binarySearch(a, 0, maxIndex, target);
        if (targetIndex != -1) {
            return targetIndex;
        }
        return binarySearch(a, maxIndex + 1, a.length - 1, target);  
    }
     // Order agnostic binary search
    private  int binarySearch(int[] a, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (target == a[mid]) {
            return mid;
        } else if ((a[start] < a[end] && target < a[mid]) || (a[start] > a[end] && target > a[mid])) {
            return binarySearch(a, start, mid - 1, target);
        } else {
            return binarySearch(a, mid + 1, end, target);
        }
    }
    // Find Max element in a Bitonic array
    private  int findMaxElement(int[] a) {
        int n = a.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if ((mid == 0 || a[mid] > a[mid - 1]) && (mid == n - 1 || a[mid] > a[mid + 1])) { 
                return mid;      // a[mid] is greater than both its neighbours. It is the maximum, return its index
            } else if (a[mid] < a[mid - 1]) {                 
                end = mid - 1;   // a[mid] is smaller than its previous element, maximum lies in left half
            } else {                 
                start = mid + 1; // maximum lies in the right half
            }
        }

        return -1;
    }
}
