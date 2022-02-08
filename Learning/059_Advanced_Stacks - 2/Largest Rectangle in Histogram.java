Problem Description

Given an array of integers A .

A represents a histogram i.e A[i] denotes height of the ith histogram's bar. Width of each bar is 1.

Find the area of the largest rectangle formed by the histogram.



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 1000000000



Input Format
The only argument given is the integer array A.



Output Format
Return the area of largest rectangle in the histogram.



Example Input
Input 1:

 A = [2, 1, 5, 6, 2, 3]
Input 2:

 A = [2]


Example Output
Output 1:

 10
Output 2:

 2


Example Explanation
Explanation 1:

The largest rectangle has area = 10 unit. Formed by A[3] to A[4].
Explanation 2:

Largest rectangle has area 2.
  
  
  
  
  
  
  
  
  
  public class Solution {
    public int largestRectangleArea(int[] A) {
        
        Stack<Integer>st1=new Stack();
        
        int n=A.length;
        int []arr1=new int[n];
        int []arr2=new int[n];
        
        for(int i=0;i<n;i++){
            
            int num=A[i];
            
            while(!st1.isEmpty()  &&  A[st1.peek()]>=num){
                st1.pop();
            }
            
            if(!st1.isEmpty() ){
                arr1[i]=st1.peek();
            }
            else{
                arr1[i]=-1;
                
            }
            st1.push(i);
        }
        //printt
        //  for(int i=0;i<n;i++){
        //   System.out.print(arr1[i]);
        //      System.out.print(", ");
             

        // }
           
        //      System.out.println(" ");
        
        while(!st1.isEmpty()){
            st1.pop();
        }
        
          for(int i=n-1;i>=0;i--){
            
            int num=A[i];
            
            while(!st1.isEmpty()  &&  A[st1.peek()]>=num){
                st1.pop();
            }
            
            if(!st1.isEmpty() ){
                arr2[i]=st1.peek();
            }
            else{
                arr2[i]=n;
                
            }
            st1.push(i);
        }
        
        // for(int i=0;i<n;i++){
        //       System.out.print(arr2[i]);
        //      System.out.print(", ");

        // }
        // System.out.println(" ");
        int res=0;
         for(int i=0;i<n;i++){
            
            res=Math.max((arr2[i]-arr1[i]-1)*A[i],res);
            
          
        }
        
        return res;
        
        
    }
}
