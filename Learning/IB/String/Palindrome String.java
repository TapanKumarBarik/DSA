Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Example:

"A man, a plan, a canal: Panama" is a palindrome.

"race a car" is not a palindrome.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem




public class Solution {
    public int isPalindrome(String A) {

        int start=0;
        int end=A.length()-1;
        while(start<=end){
           char c1=A.charAt(start);

            char c2=A.charAt(end);

            if(!Character.isLetterOrDigit(c1)){
                start++;
            }
             else if(!Character.isLetterOrDigit(c2)){
                end--;
            }

            else{
                if(Character.toLowerCase(c1) != Character.toLowerCase(c2)){
                    return 0;
                }
                start++;
                end--;
            }
        }
        return 1;
    }
}
