Problem Description

Given a collection of integers denoted by array A of size N that might contain duplicates, return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
The subsets must be sorted lexicographically.


Problem Constraints
0 <= N <= 16



Input Format
Only argument is an integer array A of size N.



Output Format
Return a 2-D vector denoting all the possible subsets.



Example Input
Input 1:

 A = [1, 2, 2]
Input 2:

 A = [1, 1]


Example Output
Output 1:

 [
    [],
    [1],
    [1, 2],
    [1, 2, 2],
    [2],
    [2, 2]
 ]
Output 2:

 [
    [],
    [1],
    [1, 1]
 ]


Example Explanation
Explanation 1:

All the subsets of the array [1, 2, 2] in lexicographically sorted order.
  
  
  
  
  
  
  
  
  
  
  
  
  public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        
        ArrayList<ArrayList<Integer>>list=new ArrayList();
        
        Collections.sort(A);
        
        solve(list,new ArrayList(),A,0);
        
        return list;
    }
    
    private void solve( ArrayList<ArrayList<Integer>>arr, ArrayList<Integer>temp,ArrayList<Integer>A,int index){
        
        
        arr.add(new ArrayList(temp) );
        
        for(int i=index;i<A.size();i++){
            
            
            if(i>index && A.get(i)==A.get(i-1) )continue;
            
            temp.add(A.get(i) );
            
            solve(arr, temp,A,i+1);
            temp.remove(temp.size()-1 );
        }
    }
}
