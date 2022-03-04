Problem Description

Given a phone directory in the form of string array A containing N numeric strings.

If any phone number is prefix of another phone number then phone directory is invalid else it is valid.

You need to check whether the given phone directory is valid or not if it is valid then return 1 else return 0.



Problem Constraints
2 <= N <= 105

1 <= |A[i]| <= 50

A[i] consists only of numeric digits.



Input Format
First and only argument is an string array A.



Output Format
Return 1 if the given phone directory is valid else return 0.



Example Input
Input 1:

 A = ["1234", "2342", "567"]
Input 2:

 A = ["00121", "001"]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 No number is prefix of any other number so phone directory is valid so we will return 1.
Explanation 2:

 "001" is prefix of "00121" so phone directory is invalid so we will return 0.

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   public class Solution {
    
    
    class TrieNode{
        
        boolean isEnd=false;
        int freq=0;
        TrieNode[]children=new TrieNode[10];
        
        public TrieNode(){
            
            for(int i=0;i<10;i++){
                
                children[i]=null;
                
            }
            isEnd=false;
            freq=0;
        }
        
    }
    public int solve(ArrayList<String> A) {
        
        
        
        
        TrieNode root1=new TrieNode();
        TrieNode root=root1;
        
        
        for(int i=0;i<A.size();i++){
            
            root=root1;
            String curr=A.get(i);
            
            
            
            for(int j=0;j<curr.length();j++){
                
                
                int index=curr.charAt(j);
                System.out.println(index);
                
                if(root.children[index]==null){
                    
                    TrieNode temp=new TrieNode();
                    
                root.children[index]=temp;
                }
                
                root=root.children[index];
                
                root.freq++;
                
            }
            root.isEnd=true;
           if( root.isEnd=true && root.freq>1){
               return 0;
           }
        }
        
        return 1;
    }
}
