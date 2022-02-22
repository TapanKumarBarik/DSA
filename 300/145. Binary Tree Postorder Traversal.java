// /https://leetcode.com/problems/binary-tree-postorder-traversal/



//recursive 


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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer>arr=new ArrayList();
        
        solve(root, arr);
        
        return arr;
            
        
    }
    private void solve(TreeNode root , List<Integer>arr){
        
        if(root==null ){
            return;
        }
        
        solve(root.left,arr);
        solve(root.right,arr);
        arr.add(root.val);
        
    }
    
}




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
    public List<Integer> postorderTraversal(TreeNode root) {
        
Stack<TreeNode>st=new Stack();
        
        List<Integer>arr=new ArrayList<Integer>();
        
        
        TreeNode curr=root;
        TreeNode prev=null;
        
        while(curr!=null || !st.isEmpty()){
            
            
            while(curr!=null){
                
                st.push(curr);
                curr=curr.left;
            }
            
            
            if(st.peek().right==null || st.peek().right==prev){
                prev=st.pop();
                
                arr.add(prev.val);
            }
            
            else{
            curr=st.peek();
            curr=curr.right;
            }

           
            
        }
        return arr;
    }
    
}
