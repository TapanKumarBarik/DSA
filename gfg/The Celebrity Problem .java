The Celebrity Problem 
Medium Accuracy: 39.46% Submissions: 90583 Points: 4
A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.
A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j  is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.
Note: Follow 0 based indexing.
 

Example 1:

Input:
N = 3
M[][] = {{0 1 0},
         {0 0 0}, 
         {0 1 0}}
Output: 1
Explanation: 0th and 2nd person both
know 1. Therefore, 1 is the celebrity. 

Example 2:

Input:
N = 2
M[][] = {{0 1},
         {1 0}}
Output: -1
Explanation: The two people at the party both
know each other. None of them is a celebrity.

Your Task:
You don't need to read input or print anything. Complete the function celebrity() which takes the matrix M and its size N as input parameters and returns the index of the celebrity. If no such celebrity is present, return -1.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
2 <= N <= 3000
0 <= M[][] <= 1
  
  
  
  /User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	
    	int c=0;
    	for(int i=1;i<n;i++){
    	    if(M[c][i]==1){
    	        c=i;
    	    }
    	}
    	
    	for(int i=0;i<n;i++){
    	    if(i!=c){
    	        if(M[i][c]==0 || M[c][i]==1){
    	            return -1;
    	        }
    	    }
    	}
    return c;	
    }
}
  
  
  
  
