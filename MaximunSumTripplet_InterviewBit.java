public class Solution {
    public int solve(int[] A) {


        int n=A.length;

        int []arr=new int[n+1];//suffix array from right 

        arr[n]=0;


        for(int i=n-1;i>=0;i--){


            arr[i]=Math.max(arr[i+1],A[i]);
        }


        int ans =0;
        TreeSet<Integer> t=new TreeSet<Integer>();

t.add(Integer.MIN_VALUE);
        for(int i=0;i<n-1;i++){ //last element will come from suffix array
if(arr[i+1]>A[i]){

ans=Math.max(ans,t.lower(A[i])+A[i]+arr[i+1]);
t.add(A[i]);

}

        }



        return ans;
    }
}
