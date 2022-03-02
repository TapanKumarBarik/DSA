Problem Description

Given a list of N words. Find shortest unique prefix to represent each word in the list.

NOTE: Assume that no word is prefix of another. In other words, the representation is always possible



Problem Constraints
1 <= Sum of length of all words <= 106



Input Format
First and only argument is a string array of size N.



Output Format
Return a string array B where B[i] denotes the shortest unique prefix to represent the ith word.



Example Input
Input 1:

 A = ["zebra", "dog", "duck", "dove"]
Input 2:

A = ["apple", "ball", "cat"]


Example Output
Output 1:

 ["z", "dog", "du", "dov"]
Output 2:

 ["a", "b", "c"]


Example Explanation
Explanation 1:

 Shortest unique prefix of each word is:
 For word "zebra", we can only use "z" as "z" is not any prefix of any other word given.
 For word "dog", we have to use "dog" as "d" and "do" are prefixes of "dov".
 For word "du", we have to use "du" as "d" is prefix of "dov" and "dog".
 For word "dov", we have to use "dov" as "d" and do" are prefixes of "dog".  
 
Explanation 2:

 "a", "b" and c" are not prefixes of any other word. So, we can use of first letter of each to represent.

   
   
   
   
   
   
   
   
   
   
   
   public class Solution {
    
    class TrieNode{
        boolean isEnd=false;
        int freq=0;
        TrieNode [] children =new TrieNode[26];
        
        public TrieNode(){
            isEnd=false;
            int freq=0;
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }
    public ArrayList<String> prefix(ArrayList<String> A) {
        
        
        TrieNode root1=new TrieNode();
        
        TrieNode root=root1;
        
        
        for(int i=0;i<A.size();i++){
            root=root1;
            
            String curr=A.get(i);
            
            for(int j=0;j<curr.length();j++){
                
                int index=curr.charAt(j)-'a';
                
                if(root.children[index]==null){
                    
                    TrieNode temp=new TrieNode();
                    
                    root.children[index]=temp;
                    
                }
                
                root=root.children[index];
                
                root.freq=root.freq+1;
               
                
            }
            root.isEnd=true;
        }
        
        
        ArrayList<String> arr=new ArrayList();
       
        
       
        for(int i=0;i<A.size();i++){
            root=root1;
            
            String curr=A.get(i);
            
            String res="";
            for(int j=0;j<curr.length();j++){
                
                int index=curr.charAt(j)-'a';
                   res+=curr.charAt(j);
                   // System.out.println(root.freq);
                if(root.children[index].freq>1){
                    
                     root=root.children[index];
                }
                
                
                else{
                    arr.add(res);
                    break;
                }
                
            }
            
        }
        
        
        
        
        return arr;
        
    }
}
