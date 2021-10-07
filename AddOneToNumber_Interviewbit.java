public class Solution {
    public int[] plusOne(int[] A) {

        StringBuilder sb=new StringBuilder();
int maxZeroIndex=0;

for(int i=0;i<A.length;i++){
    if(A[i]!=0){
        break;

    }
    maxZeroIndex++;
}
int carry=1;
for(int i=A.length-1;i>=maxZeroIndex;i--){
int sum=A[i]+carry;
carry=sum/10;
int temp=sum%10;
sb.append(temp);
}

if(carry!=0){

    sb.append(carry);
}
String s=sb.reverse().toString();

int[]arr=new int[s.length()];

for(int i=0;i<arr.length;i++){
    arr[i]=s.charAt(i)-'0';
}
return arr;

    }
}
