Problem Description

Given an array A of size N denoting collection of numbers that might contain duplicates, return all possible unique permutations.

NOTE: No 2 entries in the permutation sequence should be the same.

WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS. Example : next_permutations in C++ / itertools.permutations in python.
If you do, we will disqualify your submission retroactively and give you penalty points.


Problem Constraints
1 <= |A| <= 9

0 <= A[i] <= 10



Input Format
Only argument is an integer array A of size N.



Output Format
Return a 2-D array denoting all possible unique permutation of the array.



Example Input
Input 1:

A = [1, 1, 2]
Input 2:

A = [1, 2]


Example Output
Output 1:

[ [1,1,2]
  [1,2,1]
  [2,1,1] ]
Output 2:

[ [1, 2]
  [2, 1] ]


Example Explanation
Explanation 1:

 All the possible unique permutation of array [1, 1, 2].
Explanation 2:

 All the possible unique permutation of array [1, 2].
   
   
   
   
   
   
   
   
   public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        
        
        ArrayList<ArrayList<Integer>>list=new ArrayList();
        Collections.sort(A);
        solve(list, new ArrayList(), A,new boolean[A.size()] );
        
        return list;
    }
    
    private void solve(ArrayList<ArrayList<Integer>>list, ArrayList<Integer>temp, ArrayList<Integer>A, boolean [] used){
        
        
        if(temp.size()==A.size()){
            list.add(new ArrayList(temp) );
        }
        else{
            
            for(int i=0;i<A.size();i++){
                
                //if(list.contains(temp) )continue;
                 if(used[i] || i > 0 && A.get(i) == A.get(i-1)  && used[i - 1]==false) continue;
                used[i] = true; 
                temp.add(A.get(i) );
                solve(list,temp, A,used);
                used[i] = false; 
                temp.remove(temp.size()-1 );
            }
            
        }
    }
}
