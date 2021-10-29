Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


Input Format

The only argument given is string A.
Output Format

Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
For Example

Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7
      
      
      
      
      
      public class Solution {
    public int solve(String A) {
        int n =A.length();
        int []l=new int[n];
        int []r=new int[n];
        int noOfOne=0;
        //l
        l[0]=A.charAt(0)-'0';
        if(l[0]==1){
            noOfOne++;
        }
        for(int i=1;i<n;i++){
            int temp=A.charAt(i)-'0';
           if(temp==0){
                 l[i]=temp;
           }
           else{
               l[i]=temp+l[i-1];
               noOfOne++;
           }
        }
          if(n==noOfOne){
                  return noOfOne;
              }
        //r
        r[n-1]=A.charAt(n-1)-'0';
        for(int i=n-2;i>=0;i--){
           int temp=A.charAt(i)-'0';
           if(temp==0){
                 r[i]=temp;
           }
           else{
               r[i]=temp+r[i+1];
           } 
        }
        //
        int ans=0;
        for(int i=0;i<n;i++){
           int temp=A.charAt(i)-'0'; 
           if(temp==0){
               int leftSum=0;
               int rightSum=0;
               
               if(i>0){
                   leftSum=l[i-1];
               }
               if(i<n-1){
                   rightSum=r[i+1];
               }
               
              int maxl=leftSum+rightSum;
            
              if(maxl<noOfOne){
                 ans=Math.max(ans,maxl+1 );
              }
              else{
               ans=Math.max(ans,maxl );    
              }
              
             
               
           }
        }
        return ans;
    }
}
