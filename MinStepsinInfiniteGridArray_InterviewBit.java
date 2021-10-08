public class Solution {
    public int coverPoints(int[] A, int[] B) {

int n=A.length;

int res=0;
int I=0;int J=0;
for(int i=0;i<A.length-1;i++){

I=A[i+1]-A[i];
J=B[i+1]-B[i];
if(I<0){
    I=-1*I;
}
if(J<0){
    J=-1*J;
}
res+=Math.max(I,J);
}
return res;
    }
}
