
public class Solution {
    public int[] solve(int[] A) {
        
        int []res=new int[A.length-2];
        
        int max2=Integer.MIN_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            
            max=Math.max(max,A[i]);
             
          
        }
        for(int m=0;m<A.length;m++){
            if(A[m]!=max){
            max2=Math.max(max2,A[m]);
             
            }
        }
        int count=0;
       
        for(int j=0;j<A.length;j++){
            if(A[j]!=max && A[j]!=max2){
                   res[count] =A[j];
                   count++;
            }
      
        }
       
        return res;
    }
}
