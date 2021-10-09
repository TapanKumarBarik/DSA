public class Solution {
    public int solve(int A, int B, int C) {
        
//         String s= "";
        
//   int []arr=new int[3];
//   arr[0]=A;
//   arr[1]=B;
//   arr[2]=C;
//   Arrays.sort(arr);
//   s+=arr[0];
//   s+=arr[1];
//   s+=arr[2];
 
        
//         return Integer.parseInt(s);
  if(A <= B  &&  B <= C)
        return A*10000 + B*100 + C;
    else if(A <= C && C <= B)
        return A*10000 + C*100 + B;
    else if(B <= A  &&  A <= C)
        return B*10000 + A*100 + C;
    else if(B <= C  &&  C <= A)
        return B*10000 + C*100 + A;
    else if(C <= A  &&  A <= B)
        return C*10000 + A*100 + B;
    else
        return C*10000 + B*100 + A;
    }
}
