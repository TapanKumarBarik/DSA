Problem Description
Two elements of a binary search tree (BST),represented by root A are swapped by mistake. Tell us the 2 values swapping which the tree will be restored.

A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?



Problem Constraints
1 <= size of tree <= 100000



Input Format
First and only argument is the head of the tree,A



Output Format
Return the 2 elements which need to be swapped.



Example Input
Input 1:

 
         1
        / \
       2   3
Input 2:

 
         2
        / \
       3   1



Example Output
Output 1:

 [2, 1]
Output 2:

 [3, 1]


Example Explanation
Explanation 1:

Swapping 1 and 2 will change the BST to be 
         2
        / \
       1   3
which is a valid BST 
Explanation 2:

Swapping 1 and 3 will change the BST to be 
         2
        / \
       1   3
which is a valid BST 





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
    public ArrayList<Integer> recoverTree(TreeNode A) {
        
        
        ArrayList<Integer>arr=new ArrayList();
        
        solve(arr, A);
        
        ArrayList<Integer>res=new ArrayList();
        
        //System.out.println(arr.get(arr.size()-1 ));
        //1 6 3 4 5 2 7
        //1 2 4 3 5 6 7
        for(int i=1;i<arr.size();i++){
         
             if(arr.get (i)<arr.get(i-1) ){
                 if(res.size()==0){
                 res.add(arr.get(i-1));
             } 
             
              else{
                 res.add(arr.get(i));
             }
             

             }
            
         }
         
         
         if(res.size()==1){
            //1 2 4 3 5 6 7
            
            for(int i=1;i<arr.size()-1;i++){
         
                  if(arr.get (i)<arr.get(i-1)  &&  arr.get (i)<arr.get(i+1) ){
            
                 res.add(arr.get(i));
                 }
             
              }
         
         }
         
         if(res.size()==1){
             
             res.add(arr.get(arr.size()-1 ));
         }
       
        Collections.sort(res);
        return res;
    }
    
    private void solve(ArrayList<Integer>arr,TreeNode A){
        
        if(A==null){
            return;
        }
         
        solve(arr, A.left);
       arr.add(A.val);
        solve(arr,A.right);
    }
}
