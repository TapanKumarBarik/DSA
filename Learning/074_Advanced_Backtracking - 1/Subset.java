Problem Description

Given a set of distinct integers A, return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
Also, the subsets should be sorted in ascending ( lexicographic ) order.
The list is not necessarily sorted.


Problem Constraints
1 <= |A| <= 16
INTMIN <= A[i] <= INTMAX


Input Format
First and only argument of input contains a single integer array A.



Output Format
Return a vector of vectors denoting the answer.



Example Input
Input 1:

A = [1]
Input 2:

A = [1, 2, 3]


Example Output
Output 1:

[
    []
    [1]
]
Output 2:

[
 []
 [1]
 [1, 2]
 [1, 2, 3]
 [1, 3]
 [2]
 [2, 3]
 [3]
]


Example Explanation
Explanation 1:

 You can see that these are all possible subsets.
Explanation 2:

You can see that these are all possible subsets.
  
  
  
  
  
  
  
  
  
  
  
  
  public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        
        
        Collections.sort(A);
        ArrayList<ArrayList<Integer>>arr=new ArrayList();
        
        solve(A,arr,0, new ArrayList());
        return arr;
    }
    
    private void solve(ArrayList<Integer> A,  ArrayList<ArrayList<Integer>>arr,int i,ArrayList<Integer> temp){
 
        arr.add(new ArrayList(temp));
        for(int j=i;j<A.size();j++){
        temp.add(A.get(j) );
         solve(A, arr, j+1,temp);
         temp.remove(temp.size()-1 );
        }
    }
}
