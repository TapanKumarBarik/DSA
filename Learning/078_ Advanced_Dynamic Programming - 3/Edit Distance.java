Problem Description

Given two strings A and B, find the minimum number of steps required to convert A to B. (each operation is counted as 1 step.)

You have the following 3 operations permitted on a word:

Insert a character
Delete a character
Replace a character


Problem Constraints
1 <= length(A), length(B) <= 450



Input Format
The first argument of input contains a string, A.
The second argument of input contains a string, B.



Output Format
Return an integer, representing the minimum number of steps required.



Example Input
Input 1:

 A = "abad"
 B = "abac"
Input 2:

 A = "Anshuman"
 B = "Antihuman


Example Output
Output 1:

 1
Output 2:

 2


Example Explanation
Exlanation 1:

 A = "abad" and B = "abac"
 After applying operation: Replace d with c. We get A = B.
 
Explanation 2:

 A = "Anshuman" and B = "Antihuman"
 After applying operations: Replace s with t and insert i before h. We get A = B.
   
   
   
   
   public class Solution {
    public int minDistance(String A, String B) {
        
        int[][]dp=new int[A.length()+1 ][B.length()+1];
        
        
        for(int i=0;i<=A.length() ;i++){
            
            dp[i][0]=i;
        }
        
        for(int i=0;i<=B.length() ;i++){
            
            dp[0][i]=i;
        }
        
        
        for(int i=0;i<A.length ();i++){
            
            
            for(int j=0;j<B.length();j++ ){
                
                
                if(A.charAt(i)==B.charAt(j) ){
                    
          //skip
                    dp[i+1][j+1]=dp[i][j];
                   
                }
                 else{
                     
                     //insert, delete
                        dp[i+1][j+1]=Math.min(dp[i][j+1], dp[i+1][j]);
                        
                        
                        //replace
                        dp[i+1][j+1]=Math.min(dp[i+1][j+1], dp[i][j])+1;
                    }
            }
        }
     
     
     for(int[]i:dp){
         System.out.println(Arrays.toString(i) );
     }
        
        
        return dp[A.length() ][B.length() ];
    }
}
