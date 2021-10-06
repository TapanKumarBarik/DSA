public class Solution {
    public int solve(int[] A) {


    
    
    int n=A.length;
    int res=0;
    for(int i=0;i<n;i++){
        
        if(isPrime(A[i])){
            res++;
        }
    }
    return res;
    }
    public static boolean isPrime(int n){
              if (n <= 1){
            return false;
              }
        
        for (int i = 2; i*i< n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
