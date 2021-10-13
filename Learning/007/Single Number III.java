public class Solution {
    public int[] solve(int[] A) {
        
        
        int num=0;
        int[]arr=new int[2];
        
        for(int i=0;i<A.length;i++){
            
            num=num^A[i];
        }
        
        int rsb=num & -num;
        int x=0;
        int y=0;
        
        for(int i=0;i<A.length;i++){
            if((A[i]&rsb)==0){
              x=x^A[i];  
            }
            else{
                y=y^A[i];
            }
            
            
        }
        if(x>y){
            arr[0]=y;
            arr[1]=x;
           return arr;  
        }
         arr[1]=y;
            arr[0]=x;
        return arr;
        
    }
}
