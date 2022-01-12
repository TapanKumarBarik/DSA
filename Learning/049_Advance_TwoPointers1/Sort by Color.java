Problem Description

Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: Using library sort function is not allowed.



Problem Constraints
1 <= N <= 1000000
0 <= A[i] <= 2


Input Format
First and only argument of input contains an integer array A.


Output Format
Return an integer array in asked order


Example Input
Input 1 :
    A = [0 1 2 0 1 2]
Input 2:

    A = [0]


Example Output
Output 1:
    [0 0 1 1 2 2]
Output 2:

    [0]


Example Explanation
Explanation 1:
    [0 0 1 1 2 2] is the required order.
      
      
      
      
      
      ////////////////////
      ITERATIVE APPROACH
      
      
      public class Solution {
    public int[] sortColors(int[] A) {
        
        if(A.length==1)return A;
        int zero=0,one=0,two=0;
        
        for(int i=0;i<A.length;i++){
            if(A[i]==0)zero++;
            if(A[i]==1)one++;
            else two++;
        }
       
       int i=0;
       for( i=0;i<zero;i++){
           A[i]=0;
       }
       int j=0;
         for( j=i;j<zero+one;j++){
           A[j]=1;
       }
       int k=0;
             for( k=j;k<A.length;k++){
           A[k]=2;
       }
        return A;
    }
}


///////////////////////////////


public class Solution {
    public int[] sortColors(int[] A) {
       //TWO POINTER APPROACH
       
       int l=0;
       int r=A.length-1;
       for(int i=0;i<=r;){
           
           if(A[i]==0){
               //swap with l
               //ap(A,i,l);
                int temp=A[i];
                A[i]=A[l];
                A[l]=temp;
               l++;
               i++;
           }
           
           else if(A[i]==2){
               //swap with r
              //wap(A,i,r);
                int temp=A[i];
                A[i]=A[r];
                A[r]=temp;
               
                
               r--;
           }
           
           else{
               i++;
           }
       }
       return A;

    }
}




///////////////////////////////

