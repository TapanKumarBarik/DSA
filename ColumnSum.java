public class Solution {
    public int[] solve(int[][] A) {
    int n = A.length, m = A[0].length;
	int[] ans = new int[m];
    for(int j = 0; j < m; j++){
    	int temp = 0;
    	for(int i = 0; i < n; i++){
    		temp += A[i][j];
    	}
    	ans[j] = temp;
    }
    return ans;
    }
}
