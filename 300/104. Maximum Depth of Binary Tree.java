// https://leetcode.com/problems/maximum-depth-of-binary-tree/

//return  Math.max(ls, rs)+1;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count;
    public int maxDepth(TreeNode root) {
     
        count=0;
        
        count=solve(root);
        return count;
    }
    
    private int solve(TreeNode root){
        
        if(root==null)return 0;
        
        
        int ls=solve(root.left);
        
        int rs=solve(root.right);
        
        return  Math.max(ls, rs)+1;
    }
}
