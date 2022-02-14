Problem Description

Given a string A denoting a stream of lowercase alphabets.

You have to make new string B. B is formed such that we have to find first non-repeating character each time a character is inserted to the stream and append it at the end to B. if no non-repeating character is found then append '#' at the end of B.



Problem Constraints
1 <= |A| <= 100000



Input Format
The only argument given is string A.



Output Format
Return a string B after processing the stream of lowercase alphabets A.



Example Input
Input 1:

 A = "abadbc"
Input 2:

 A = "abcabc"


Example Output
Output 1:

"aabbdd"
Output 2:

"aaabc#"


Example Explanation
Explanation 1:

"a"      -   first non repeating character 'a'
"ab"     -   first non repeating character 'a'
"aba"    -   first non repeating character 'b'
"abad"   -   first non repeating character 'b'
"abadb"  -   first non repeating character 'd'
"abadbc" -   first non repeating character 'd'
Explanation 2:

"a"      -   first non repeating character 'a'
"ab"     -   first non repeating character 'a'
"abc"    -   first non repeating character 'a'
"abca"   -   first non repeating character 'b'
"abcab"  -   first non repeating character 'c'
"abcabc" -   no non repeating character so '#'
  
  
  
  
  
  
  
  
  //brut force
  
  
  public class Solution {
    public String solve(String A) {
        
     int []arr=new int[26];
     
     StringBuilder sb=new StringBuilder();
     
     for(int i=0;i<A.length();i++){
         arr[A.charAt(i)-'a']++;
         
         for(int j=0;j<=i;j++){
             if(arr[A.charAt(j)-'a']==1){
                 sb.append(A.charAt(j));
                 break;
             }
         }
         
         
         
         if(sb.length()==i){
             sb.append("#");
         }
         
     }
     
     return sb.toString();
     
     
    }
}






public class Solution {
    public String solve(String A) {
        
     HashMap<Character,Integer>map=new HashMap();
     
     Queue<Character>nonrepetatingCharacter=new ArrayDeque();
     
     StringBuilder sb=new StringBuilder();
     
     
     for(int i=0;i<A.length();i++){
         
         char curr=A.charAt(i);
         
         if(map.containsKey(curr) ){
             
            int freq= map.get(curr);
            map.put(curr,freq+1);
         }
         else{
             map.put(curr,1);
             nonrepetatingCharacter.add(curr);

         }
         
         //checking main logic start
         
       while(nonrepetatingCharacter.size()>=1 && map.get(nonrepetatingCharacter.peek()) >1){
           nonrepetatingCharacter.remove();
       }   
       
        //checking main logic end
        
        
             if(nonrepetatingCharacter.size()>=1){
                  sb.append(nonrepetatingCharacter.peek());
             }
             else{
                 sb.append("#");
             }
         
     }
     
    
     
     return sb.toString();
     
     
    }
}


