public class Solution {
    public int solve(int A) {
if(A<=1){
    return A;
}

int count =0;
int x=0;
while(Math.pow(2,x)<=A){
    x++;
}
x--;

count+=(x * (int)Math.pow(2, (x - 1))) + (A - (int)Math.pow(2, x) + 1)
    + solve(A - (int)Math.pow(2, x));

int ans= count%1000000007;
return ans;



    }
}
