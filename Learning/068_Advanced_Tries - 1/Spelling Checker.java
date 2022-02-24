Problem Description
Given an array of words A (dictionary) and another array B (which contain some words).

You have to return the binary array (of length |B|) as the answer where 1 denotes that the word is present in the dictionary and 0 denotes it is not present.

Formally, for each word in B, you need to return 1 if it is present in Dictionary and 0 if it is not.

Such problems can be seen in real life when we work on any online editor (like Google Documnet), if the word is not valid it is underlined by a red line.

NOTE: Try to do this in O(n) time complexity.



Problem Constraints
1 <= |A| <= 1000

1 <= sum of all strings in A <= 50000

1 <= |B| <= 1000



Input Format
First argument is array of strings A.

First argument is array of strings B.



Output Format
Return the binary array of integers according to the given format.



Example Input
Input 1:

A = [ "hat", "cat", "rat" ]
B = [ "cat", "ball" ]
Input 2:

A = [ "tape", "bcci" ]
B = [ "table", "cci" ]


Example Output
Output 1:

[1, 0]
Output 2:

[0, 0]


Example Explanation
Explanation 1:

Only "cat" is present in the dictionary.
Explanation 2:

None of the words are present in the dictionary.

  
  
  
  
  
  
  
  
  
  
//hashSet implementation

public class Solution {
 
    
    public ArrayList<Integer> solve(ArrayList<String> A, ArrayList<String> B) {
        
        HashSet<String>set=new HashSet();
        ArrayList<Integer>arr=new ArrayList();
        
        
        for(int i=0;i<A.size();i++ ){
            set.add(A.get(i) );
        }
        
        
        for(int i=0;i<B.size();i++){
            
            if(set.contains(B.get(i) ) ){
                arr.add(1);
            }
            else{
                arr.add(0);
            }
        }
        
        return arr;
        
    }
}











//Trie





public class Solution {
 
    //   final int alphabetSize=26;
      TrieNode root;
      
     class TrieNode{
         
         TrieNode[]children=new TrieNode[26];
         boolean isEndOfWord;
         
         public TrieNode(){
             isEndOfWord=false;
             
             for(int i=0;i<26;i++){
                 children[i]=null;
                 
             }
         }
     }
    
    public ArrayList<Integer> solve(ArrayList<String> A, ArrayList<String> B) {
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
       
       root =new TrieNode();
       putAllAToTrie(A);
       
       
       
       
        for(int i=0;i<B.size();i++){
            String curr=B.get(i);
            
          //  System.out.println(curr);
            if( found(curr) ){
                arr.add(1);
            }
            else{
                arr.add(0);
            }
        }
        return arr;
    }
    

    private boolean found(String b){
        
        TrieNode curr_node=root;
        for(int i=0;i<b.length();i++){
            
            int index=b.charAt(i)-'a';
            
            if(curr_node.children[index]==null){
                return false;
            }
            
                curr_node=curr_node.children[index];
        }
        
        return (curr_node !=null && curr_node.isEndOfWord);
        //return true;
        
    }
    
    private void putAllAToTrie(ArrayList<String>a){
        for(int i=0;i<a.size();i++){
            
            String curr=a.get(i);
            
            TrieNode curr_node=root;
            int index=0;
            for(int j=0;j<curr.length();j++){
                
                index=curr.charAt(j)-'a';
                
                if(curr_node.children[index]==null){
                    curr_node.children[index]=new TrieNode();
                }
              
                    curr_node=curr_node.children[index];
               
            }
            curr_node.isEndOfWord=true;
        }
    }
}
