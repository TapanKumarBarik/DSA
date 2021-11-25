Problem Description

Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.



Problem Constraints
1 <= |A| <= 100000



Input Format
First and only argument is the vector A



Output Format
Return one integer, the answer to the question



Example Input
Input 1:

A = [0, 1, 0, 2]
Input 2:

A = [1, 2]


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

1 unit is trapped on top of the 3rd element.
Explanation 2:

No water is trapped.




  
  
  
  
  //Approach 1
  
  public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        
        
        int n=A.length;
        //left_array
        int []left_array=new int[n];
        left_array[0]=A[0];
        
        for(int i=1;i<n;i++){
            int temp=Math.max(A[i],left_array[i-1]);
            left_array[i]=temp;
        }
        //right_array
        
        int []right_array=new int[n];
        right_array[n-1]=A[n-1];
        for(int i=n-2;i>=0;i--){
            int temp=Math.max(A[i],right_array[i+1]);
            right_array[i]=temp;
        }
        //calculating the result
        
        int ans=0;
        
        for(int i=0;i<n;i++){
            int temp=Math.min(right_array[i],left_array[i] );
            int tempAns=temp-A[i];
            ans+=tempAns;
        }
        
        return ans;
        
        
        

        
    }
}
///

//Approach 2
