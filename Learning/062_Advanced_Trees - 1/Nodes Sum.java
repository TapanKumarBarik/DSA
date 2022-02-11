Problem Description

You are given the root node of a binary tree A. You have to find the sum of node values of this tree.



Problem Constraints
1 <= Number of nodes in the tree <= 105

0 <= Value of each node <= 104



Input Format
First and only argument is a tree node A.



Output Format
Return an integer denoting the sum of node values of the tree.



Example Input
Input 1:

 Values =  1 
          / \     
         4   3                        
Input 2:

 
 Values =  1      
          / \     
         8   3                       
        /         
       2                                     


Example Output
Output 1:

 8 
Output 2:

 14 


Example Explanation
Explanation 1:

Clearly, 1 + 4 + 3 = 8.
Explanation 2:

Clearly, 1 + 8 + 3 + 2 = 14.

  
  
  
  
  
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
 
 
 //Try 1
public class Solution {
     int sum=0;
     public int solve(TreeNode A) {
        
         if(A==null)return 0;
         sum+=A.val;
         solve(A.left);
         solve(A.right);
        
         return sum;
     }
 }







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
    
    public int solve(TreeNode A) {
        int res=0;
        return sum(A,res);
        
    }
    
    private int sum(TreeNode A,int res){
        
        if(A==null)return 0;
        res=A.val+sum(A.left,res)+sum(A.right,res);
        return res;
    }
}

