Problem Description

Given a array A of non negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.



Problem Constraints
1 <= len(A) <= 100000
0 <= A[i] <= 2*109



Input Format
First argument is an array of integers.



Output Format
Return a string representing the largest number.



Example Input
Input 1:

 A = [3, 30, 34, 5, 9]
Input 2:

 A = [2, 3, 9, 0]


Example Output
Output 1:

 "9534330"
Output 2:

 "9320"


Example Explanation
Explanation 1:

 A = [3, 30, 34, 5, 9]
 Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
Explanation 2:

 Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320. 

   
   
   
   public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
        
        
        // String s="";
        // int startIndex=0;
        // int n=A.length;
      
        // while(startIndex<n-1){
            
        //     for(int i=startIndex+1;i<n;i++){
        //         //t1
        //         String t1="";
        //         t1+=A[startIndex];
        //         t1+=A[i];
        //         long temp1=Long.parseLong(t1); 
                
        //         //t2
        //          String t2="";
        //         t2+=A[i];
        //         t2+=A[startIndex];
        //         long temp2=Long.parseLong(t2);  
                
        //         if(temp2>temp1){
        //             //swap
        //             int temp=A[i];
        //             A [i]=A[startIndex];
        //             A[startIndex]=temp;
        //         }
        //     }
            
        //     startIndex++;
            
        // }
        
        //   int sum=0;
        // for(int i=0;i<n;i++){
        //     sum+=A[i];
        // }
        // if(sum==0){
        //     return "0";
        // }
        
        // for(int i=0;i<n;i++){
        //     s+=A[i];
        // }
        // return s;
       
       ArrayList<Integer>arr=new ArrayList<Integer>();
       
         for(int i=0;i<A.length;i++){
            arr.add(A[i]);
        }
        
        arr.sort((a,b)->(""+b+a).compareTo(""+a+b));
        if(arr.get(0)==0){
            return "0";
        }
      //  String s="";
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<arr.size();i++){
          //  s+=arr.get(i);
          sb.append(arr.get(i).toString());
        }
        
        return sb.toString();
    }
}

   
   
