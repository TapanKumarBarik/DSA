Problem Description
Given a binary search tree represented by root A, write a function to find the Bth smallest element in the tree.



Problem Constraints
1 <= Number of nodes in binary tree <= 100000

0 <= node values <= 10^9



Input Format
First and only argument is head of the binary tree A.



Output Format
Return an integer, representing the Bth element.



Example Input
Input 1:

 
            2
          /   \
         1    3
B = 2
Input 2:

 
            3
           /
          2
         /
        1
B = 1



Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

2nd element is 2.
Explanation 2:

1st element is 1.


  
  
 
 
 
 //optimal
 
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
    
    int k;
    public int kthsmallest(TreeNode A, int B) {
        
  
         k=B;
        int res=solve(A);
   
        return res;
    }
    
    private int solve(TreeNode A){
        
        if(A==null){
            return -1;
        }
        
       int k1= solve(A.left);
        if(k==0){
            return k1;
        }
        k--;
        if(k==0){
            return A.val;
        }
       return  solve(A.right);
        
    }
}

 
 
  
  
  
  //brut force
  
  
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
    public int kthsmallest(TreeNode A, int B) {
        
        
        ArrayList<Integer>arr=new ArrayList<Integer>();
        
        solve(A, arr);
        int result=0;
        
        for(int i=0;i<arr.size();i++ ){
            
            if(i==B-1){
                result=arr.get(i);
                break;
            }
            
        }
        return result;
    }
    
    private void solve(TreeNode A, ArrayList<Integer>arr){
        
        if(A==null){
            return ;
        }
        
        solve(A.left,arr);
        arr.add(A.val);
        solve(A.right,arr);
        
    }
}

  
