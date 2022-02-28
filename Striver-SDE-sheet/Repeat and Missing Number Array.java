//https://www.interviewbit.com/problems/repeat-and-missing-number-array/


public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {


      int xor=0;


        for(int i =0 ; i<A.length ;i++){
            xor ^= A[i] ;
        }
        for(int i =1 ;i<=A.length ;i++){
            xor ^= i ;
        }

      //  find the last Possible 1
   int rmsb = xor & -xor ;

        int f = 0 ;
        int s = 0 ;

        for(int i =0 ;i<A.length ;i++ ){
            if((A[i]&rmsb)==0)
               {
                    f ^= A[i] ;
               }
            else{
                 s ^= A[i] ;
            }
               
        }

        for(int i = 1 ;i<=A.length ;i++ ){
            if((i&rmsb)==0)
                {
                    f ^= i ;
                }
            else
                {
                    s ^= i ;
                }
        }
  


         int[]arr=new int[2];


         for(int i=0;i<A.length;i++){

             if(A[i]==f || A[i]==s){
                 
                 arr[0]=A[i];
                 break;
             }
         }
        if(arr[0]==f){
            arr[1]=s;
        }
        else if(arr[0]==s){
         arr[1]=f;
        }
         return arr;

    }
}
