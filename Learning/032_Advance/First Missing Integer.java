Problem Description

Given an unsorted integer array A of size N. Find the first missing positive integer.

Note: Your algorithm should run in O(n) time and use constant space.



Problem Constraints
1 <= N <= 1000000

-109 <= A[i] <= 109



Input Format
First argument is an integer array A.



Output Format
Return an integer denoting the first missing positive integer.



Example Input
Input 1:

[1, 2, 0]
Input 2:

[3, 4, -1, 1]
Input 3:

[-8, -7, -6]


Example Output
Output 1:

3
Output 2:

2
Output 3:

1


Example Explanation
Explanation 1:

A = [1, 2, 0]
First positive integer missing from the array is 3.

  
  
  
  
  
  public class Solution {
    public int firstMissingPositive(int[] nums) {
        
        
        
                //Approach 1
        int n=nums.length;
        boolean []arr=new boolean [n]; 
        for (int i = 0; i < n; i++) {
      if (nums[i] >= 1 && nums[i] <= n) {
        arr[nums[i] - 1] = true;
      }   
        } 
        for(int i=0;i<n;i++){   
            if(!arr[i]){
                return i+1;
            }
        }
        return n+1;
    }
}




//Approach 2
public class Solution {
    public int firstMissingPositive(int[] A) {
        
        
        
    //             //Approach 1
    //     int n=nums.length;
    //     boolean []arr=new boolean [n]; 
    //     for (int i = 0; i < n; i++) {
    //   if (nums[i] >= 1 && nums[i] <= n) {
    //     arr[nums[i] - 1] = true;
    //   }   
    //     } 
    //     for(int i=0;i<n;i++){   
    //         if(!arr[i]){
    //             return i+1;
    //         }
    //     }
    //     return n+1;
        
  int i = 0;
        while(i < A.length){
            if(A[i] == i+1 || A[i] <= 0 || A[i] > A.length) i++;
            else if(A[A[i]-1] != A[i]) swap(A, i, A[i]-1);
            else i++;
        }
        i = 0;
        while(i < A.length && A[i] == i+1) i++;
        return i+1;
    }
    
    
    
    private void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}






////////////////////////////////////////////////////////////////////////////////////////////////

//Approach 3

