Problem Description

Given a column title as appears in an Excel sheet, return its corresponding column number.



Problem Constraints
1 <= length of the column title <= 5



Input Format
Input a string which represents the column title in excel sheet.



Output Format
Return a single integer which represents the corresponding column number.



Example Input
Input 1:

 AB
Input 2:

 ABCD


Example Output
Output 1:

 28
Output 2:

 19010


Example Explanation
Explanation 1:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
   
   
   
   
   
   
   
   
   public class Solution {
    public int titleToNumber(String A) {
        
        int n=A.length();
        
        int res=0;
        int count=0;
        
        for(int i=n-1;i>=0;i--){
    
            
            int temp=A.charAt(i)-'A'+1;
            res+=temp*(int)Math.pow(26,count);
            count++;
        }
        return res;
    }
}
