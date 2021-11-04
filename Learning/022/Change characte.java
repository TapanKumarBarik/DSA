Problem Description

Given a string A of size N consisting of lowercase alphabets.

You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.

Find the minimum number of distinct characters in the resulting string.



Problem Constraints

1 <= N <= 100000

0 <= B < N



Input Format

First argument is a string A.

Second argument is an integer B.



Output Format

Return an integer denoting the minimum number of distinct characters in the string.



Example Input

A = "abcabbccd"
B = 3



Example Output

2



Example Explanation

We can change both 'a' and one 'd' into 'b'.So the new string becomes "bbcbbbccb".
So the minimum number of distinct character will be 2.
  
  
  
  
  
  
  
  public class Solution {
    public int solve(String A, int B) {
        
        int[]arr=new int[26];
        
        for(int i=0;i<A.length();i++){
            
            //with char i have to decide index;
            char temp=A.charAt(i);
            int index=(int)temp-97;
            arr[index]=arr[index]+1;
            
            
        }
        
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                count++;
            }
        }
        
        
     for(int i=0;i<arr.length;i++){
         if(arr[i]!=0 && B>=arr[i]){
          count--;
          B=B-arr[i];
         }
     }
        return count;
    }
}
