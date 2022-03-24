Problem Description

Implement wildcard pattern matching with support for ' ? ' and ' * ' for strings A and B.

' ? ' : Matches any single character.
' * ' : Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).



Problem Constraints
1 <= length(A), length(B) <= 104



Input Format
The first argument of input contains a string A.
The second argument of input contains a string B.



Output Format
Return 1 if the patterns match else return 0.



Example Input
Input 1:

 A = "aaa"
 B = "a*"
Input 2:

 A = "acz"
 B = "a?a"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 Since '*' matches any sequence of characters. Last two 'a' in string A will be match by '*'.
 So, the pattern matches we return 1.
Explanation 2:

 '?' matches any single character. First two character in string A will be match. 
 But the last character i.e 'z' != 'a'. Return 0.
   
   
   
   
   
   
   
   public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isMatch(final String s, final String p) {
        
        boolean match[][] = new boolean[s.length() + 1][p.length() + 1];
    	match[0][0] = true;
    	for (int i = 0; i < p.length(); i++) // judge whether the substring of p matchese empty sequence
    	{
    	    	if (p.charAt(i) == '*')
    		{
    		    	match[0][i + 1] = match[0][i];
    		}
    	}
    	
    // 	for(boolean []i:match){
    	    
    // 	    System.out.println(Arrays.toString(i) );
    // 	}
    	for (int i = 0; i < s.length(); i++)
    		{
    		    for (int j = 0; j < p.length(); j++) {
    			if( p.charAt(j) == '*' )
    			{
    			    	match[i + 1][j + 1] = (match[i][j + 1] || match[i + 1][j] || match[i][j]);
    			}
    			else if( s.charAt(i) == p.charAt(j) || p.charAt(j) == '?' )
    			{
    			    	match[i + 1][j + 1] = match[i][j];
    			}
    		}
    		}
    	return match[s.length()][p.length()]?1:0;
    }
}
