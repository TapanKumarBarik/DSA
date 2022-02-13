Problem Description

Given a binary tree, return the reverse level order traversal of its nodes values. (i.e, from left to right and from last level to starting level).



Problem Constraints
1 <= number of nodes <= 5 * 105

1 <= node value <= 105



Input Format
First and only argument is a pointer to the root node of the Binary Tree, A.



Output Format
Return an integer array denoting the reverse level order traversal from left to right.



Example Input
Input 1:

    3
   / \
  9  20
    /  \
   15   7
Input 2:

   1
  / \
 6   2
    /
   3


Example Output
Output 1:

 [15, 7, 9, 20, 3] 
Output 2:

 [3, 6, 2, 1]


Example Explanation
Explanation 1:

 Nodes as level 3 : [15, 7]
 Nodes at level 2: [9, 20]
 Nodes at level 1: [3]
 Reverse level order traversal will be: [15, 7, 9, 20, 3]
Explanation 2:

 Nodes as level 3 : [3]
 Nodes at level 2: [6, 2]
 Nodes at level 1: [1]
 Reverse level order traversal will be: [3, 6, 2, 1]
 






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
    public ArrayList<Integer> solve(TreeNode A) {
        
        
       ArrayList< ArrayList<Integer>>arr=new  ArrayList<>();
       
       Queue<TreeNode>q=new LinkedList();
       
       q.add(A);
       
       
       while(!q.isEmpty() ){
           
           
           
           int ln=q.size();
           
            ArrayList<Integer> ar=new  ArrayList<Integer>();
            
            for(int i=0;i<ln;i++){
                
                
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
       
       
        ArrayList<Integer>res=new  ArrayList<Integer>();
        
        for(int i=arr.size()-1;i>=0;i--){
            
            for(int j=0;j<arr.get(i).size();j++){
                res.add(arr.get(i).get(j) );
            }
        }
        return res;
    }
}
