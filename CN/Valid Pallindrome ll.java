
//https://www.codingninjas.com/codestudio/problems/valid-palindrome_2663285?topList=mohammad-fraz-dsa-sheet-problems

public class Solution {
 
	public static boolean validPalindrome(int n, String s) {
		// Write your code here
        
        
        int left=0;
        int right=n-1;
        
        while(left<right){
                  if(s.charAt(left)!=s.charAt(right) ){
                return isPalinDrome(s,left+1, right) ||isPalinDrome(s,left, right-1);
            }
            
            left++;
            right--;
        }
        return true;
	}
    
    
    private static boolean isPalinDrome(String S, int left, int right){
        
        while(left<right){
            if(S.charAt(left)!=S.charAt(right) ){
                return false;
            }
            
            left++;
            right--;
        }
        return true;
        
    }

}
