Given a binary tree. Given a binary tree, return the values of its boundary in anti-clockwise direction starting from the root. Boundary includes left boundary, leaves, and right boundary in order without duplicate nodes.

Left boundary is defined as the path from the root to the left-most node. Right boundary is defined as the path from the root to the right-most node. If the root doesn't have left subtree or right subtree, then the root itself is left boundary or right boundary. Note this definition only applies to the input binary tree, and not applies to any subtrees.

The left-most node is defined as a leaf node you could reach when you always firstly travel to the left subtree if exists. If not, travel to the right subtree. Repeat until you reach a leaf node.

The right-most node is also defined by the same way with left and right exchanged.

Return an array of integers denoting the boundary values of tree in anti-clockwise order.

For Example

Input 1:
               _____1_____
              /           \
             2             3
            / \            / 
           4   5          6   
              / \        / \
             7   8      9  10  
Output 1:
    [1, 2, 4, 7, 8, 9, 10, 6, 3]
    Explanation 1:
        The left boundary are node 1,2,4. (4 is the left-most node according to definition)
        The leaves are node 4,7,8,9,10.
        The right boundary are node 1,3,6,10. (10 is the right-most node).
        So order them in anti-clockwise without duplicate nodes we have [1,2,4,7,8,9,10,6,3].

Input 2:
                1
               / \
              2   3
             / \  / \
            4   5 6  7
Output 2:
     [1, 2, 4, 5, 6, 7, 3] 










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
    public ArrayList<Integer> solve(TreeNode node) {
        
 ArrayList<Integer> ans = new ArrayList<Integer>(); 
 
 
 // if it is not a leaf  node add it
	    if(isLeaf(node) == false) 
	    {
	        ans.add(node.val); 
	    }
	    
	    //add the left except left
	    addLeftBoundary(node, ans); 
	    
	    addLeaves(node, ans); 
	    addRightBoundary(node, ans); 
	    return ans;
    }
    
    //helper method checking if it is a leaf node
  private Boolean isLeaf(TreeNode root) {
        return (root.left == null) && (root.right == null);
    }
    
    
    //adding the left boundry
    // while root.left != nulll keep adding left nodes to array ,
  private void addLeftBoundary(TreeNode root, ArrayList<Integer> res) {
        TreeNode cur = root.left;
        while (cur != null) {
            if (isLeaf(cur) == false)
            {
                res.add(cur.val);
            }
            if (cur.left != null) 
            {
                cur = cur.left;
            }
            else 
            {
                cur = cur.right;
            }
        }
    }
    
    //all leaf
        private void addLeaves(TreeNode root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.val);
            return;
        }
        if (root.left != null) addLeaves(root.left, res);
        if (root.right != null) addLeaves(root.right, res);
    }
    
    
    //adding right
    private void addRightBoundary(TreeNode root, ArrayList<Integer> res) {
        
        TreeNode cur = root.right;
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        
        while (cur != null) {
            if (isLeaf(cur) == false) 
            {
                tmp.add(cur.val);
            }
            if (cur.right != null)
            {
                cur = cur.right;
            }
            else 
            {
                cur = cur.left;
            }
        }
        int i;
        for (i = tmp.size()-1; i >= 0; --i) {
            res.add(tmp.get(i));
        }
    }
    

}
