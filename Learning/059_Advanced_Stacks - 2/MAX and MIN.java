Problem Description

Given an array of integers A .

value of a array = max(array) - min(array).

Calculate and return the sum of values of all possible subarrays of A % 109+7.



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 1000000



Input Format
The first and only argument given is the integer array A.



Output Format
Return the sum of values of all possible subarrays of A % 10^9+7.



Example Input
Input 1:

 A = [1]
Input 2:

 A = [4, 7, 3, 8]


Example Output
Output 1:

 0
Output 2:

 26


Example Explanation
Explanation 1:

Only 1 subarray exists. Its value is 0.
Explanation 2:

value ( [4] ) = 4 - 4 = 0
value ( [7] ) = 7 - 7 = 0
value ( [3] ) = 3 - 3 = 0
value ( [8] ) = 8 - 8 = 0
value ( [4, 7] ) = 7 - 4 = 3
value ( [7, 3] ) = 7 - 3 = 4
value ( [3, 8] ) = 8 - 3 = 5
value ( [4, 7, 3] ) = 7 - 3 = 4
value ( [7, 3, 8] ) = 8 - 3 = 5
value ( [4, 7, 3, 8] ) = 8 - 3 = 5
sum of values % 10^9+7 = 26
  
  
  
  
  
  
  
  
  
  public class Solution {
    public int solve(int[] A) {
        
        
        int n=A.length;
        int[]prevSmaller=new int[n];
        
        prevSmallerSolve(A, prevSmaller);
        
        // for(int i:prevSmaller){
        //     System.out.println(i);
        // }
        
        int[]nextSmaller=new int[n];
        nextSmallerSolve(A, nextSmaller);
        
        // for(int i:nextSmaller){
        //     System.out.println(i);
        // }
        
        
        int []prevGreater=new int[n];
        prevGreaterSolve(A, prevGreater);
        
        // for(int i:prevGreater){
        //     System.out.println(i);
        // }
        
        int []nextGreater=new int[n];
        nextGreaterSolve(A, nextGreater);
        
        // for(int i:nextGreater){
        //     System.out.println(i);
        // }
        
        int res=0;
        int mod=1000000007;
        
        for(int i=0;i<n;i++){
            
            long count=(long)(i-prevGreater[i] )*(nextGreater[i]-i);
            
            res+=((count*A[i])%mod);
            res%=mod;
            
            count=(long)(i-prevSmaller[i])*(nextSmaller[i]-i);
            
            res-=((count*A[i])%mod);
            res%=mod;
            
        }
        
    res=(res+mod)%mod;
        
        return res;
    }
    
    
    private void nextGreaterSolve(int[]A, int[]arr){
        
        
     Stack<Integer>st=new Stack();
        
      for(int i=A.length-1;i>=0;i--){
            
            int curr=A[i];
            
            while(!st.isEmpty() && A[ st.peek()] <curr ){
                
                st.pop();
            }
            
            if(st.isEmpty()){
                arr[i]=A.length;
            }
            
            else{
                arr[i]=st.peek();
            }
            
            st.push(i);
        }
    }
    
    private void prevGreaterSolve(int[]A, int[]arr){
        
        
        Stack<Integer>st=new Stack();
        
        for(int i=0;i<A.length;i++){
            
            int curr=A[i];
            
            while(!st.isEmpty() &&A[ st.peek()] <=curr ){
                st.pop();
            }
            
            if(st.isEmpty()){
                arr[i]=-1;
            }
            
            else{
                arr[i]=st.peek();
            }
            
            st.push(i);
        }
    }
    private void nextSmallerSolve(int[]A,int[]arr){
        
        Stack<Integer>st=new Stack();
        
        for(int i=A.length-1;i>=0;i--){
            
            int curr=A[i];
            
            while(!st.isEmpty() && A[ st.peek()]>=curr ){
                st.pop();
            }
            
            if(st.isEmpty()){
                arr[i]=A.length;
            }
            else{
                arr[i]=st.peek();
            }
            
            st.push(i);
        }
    }
    private void prevSmallerSolve(int[]A, int[]prevSmaller){
        
        
        Stack<Integer>st=new Stack();
        
        for(int i=0;i<A.length;i++){
            
            int curr=A[i];
            
            while(!st.isEmpty() && A[ st.peek()]>curr ){
                st.pop();
            }
            
            if(st.isEmpty() ){
                prevSmaller[i]=-1;
            }
            else{
                prevSmaller[i]=st.peek();
            }
            st.push(i);
        }
    }
}
