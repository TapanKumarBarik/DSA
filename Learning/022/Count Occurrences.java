Problem Description

Find number of occurrences of bob in the string A consisting of lowercase english alphabets.



Problem Constraints
1 <= |A| <= 1000


Input Format
The first and only argument contains the string A consisting of lowercase english alphabets.


Output Format
Return an integer containing the answer.


Example Input
Input 1:

  "abobc"
Input 2:

  "bobob"


Example Output
Output 1:

  1
Output 2:

  2


Example Explanation
Explanation 1:

  The only occurrence is at second position.
Explanation 2:

  Bob occures at first and third position.
    
    
    
    
    
    
    public class Solution {
    public int solve(String A) {
        
        int res=0;
        for(int i=0;i<A.length()-2;i++){
            if(A.charAt(i)=='b'){
                if(A.charAt(i+1)=='o' && A.charAt(i+2)=='b'){
                    res++;
                }
            }
        }
        
        
        return res;
    }
}
