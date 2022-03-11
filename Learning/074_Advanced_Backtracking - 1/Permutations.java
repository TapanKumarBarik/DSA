Problem Description

Given an integer array A of size N denoting collection of numbers , return all possible permutations.

NOTE:

No two entries in the permutation sequence should be the same.
For the purpose of this problem, assume that all the numbers in the collection are unique.
Return the answer in any order
WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS. Example : next_permutations in C++ / itertools.permutations in python.
If you do, we will disqualify your submission retroactively and give you penalty points.


Problem Constraints
1 <= N <= 9



Input Format
Only argument is an integer array A of size N.



Output Format
Return a 2-D array denoting all possible permutation of the array.



Example Input
A = [1, 2, 3]


Example Output
[ [1, 2, 3]
  [1, 3, 2]
  [2, 1, 3] 
  [2, 3, 1] 
  [3, 1, 2] 
  [3, 2, 1] ]


Example Explanation
All the possible permutation of array [1, 2, 3].

  
  
  
  
  
  
  
  
  
  
  
  

public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        
        ArrayList<ArrayList<Integer>>arr=new ArrayList();
        
        solve(A, arr,0);
        
        return arr;
    }
    
    private void solve(ArrayList<Integer>A, ArrayList<ArrayList<Integer>>arr, int i){
        
        
        if(i==A.size() ){
            arr.add (new ArrayList(A) );
            return;
        }

        for(int j=i;j<A.size();j++){
            
            //swap(A.get(i) ,A.get(j));
            int temp2=A.get(i);
            A.set(i, A.get(j) );
              A.set(j, temp2 );
              
            solve(A, arr,i+1);
            
              //swap(A.get(i) ,A.get(j));
            int temp1=A.get(i);
            A.set(i, A.get(j) );
            A.set(j, temp1 );
        }
    }

}

//Approach 1 -with extra space 
//o to a 

//Appoach 2
// if i==n add
//for loop j=i swap i , j 
//call func
//swap


  
  
  
  
  
  
  
  
  
  
  
  
  
//if temp size==a size then push
//else 
//if temp has  a a[i] continue;
//else for loop from 0 
//

public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        
        ArrayList<ArrayList<Integer>>arr=new ArrayList();
        
        solve(A, arr, new ArrayList());
        
        return arr;
    }
    
    private void solve(ArrayList<Integer>A, ArrayList<ArrayList<Integer>>arr, ArrayList<Integer>temp){
        
        
        if(temp.size()==A.size() ){
            arr.add (new ArrayList(temp) );
            
        }
        
        else{
            
            for(int i=0;i<A.size();i++){
                
                if(temp.contains(A.get(i)) ){
                    continue;
                }
                
                temp.add(A.get(i) );
                 solve(A, arr,temp);
                 temp.remove(temp.size()-1);
                
            }
            
        }
    }
}
