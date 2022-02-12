Problem Description

Given a binary tree, return a 2-D array with vertical order traversal of it. Go through the example and image for more details.


NOTE: If 2 Tree Nodes shares the same vertical level then the one with lesser depth will come first.



Problem Constraints
0 <= number of nodes <= 105



Input Format
First and only arument is a pointer to the root node of binary tree, A.



Output Format
Return a 2D array denoting the vertical order traversal of tree as shown.



Example Input
Input 1:

      6
    /   \
   3     7
  / \     \
 2   5     9
Input 2:

      1
    /   \
   3     7
  /       \
 2         9


Example Output
Output 1:

 [
    [2],
    [3],
    [6, 5],
    [7],
    [9]
 ]
Output 2:

 [
    [2],
    [3],
    [1],
    [7],
    [9]
 ]


Example Explanation
Explanation 1:

 First row represent the verical line 1 and so on.
   
   
   
   
   
   
   
   
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
 
 class pair{
    TreeNode node;
    int dist;
    
    public pair(TreeNode node, int dist){
        this.node=node;
        this.dist=dist;
    }
    
 }
 
public class Solution {
    

    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        
        ArrayList<ArrayList<Integer>>arr=new ArrayList<ArrayList<Integer>>();
        HashMap<Integer,ArrayList<Integer>>map=new HashMap();
        
        Queue<pair>q=new LinkedList();
        map.put(0,new ArrayList());
        map.get(0).add(A.val);
        
       pair p= new pair(A,0);
        q.add(p);
        
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        while(!q.isEmpty()){
            
            
            TreeNode tempt=q.peek().node;
            int tempval=q.peek().dist;
            
            int len=q.size();
            q.remove();
            
            min=Math.min(tempval,min);
            max=Math.max(tempval,max);
            
            //1 
            //going one by one
                
                
                if(tempt.left!=null){
                    
                    if(map.containsKey(tempval-1)){
                        
                        ArrayList<Integer>temporaryArray= map.get(tempval-1);
                        temporaryArray.add(tempt.left.val);
                        map.put(tempval-1,temporaryArray);
                    }
                    else{
                        
                        map.put(tempval-1,new ArrayList());
                        map.get(tempval-1).add(tempt.left.val);
                    }
                    
                    
                    pair tempp=new pair(tempt.left,tempval-1);
                    q.add(tempp);
                    
                    
                }
                
                
                if(tempt.right!=null){
                                        
                    if(map.containsKey(tempval+1)){
                        
                        ArrayList<Integer>temporaryArray= map.get(tempval+1);
                        temporaryArray.add(tempt.right.val);
                        map.put(tempval+1,temporaryArray);
                    }
                    else{
                        map.put(tempval+1,new ArrayList());
                        map.get(tempval+1).add(tempt.right.val);
                    }
                    pair tempp=new pair(tempt.right,tempval+1);
                    q.add(tempp);
                    
                }
        }
        
        
        //return result
        for(int i=min; i<=max;i++){
            
            arr.add(map.get(i));
        }
        
        
        return arr;
        
    }
}
