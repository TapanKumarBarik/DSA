//https://leetcode.com/problems/reverse-string/


class Solution {
    public void reverseString(char[] s) {
        
        int n=s.length;
        
        int i=0;
        int j=n-1;
        
        while(i<j){
            
            swap(s,i,j);
            i++;
            j--;
        }
    }
    private void swap(char[]s, int i, int j){
        
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}
