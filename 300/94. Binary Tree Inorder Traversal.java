//https://leetcode.com/problems/binary-tree-inorder-traversal/




//Recursive 


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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        
        List<Integer>arr= new ArrayList();
        solve(root, arr);
        
        return arr;
    }
    private void solve(TreeNode root , List<Integer>arr){
        
        
        if(root==null)return;
        
        solve(root.left, arr);
        arr.add(root.val);
        solve(root.right,arr);
    }
}
