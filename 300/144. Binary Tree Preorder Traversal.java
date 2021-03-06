//https://leetcode.com/problems/binary-tree-preorder-traversal/




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
    public List<Integer> preorderTraversal(TreeNode root) {
       
        ArrayList<Integer>arr=new ArrayList();
        
        solve(root,arr);
        
        return arr;
        
    }
    
    private void solve(TreeNode root, ArrayList<Integer>arr){
        
        
        if(root==null)return ;
        
        arr.add(root.val);
        solve(root.left,arr);
        solve(root.right, arr);
    }
}





//iterative approach

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
    public List<Integer> preorderTraversal(TreeNode root) {
       
     Stack<TreeNode >st=new Stack();
        
        List<Integer>arr=new ArrayList();
        TreeNode curr=root;
        
        while(curr!=null || !st.isEmpty() ){
            
            
            while(curr!=null){
                arr.add(curr.val);
                st.push(curr);
                curr=curr.left;
            }
            
            curr=st.pop();
            curr=curr.right;
            
            
        }
        
        return arr;
    }
}


//morris


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
    public List<Integer> preorderTraversal(TreeNode root) {
        
       
        
        TreeNode pre=null;
        
        List<Integer>arr=new ArrayList();
        
        while(root!=null){
            
            
            if(root.left==null){
                
                arr.add(root.val);
                root=root.right;
            }
            
            else{
                
                pre=root.left;
                
                
                while(pre.right!=null && pre.right !=root){
                    
                    pre=pre.right;
                }
                
                if(pre.right==null){
                    arr.add(root.val);
                    pre.right=root;
                    root=root.left;
                }
                
                else{
                    
                    pre.right=null;
                    
                   // 
                    
                    root=root.right;
                }
                
            }
            
            
        }
        return arr;
        
    }
}
