public class Solution {
    public int solve(int[] A, int B) {
        
           int index=0;
           
           int start=0;
           int end=A.length-B;
           
           
           
           int firstSum=0;
           for (int i=0;i<B;i++){
               firstSum+=A[i];
           }
           int min=firstSum;
           while(start<end){
    
               firstSum=firstSum+A[start+B]-A[start];
               if(firstSum<min){
                   min=firstSum;
                   index=start+1;
               }
             start++;  
           }
       return index; 
        
    }
}
