bookmark-empty
Smaller and Greater
You are given an Array A of size N.

Find for how many elements, there is a strictly smaller element and a strictly greater element.



Input Format

Given only argument A an Array of Integers.
Output Format

Return an Integer X, i.e number of elements.
Constraints

1 <= N <= 1e5
1 <= A[i] <= 1e6
For Example
//1
Example Input:
    A = [1, 2, 3]

Example Output:
    1

Explanation:
    only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.
 //2
        
 Example Input:
    A = [1, 2, 3,3,3,3,3,3,3,3,3,3,3]

Example Output:
    1
Explanation:
    only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.
        
        
        //////////////////////////////////
        public class Solution {
    public int solve(int[] A) {
        
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<A.length;i++){
            max=Math.max(max,A[i]);
            min=Math.min(min,A[i]);
        }
        
        int count=0;
        
        for(int i=0;i<A.length;i++){
            
            if(A[i]!=max && A[i]!=min){
                count++;
            }
        }
        return count;
    }
}

