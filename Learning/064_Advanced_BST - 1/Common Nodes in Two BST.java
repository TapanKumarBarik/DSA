Map<Integer, Integer> map = new HashMap<Integer, Integer>();

// Iterating over keys only
for (Integer key : map.keySet()) {
    System.out.println("Key = " + key);
}

// Iterating over values only
for (Integer value : map.values()) {
    System.out.println("Value = " + value);
}





Problem Description

Given two BST's A and B, return the (sum of all common nodes in both A and B) % (109 +7) .

In case there is no common node, return 0.

NOTE:

Try to do it one pass through the trees.



Problem Constraints
1 <= Number of nodes in the tree A and B <= 105

1 <= Node values <= 106



Input Format
First argument represents the root of BST A.

Second argument represents the root of BST B.



Output Format
Return an integer denoting the (sum of all common nodes in both BST's A and B) % (109 +7) .



Example Input
Input 1:

 Tree A:
    5
   / \
  2   8
   \   \
    3   15
        /
        9

 Tree B:
    7
   / \
  1  10
   \   \
    2  15
       /
      11
Input 2:

  Tree A:
    7
   / \
  1   10
   \   \
    2   15
        /
       11

 Tree B:
    7
   / \
  1  10
   \   \
    2  15
       /
      11


Example Output
Output 1:

 17
Output 2:

 46


Example Explanation
Explanation 1:

 Common Nodes are : 2, 15
 So answer is 2 + 15 = 17
Explanation 2:

 Common Nodes are : 7, 2, 1, 10, 15, 11
 So answer is 7 + 2 + 1 + 10 + 15 + 11 = 46
                                
                                
                                
                                
                                
                                
                                
                                


                                
                                
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
    public int solve(TreeNode A, TreeNode B) {
        
        HashMap<Integer,Integer>map=new HashMap();
        
        preOrderTraversal(map, A);
        
         preOrderTraversal(map, B);
         
         int res=0;
         int mod=1000000007;
         for(int key:map.keySet()){
             
             int item=map.get(key);
             if(item ==2){
                 res+=key;
                 res=res%mod;
                 
             }
             
         }
         
         return res;
        
    }
    
    private void preOrderTraversal(HashMap<Integer,Integer>map,TreeNode node){
        
        if(node==null){
            return;
        }
        
        preOrderTraversal(map, node.left);
        if(map.containsKey(node.val)){
            int freq=map.get(node.val);
            map.put(node.val,freq+1);
        }
        else{
            map.put(node.val,1);
        }
        preOrderTraversal(map, node.right);
        
    }
}


