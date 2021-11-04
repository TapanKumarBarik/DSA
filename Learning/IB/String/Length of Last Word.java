Problem Description

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Given s = "Hello World",


return 5 as length("World") = 5.

Please make sure you try to solve this problem without using library functions. Make sure you only traverse the string once.
  
  
 
  
  
  
  
  
  public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {

        int count=0;

        
boolean charFound=false;
for(int i=A.length()-1;i>=0;i--){
    
    if(A.charAt(i)==' ' && charFound==false){
        
    }
    else if(A.charAt(i)==' ' && charFound==true){
        break;
    }
    else{
        charFound=true;
        count++;
    }
}
        return count;
    }
}
