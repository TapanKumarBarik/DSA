Problem Description

Given a binary tree represented by root A.

Assume a BST is defined as follows:

1) The left subtree of a node contains only nodes with keys less than the node's key.

2) The right subtree of a node contains only nodes with keys greater than the node's key.

3) Both the left and right subtrees must also be binary search trees.



Problem Constraints
1 <= Number of nodes in binary tree <= 100000

0 <= node values <= 10^9



Input Format
First and only argument is head of the binary tree A.



Output Format
Return 0 if false and 1 if true.



Example Input
Input 1:

 
   1
  /  \
 2    3
Input 2:

 
  2
 / \
1   3


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 2 is not less than 1 but is in left subtree of 1.
Explanation 2:

Satisfies all conditions.



×









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
    
    public int isValidBST(TreeNode A) {
        
        
       ArrayList<Integer>arr=new ArrayList();
       
       makeTree(A,arr);
       
       for(int i=1;i<arr.size();i++){
           
          if( arr.get(i)<=arr.get(i-1) ){
              return 0;
          }
        
        //System.out.println(arr.get(i));
           
       }
       return 1;
    }
    
    private void makeTree(TreeNode A,ArrayList<Integer>arr){
        
        if(A==null){
            
            return;
        }
        
        
        makeTree(A.left,arr);
        
           arr.add(A.val);
        
        makeTree(A.right,arr);
    }
}
