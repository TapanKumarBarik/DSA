Problem Description

Given a binary search tree.
Return the distance between two nodes with given two keys B and C. It may be assumed that both keys exist in BST.

NOTE: Distance between two nodes is number of edges between them.



Problem Constraints
1 <= Number of nodes in binary tree <= 1000000

0 <= node values <= 109



Input Format
First argument is a root node of the binary tree, A.

Second argument is an integer B.

Third argument is an integer C.



Output Format
Return an integer denoting the distance between two nodes with given two keys B and C



Example Input
Input 1:

    
         5
       /   \
      2     8
     / \   / \
    1   4 6   11
 B = 2
 C = 11
Input 2:

    
         6
       /   \
      2     9
     / \   / \
    1   4 7   10
 B = 2
 C = 6


Example Output
Output 1:

 3
Output 2:

 1


Example Explanation
Explanation 1:

 Path between 2 and 11 is: 2 -> 5 -> 8 -> 11. Distance will be 3.
Explanation 2:

 Path between 2 and 6 is: 2 -> 6. Distance will be 1
   
   
   
   
   
   
   
   
   
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
    public int solve(TreeNode root, int node1, int node2) {
        
     if (root == null) return -1;
    TreeNode lca = lca(root, node1, node2);
    return getDistance(lca, node1) + getDistance(lca, node2);
}

private int getDistance(TreeNode src, int dest) {
    if (src.val == dest) return 0;
    TreeNode node = src.left;
    if (src.val < dest) {
        node = src.right;
    }
    return 1 + getDistance(node, dest);
}

private TreeNode lca(TreeNode root, int node1, int node2) {
    while (true) {
        if (root.val > node1 && root.val > node2) {
            root = root.left;
        } else if (root.val < node1 && root.val < node2) {
            root = root.right;
        } else {
            return root;
        }
    }
}
}
