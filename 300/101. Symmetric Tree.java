//https://leetcode.com/problems/symmetric-tree/



//iterative

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
    public boolean isSymmetric(TreeNode root) {
        
        
        if(root==null){
            return true;
        }
        
     Queue<TreeNode>q=new LinkedList();
        
        q.add(root.left);
        q.add(root.right);
        
        while(!q.isEmpty()){
            
           TreeNode node1=q.poll();
            TreeNode node2=q.poll();
            
            if(node1==null && node2==null){
                continue;
            }
            
          
            
            if( node1==null || node2==null|| node1.val!=node2.val){
                return false;
            }
            
            
            
                q.add(node1.left);
            
            
            
               q.add(node2.right);
            q.add(node1.right);
            q.add(node2.left);
            
        }
        
        return true;
        
    }
}



//recursive
