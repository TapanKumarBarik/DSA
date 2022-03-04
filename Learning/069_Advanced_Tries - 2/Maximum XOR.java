Problem Description

Given an array of integers A, find and return the maximum result of A[i] XOR A[j], where i, j are the indexes of the array.



Problem Constraints
1 <= length of the array <= 100000
0 <= A[i] <= 109



Input Format
The only argument given is the integer array A.



Output Format
Return an integer denoting the maximum result of A[i] XOR A[j].



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [5, 17, 100, 11]


Example Output
Output 1:

 7
Output 2:

 117


Example Explanation
Explanation 1:

 Maximum XOR occurs between element of indicies(0-based) 1 and 4 i.e. 2 ^ 5 = 7.
Explanation 2:

 Maximum XOR occurs between element of indicies(0-based) 1 and 2 i.e. 17 ^ 100 = 117.

   
   
   
   
   
  
  
  
  
  //optimal Trie
  
  public class Solution {
    
    class TrieNode{
        
        TrieNode left;
        TrieNode right;
        
        public TrieNode(){
            left=null;
            right=null;
        }
    }
    public int solve(ArrayList<Integer> A) {
        
      TrieNode root=new TrieNode();
      int maxXor=Integer.MIN_VALUE;
      
      for(int nums:A){
          insert(root, nums);
      }
      
      for(int nums:A){
          maxXor=Math.max(maxXor, getMax(root, nums));
      }
      return maxXor;
    }
    
    //insert
    
    private void insert(TrieNode root1, int num){
        
        TrieNode root=root1;
        
        for(int i=31 ;i>=0;i--){
            
            int bit=(num>>i)&1;
            
            if(bit==0){
                
                if(root.left==null){
                    TrieNode temp=new TrieNode();
                    root.left=temp;
                }
                root=root.left;
            }
            else{
             if(root.right==null){
                    TrieNode temp=new TrieNode();
                    root.right=temp;
                }
                root=root.right;
            }
        }
    }
    
    
    
    
    
    //search
    
    private int getMax(TrieNode root1, int num){
         TrieNode root = root1;
        int maxXor = 0;
  
        for(int i = 31; i >= 0; i--) {
            int bit = (num>>i) & 1;
            if(bit == 0) {
                if(root.right != null) {
                    root =  root.right;
                    maxXor += (1<<i);
                } else {
                    root = root.left;
                }
            } else {
                if(root.left != null) {
                    root = root.left;
                    maxXor += (1<<i);   
                } else {
                    root = root.right;
                }
            }
        }
        
        return maxXor;
    }
    
}

   
   
   
   //Brut force
   
   public class Solution {
    public int solve(ArrayList<Integer> A) {
        
        int maxXor=Integer.MIN_VALUE;
        
        for(int i=0;i<A.size()-1;i++){
            
            int currXor=A.get(i);
            
            for(int j=i+1;j<A.size();j++){
                
                int temp=currXor;
                temp=temp^A.get(j);
                
                maxXor=Math.max(maxXor, temp);
            }
        }
        
        return maxXor;
    }
}
