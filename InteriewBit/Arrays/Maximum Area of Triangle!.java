//copied solution

Problem Description

Given a character matrix of size N x M in the form of a string array A of size N where A[i] denotes ith row.

Each character in the matrix consists any one of the following three characters {'r', 'g', 'b'} where 'r' denotes red color similarly 'g' denotes green color and 'b' denotes blue color.

You have to find the area of the largest triangle that has one side parallel to y-axis i.e vertical and the color of all three vertices are different.

NOTE:

If the area comes out to be a real number than return the ceil of that number.


Problem Constraints
2 <= N, M <= 103

A[i][j] = 'r' or A[i][j] = 'g' or A[i][j] = 'b'



Input Format
First and only argument is an string array A of size N denoting the 2D character matrix.



Output Format
Return a single integer denoting the area of the largest triangle that has one side parallel to y-axis i.e vertical and the color of all three vertices are different.

If the area comes out to be a real number than return the ceil of that number.



Example Input
Input 1:

 A = ["rrrrr", "rrrrg", "rrrrr", "bbbbb"]
Input 2:

 A = ["rrr", "rrr", "rrr", "rrr"]


Example Output
Output 1:

 10
Output 2:

 0


Example Explanation
Explanation 1:

 The maximum area of triangle is 10.
 Triangle coordinates are (0,0) containing r, (1,4) containing g, (3,0) containing b.
 
Explanation 2:

 All cells have same color so no triangle possible so we will return 0



   
   
   
   
   
   public class Solution {
    public int solve(String[] A) {
        int n = A.length;
        int m = A[0].length();
        
        int[][] dp = new int[m][3];
        int[][] top = new int[m][3];
 
        for(int i=0;i<m;i++){
            top[i][0] = top[i][1] = top[i][2] = 0;
        }
 
        for(int i=0;i<m;i++){
            int h1=0,gup,gdown,rup,rdown,bup,bdown;
            gup = gdown = bup = bdown = rup = rdown = -1;
 
            while(h1<n)
            {
                if(A[h1].charAt(i)=='r')
                {
                    rup=h1;
                    break;
                }
                h1++;
            }
            h1=0;
            while(h1<n)
            {
                if(A[h1].charAt(i)=='g')
                {
                    gup=h1;
                    break;
                }
                h1++;
            }
            h1=0;
            while(h1<n)
            {
                if(A[h1].charAt(i)=='b')
                {
                    bup=h1;
                    break;
                }
                h1++;
            }
 
            h1 = n-1;
            while(h1>=0)
            {
                if(A[h1].charAt(i)=='r')
                {
                    rdown = h1;
                    break;
                }
                h1--;
            }
            h1 = n-1;
            while(h1>=0)
            {
                if(A[h1].charAt(i)=='g')
                {
                    gdown = h1;
                    break;
                }
                h1--;
            }
            h1 = n-1;
            while(h1>=0)
            {
                if(A[h1].charAt(i)=='b')
                {
                    bdown = h1;
                    break;
                }
                h1--;
            }
 
 
            dp[i][0] = Math.max(Math.abs(gup-bdown) , Math.abs(gdown-bup))+1;
            if(gup==-1 || bup==-1) dp[i][0] = 0;
            dp[i][1] = Math.max(Math.abs(rup-bdown) , Math.abs(rdown-bup))+1;
            if(rup==-1 || bup==-1) dp[i][1] = 0;
            dp[i][2] = Math.max(Math.abs(rup-gdown) , Math.abs(rdown-gup))+1;
            if(rup==-1 || gup==-1) dp[i][2] = 0;
 
            if(rup==-1) top[i][0] = -1;
            if(gup==-1) top[i][1] = -1;
            if(bup==-1) top[i][2] = -1;
 
        }
 
        int rfront,rback,gback,gfront,bback,bfront;
        rfront = rback = gback = gfront = bback = bfront = -1;
        
        for(int i=m-1;i>=0;i--)  if(top[i][0]==0){rback=i;break;}
        for(int i=0;i<m;i++)     if(top[i][0]==0){rfront=i;break;}
        for(int i=m-1;i>=0;i--)  if(top[i][1]==0){gback=i;break;}
        for(int i=0;i<m;i++)     if(top[i][1]==0){gfront=i;break;}
        for(int i=m-1;i>=0;i--)  if(top[i][2]==0){bback=i;break;}
        for(int i=0;i<m;i++)     if(top[i][2]==0){bfront=i;break;}
 
        for(int i=0;i<m;i++) {
            dp[i][0]=(Math.max(Math.abs(i-rfront),Math.abs(i-rback))+1)*dp[i][0];
            dp[i][1]=(Math.max(Math.abs(i-gfront),Math.abs(i-gback))+1)*dp[i][1];
            dp[i][2]=(Math.max(Math.abs(i-bfront),Math.abs(i-bback))+1)*dp[i][2];
            
            if(rfront==-1)dp[i][0]=0;
            if(gfront==-1)dp[i][1]=0;
            if(bfront==-1)dp[i][2]=0;
        }        
 
        int ans=0;
 
        for(int i=0;i<m;i++)  ans=Math.max(ans,Math.max(dp[i][0],Math.max(dp[i][1],dp[i][2])));
 
        return ans/2+ans%2;
    }
}
