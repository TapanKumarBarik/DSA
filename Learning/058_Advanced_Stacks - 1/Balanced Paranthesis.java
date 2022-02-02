Problem Description

Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.

Refer to the examples for more clarity.



Problem Constraints
1 <= |A| <= 100



Input Format
The first and the only argument of input contains the string A having the paranthesis sequence.



Output Format
Return 0, if the paranthesis sequence is not balanced.

Return 1, if the paranthesis sequence is balanced.



Example Input
Input 1:

 A = {([])}
Input 2:

 A = (){
Input 3:

 A = ()[] 


Example Output
Output 1:

 1 
Output 2:

 0 
Output 3:

 1 


Example Explanation
You can clearly see that the first and third case contain valid paranthesis.

In the second case, there is no closing bracket for {, thus the paranthesis sequence is invalid.
  
  
  
  
  
  
  
  public class Solution {
    public int solve(String A) {
        
        HashMap<Character,Character>map=new HashMap();
        
    map.put(')', '(');
    map.put('}', '{');
    map.put(']', '[');
        
        Stack<Character>st=new Stack();
        
        int n=A.length();
        int start=0;
        
        while(start<n){
            
            char curr=A.charAt(start);
            
            if (curr== '(' || curr == '[' || curr == '{') {
                st.push(curr);
                
                
            }
            else if(st.isEmpty() || st.peek() != map.get(curr)){
                return 0;
            }
            else{
                st.pop();
            }
            
            
            
            start++;
        }
        
        if(st.isEmpty())return 1;
        return 0;
        
        
    }
}
