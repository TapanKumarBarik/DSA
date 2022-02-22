Problem Description

Given a binary tree of integers. Find the difference between the sum of nodes at odd level and sum of nodes at even level.

NOTE: Consider the level of root node as 1.



Problem Constraints
1 <= Number of nodes in binary tree <= 100000

0 <= node values <= 109



Input Format
First and only argument is a root node of the binary tree, A



Output Format
Return an integer denoting the difference between the sum of nodes at odd level and sum of nodes at even level.



Example Input
Input 1:

        1
      /   \
     2     3
    / \   / \
   4   5 6   7
  /
 8 
Input 2:

        1
       / \
      2   10
       \
        4


Example Output
Output 1:

 10
Output 2:

 -7


Example Explanation
Explanation 1:

 Sum of nodes at odd level = 23
 Sum of ndoes at even level = 13
Explanation 2:

 Sum of nodes at odd level = 5
 Sum of ndoes at even level = 12



   
   
   
   
   
   
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
    public int solve(TreeNode A) {
        
        
        Queue<TreeNode >q=new LinkedList();
        
   int oddSum=0;
   int evenSum=0;
        
        q.add(A);
        
        int level=-1;
        
        
        while(!q.isEmpty()){
            
            
            level++;
            
            int size=q.size();
            
            
            
            if(level%2==0){
                
                for(int i=0;i<size;i++){
                
                TreeNode temp=q.poll();
                evenSum+=temp.val;
                
                if(temp.left!=null){
                    q.add(temp.left);
                    
                }
                
                if(temp.right!=null){
                    q.add(temp.right);
                }
                
                
                
            }
            }
            //
            
            else{
                
                 
                for(int i=0;i<size;i++){
                
                TreeNode temp=q.poll();
                oddSum+=temp.val;
                
                if(temp.left!=null){
                    q.add(temp.left);
                    
                }
                
                if(temp.right!=null){
                    q.add(temp.right);
                }
                
            }
                
            }
            //

            
        }
        
        return evenSum-oddSum;
    }
}
