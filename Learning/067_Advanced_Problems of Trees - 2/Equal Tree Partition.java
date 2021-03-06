Problem Description
Given a binary tree A. Check whether it is possible to partition the tree to two trees which have equal sum of values after removing exactly one edge on the original tree.



Problem Constraints
1 <= size of tree <= 100000

0 <= value of node <= 109



Input Format
First and only argument is head of tree A.



Output Format
Return 1 if the tree can be partitioned into two trees of equal sum else return 0.



Example Input
Input 1:

 
                5
               /  \
              3    7
             / \  / \
            4  6  5  6
Input 2:

 
                1
               / \
              2   10
                  / \
                 20  2


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 Remove edge between 5(root node) and 7: 
        Tree 1 =                                               Tree 2 =
                        5                                                     7
                       /                                                     / \
                      3                                                     5   6    
                     / \
                    4   6
        Sum of Tree 1 = Sum of Tree 2 = 18
Explanation 2:

 The given Tree cannot be partitioned.

   
   
   
   
   
   
   
   
   //with SET
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
 
 //use map
 // if sum is 0 and it;s frwq is 2 then 1 else 0
public class Solution {
   
    HashSet<Long>set;
    public int solve(TreeNode A) {
        
        set=new HashSet();
         long totalSum=solveSum(A);
        
        
        //if(totalSum==0)return 0;
        long halfSum=totalSum/2;
        
        if(set.contains(halfSum)){
            return 1;
        }
        
        return 0;
    }
    
    private long solveSum(TreeNode A){
        
        if(A==null)return 0;
        // totalSum+=A.val;
        // set.add(totalSum);
        long ls=solveSum(A.left);
        
        long rs=solveSum(A.right);
        
        long totalSum=ls+rs+A.val;
        set.add(totalSum);
       
        
        return totalSum;
    }
}



//WITH MAP
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
 
 //use map
 // if sum is 0 and it;s frwq is 2 then 1 else 0
public class Solution {
   
    HashMap<Long,Integer>map;
    public int solve(TreeNode A) {
        
        map=new HashMap();
         long totalSum=solveSum(A);
        
        
        if(totalSum==0)
        {
            
           if( map.get(totalSum)==2)return 1;
           return 0;
        }
        long halfSum=totalSum/2;
        
        if(map.containsKey(halfSum)){
            return 1;
        }
        
        return 0;
    }
    
    private long solveSum(TreeNode A){
        
        if(A==null)return 0;
        // totalSum+=A.val;
        // set.add(totalSum);
        long ls=solveSum(A.left);
        
        long rs=solveSum(A.right);
        
        long totalSum=ls+rs+A.val;
        
        if(map.containsKey(totalSum)){
            
            int freq=map.get(totalSum);
            map.put(totalSum,freq+1);
        }
        
        else{
           map.put(totalSum,1); 
        }
        
       
        
        return totalSum;
    }
}
