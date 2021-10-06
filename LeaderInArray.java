public class Solution {
    public int[] solve(int[] A) {
        List<Integer>arr=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        
        for(int i=A.length-1;i>=0;i--){
           
                
             if(A[i]>max){
                 max=A[i];
                 arr.add(A[i]);
             }
        }
         int []a=new int[arr.size()];
            for(int i=0;i<a.length;i++){
                a[i]=arr.get(i);
            }
            return a;
    }
}
