Problem Description
Given a binary tree of integers denoted by root A. Return an array of integers representing the right view of the Binary tree.

Right view of a Binary Tree is a set of nodes visible when the tree is visited from Right side.



Problem Constraints
1 <= Number of nodes in binary tree <= 100000

0 <= node values <= 10^9



Input Format
First and only argument is head of the binary tree A.



Output Format
Return an array, representing the right view of the binary tree.



Example Input
Input 1:

 
            1
          /   \
         2    3
        / \  / \
       4   5 6  7
      /
     8 
Input 2:

 
            1
           /  \
          2    3
           \
            4
             \
              5


Example Output
Output 1:

 [1, 3, 7, 8]
Output 2:

 [1, 3, 4, 5]


Example Explanation
Explanation 1:

Right view is described.
Explanation 2:

Right view is described.



  
  
  
  
  
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
        
        
        ArrayList<ArrayList<Integer>>arr=new ArrayList();
        
        Queue<TreeNode>q=new LinkedList<>();
        
        
        q.add(A);
        
        while(!q.isEmpty()){
            
            
            int len=q.size();
            ArrayList<Integer>ar=new ArrayList<Integer>();
            
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
        
        
        ArrayList<Integer>res=new ArrayList<Integer>();
        
        for(int i=0;i<arr.size();i++){
            
            int siz=arr.get(i).size();
            res.add(arr.get(i).get(siz-1));
            
        }
        return res;
    }
}
