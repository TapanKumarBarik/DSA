
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A) {
        
        int b=A.length-1;
        int a=0;
        
        while(a<b){
           int temp=A[a];
           A[a]=A[b];
           A[b]=temp;
            a++;
            b--;
            
        }
        return A;
        
    }
}
