Problem Description

Given an array A. Find the size of the smallest subarray such that it contains atleast one occurrence of the maximum value of the array

and atleast one occurrence of the minimum value of the array.



Problem Constraints
1 <= |A| <= 2000



Input Format
First and only argument is vector A



Output Format
Return the length of the smallest subarray which has atleast one occurrence of minimum and maximum element of the array



Example Input
Input 1:

A = [1, 3]
Input 2:

A = [2]


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 Only choice is to take both elements.
Explanation 2:

 Take the whole array.

  public class Solution {
    public int solve(int[] A) {
        int n=A.length;
        if(n==1 || n==2){
            return n;
        }
        
        int maxValue=Integer.MIN_VALUE;
        int minValue=Integer.MAX_VALUE;
        //int count=0;
        int maxCount=minValue;
        
        for(int i=0;i<A.length;i++){
            maxValue=Math.max(A[i],maxValue);
            minValue=Math.min(A[i],minValue);
        }
        
        for(int i=0;i<n;i++){
            
            if(A[i]==minValue){
                
                int m=i;
                int count=0;
                while(m<A.length){
                     count++;
                    if(A[m]==maxValue){
                        maxCount=Math.min(maxCount,count);
                        break;
                    }
                   
                    m++;
                }
            }
            //
            
             if(A[i]==maxValue){
                
                int m=i;
                int count=0;
                while(m<A.length){
                     count++;
                    if(A[m]==minValue){
                        maxCount=Math.min(maxCount,count);
                        break;
                    }
                   
                    m++;
                }
            }
        }
   
        return maxCount;
    }
}
 
   
