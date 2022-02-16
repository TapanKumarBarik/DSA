Problem Description

Given a Binary Search Tree rooted at A.

Given an integer array B of size N. Find the floor and ceil of every element of the array B.

Floor(X) is the highest element in the tree <= X, while the ceil(X) is the lowest element in the tree >= X.

NOTE: If floor or ceil of any element of B doesn't exists, output -1 for the value which doesn't exists.



Problem Constraints
0 <= Number of nodes in the tree <= 1000000
0 <= node values <= 109
0 <= N <= 100000
0 <= B[i] <= 109



Input Format
First argument represents the root of binary tree A.
Second argument is an integer array B.



Output Format
Return an integer array C of size N*2. C[i][0] denotes the floor value of B[i] and C[i][1] represents the ceil value of B[i] in the given tree.



Example Input
Input 1:

Given Tree A:
           10
         /    \
        4      15
       / \
      1   8
B = [4, 19]
Input 2:

Given Tree A:
            8
          /   \
         5     19
        / \     \
       4   7     100
B = [1, 11]       


Example Output
Output 1:

[
    [4, 4]
    [15, -1]
]
Output 2:

[
    [-1, 4]
    [8, 19]
]


Example Explanation
Explanation 1:

Take all elements of given tree in sorted form: [1, 4, 8, 10, 15].
4 is present in the tree. So, for B[0] = 4, output is [4, 4] as both floor and ceil value is 4.

For B[1] = 19,
Highest element <= 19 is 15. So the floor value of 19 is 15. 
19 is greater than all elements in the tree. So, the ceil value of 19 doesn't exists.
So, output is [15, -1].
Explanation 2:

All elements of tree in sorted form: [4, 5, 7, 8, 19, 100].

For B[0] = 1, 
There is no element in the tree <= 1. So, the floor value doesn't exists.
Lowest element >= 1 is 4. So, the ceil value is 4.
So, output is [-1, 4]

Similarily for B[1] = 11, output is [8, 19].
  
  
  
  
  
  
  
  
  
  
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
    public ArrayList<ArrayList<Integer>> solve(TreeNode A, ArrayList<Integer> B) {
        
        ArrayList<ArrayList<Integer>>arr=new ArrayList<ArrayList<Integer>>();
        
        
        ArrayList<Integer>res=new ArrayList<Integer>();
        
        makeSortedArray(A, res);
        
        
        // for(int i=0;i<res.size();i++){
        //     System.out.println(res.get (i) );
        // }
        
        for(int i=0;i<B.size();i++ ){
            int num1=B.get(i);
            
            ArrayList<Integer>arr_temp=new ArrayList<Integer>();
            
            arr_temp.add(smallerThan(res,num1));
            
            arr_temp.add(greaterThan(res,num1) );
            
            
            arr.add(arr_temp);
        }
       
        
        return arr;
        
        
    }
    
    private int smallerThan(ArrayList<Integer>res, int num){
        
        
        int resNum=-1;
        int left=0;
        int right=res.size()-1;
        
        while(left<=right){
        int mid=(left+right)/2;
        
        if(res.get(mid)==num ){
            return num;
        }
        
        if(res.get(mid)<num ){
            resNum=res.get(mid);
            left=mid+1;
        }
        
        if(res.get(mid)>num){
            right=mid-1;
        }
        }
        
        return resNum;
    }
    
    
     private int greaterThan(ArrayList<Integer>res, int num){
        
        
        int resNum=-1;
        int left=0;
        int right=res.size()-1;
        
        while(left<=right){
        int mid=(left+right)/2;
        
        if(res.get(mid)==num ){
            return num;
        }
        
        if(res.get(mid)<num ){
             left=mid+1;
        }
        
        if(res.get(mid)>num){
            right=mid-1;
             resNum=res.get(mid);
        }
        }
        
        return resNum;
    }
    
    private void makeSortedArray(TreeNode A, ArrayList<Integer>res){
        
        
        if(A==null)return;
        
        makeSortedArray(A.left,res);
        res.add(A.val);
        makeSortedArray(A.right,res);
    }
    
    
}
