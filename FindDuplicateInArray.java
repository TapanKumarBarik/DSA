//Appraoch 1

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] A) {

        Arrays.sort(A);
        for(int i=0;i<A.length-1;i++){
            if(A[i]==A[i+1]){
return A[i];
            }
        }
        return -1;
    }
}
