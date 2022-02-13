Problem Description

Given a binary tree, return the zigzag level order traversal of its nodes values. (ie, from left to right, then right to left for the next level and alternate between).



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return a 2D integer array denoting the zigzag level order traversal of the given binary tree.



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

 [
   [3],
   [20, 9],
   [15, 7]
 ]
Output 2:

 [ 
   [1]
   [2, 6]
   [3]
 ]


Example Explanation
Explanation 1:

 Return the 2D array. Each row denotes the zigzag traversal of each level.'
   
   
   
   
   
   
   
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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        
        ArrayList<ArrayList<Integer>>arr=new ArrayList();
        
        //HashMap<TreeNode,Integer>map=new HashMap();
        
        Queue<TreeNode>q=new LinkedList();
        
        q.add(A);
        
        int level=0;
        
        
        while(!q.isEmpty() ){
            
            ArrayList<Integer>ar=new ArrayList();
            
            int ln=q.size();
            level++;
            
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
            
            if(level % 2==0){
                arr.add(reverse(ar) );
            }
            else{
              arr.add(ar);
            
            }
    
            
        }
        
        return arr;
        
    }
    
    
    private ArrayList<Integer>reverse(ArrayList <Integer>ar){
        
        int start=0;
        int end=ar.size()-1;
        
        while(start<end){
            swap(ar,start,end);
            start++;
            end--;
        }
        
        return ar;
    }
    
    private void swap(ArrayList <Integer>ar , int left, int right){
        
        int temp=ar.get(left);
        
        ar.set(left,ar.get(right));
        ar.set(right,temp);
        
    }
}
