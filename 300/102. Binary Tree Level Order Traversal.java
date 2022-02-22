//https://leetcode.com/problems/binary-tree-level-order-traversal/

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        
        
        Queue<TreeNode>q=new LinkedList();
        
        List<List<Integer>>arr=new ArrayList();
        
        if(root==null){
            return arr;
        }
        
        
        q.add(root);
        
        
        while(!q.isEmpty()){
            
            
            
            int len=q.size();
            
            List<Integer>ar=new ArrayList();
            
            for(int i=0;i<len;i++){
                
                TreeNode temp=q.poll();
                ar.add(temp.val);
                
                
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                
               
            }
             arr.add(ar);
        }
        
        return arr;
        
        
    }
}
