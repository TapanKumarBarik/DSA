public class Solution {
    public int solve(int A) {

        int count=0;
if(A==0) return 0 ;
        while(true){
if((A & 1)==1){
    break;
}
count++;
A=A>>1;

        }

        return count;
    }
}
