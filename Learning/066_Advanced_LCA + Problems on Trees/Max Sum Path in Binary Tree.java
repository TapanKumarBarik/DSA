Problem Description

Given a binary tree T, find the maximum path sum.

The path may start and end at any node in the tree.



Problem Constraints
1 <= Number of Nodes <= 7e4

-1000 <= Value of Node in T <= 1000



Input Format
The first and the only argument contains a pointer to the root of T, A.



Output Format
Return an integer representing the maximum sum path.



Example Input
Input 1:

  
    1
   / \
  2   3
Input 2:

       20
      /  \
   -10   20
        /  \
      -10  -50


Example Output
Output 1:

 6
Output 2:

 40


Example Explanation
Explanation 1:

     The path with maximum sum is: 2 -> 1 -> 3
Explanation 2:

     The path with maximum sum is: 20 -> 20


       
       
       
       
       
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    int maxSum;
    public int maxPathSum(TreeNode A) {
        
        maxSum=Integer.MIN_VALUE;
         helper(A);
         
         return maxSum;

    }
    
    private int helper(TreeNode A){
        
        if(A==null)return 0;

        int lh=Math.max(0, helper(A.left));
        int rh=Math.max(0,helper(A.right));
        
        maxSum=Math.max(maxSum, lh+rh+A.val);
        
        return  A.val+ Math.max(lh,rh);
    }
}

       
