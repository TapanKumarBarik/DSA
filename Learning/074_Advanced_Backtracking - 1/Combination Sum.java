Problem Description

Given a set of candidate numbers A and a target number B, find all unique combinations in A where the candidate numbers sums to B.

The same repeated number may be chosen from A unlimited number of times.

Note:

1) All numbers (including target) will be positive integers.

2) Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).

3) The combinations themselves must be sorted in ascending order.

4) CombinationA > CombinationB iff (a1 > b1) OR (a1 = b1 AND a2 > b2) OR ... (a1 = b1 AND a2 = b2 AND ... ai = bi AND ai+1 > bi+1)

5) The solution set must not contain duplicate combinations.



Problem Constraints
1 <= |A| <= 20

1 <= A[i] <= 50

1 <= B <= 500



Input Format
First argument is the vector A.

Second argument is the integer B.



Output Format
Return a vector of all combinations that sum up to B.



Example Input
Input 1:

A = [2, 3]
B = 2
Input 2:

A = [2, 3, 6, 7]
B = 7


Example Output
Output 1:

[ [2] ]
Output 2:

[ [2, 2, 3] , [7] ]


Example Explanation
Explanation 1:

All possible combinations are listed.
Explanation 2:

All possible combinations are listed.
  
  
  
  
  
  
  
  
  
  
  
  
  
  public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        Collections.sort(A);
        
        solve(A, arr,new ArrayList(), B, 0);
        
        return arr;
    }
    
    
private void solve(ArrayList<Integer> A,ArrayList<ArrayList<Integer>>arr,ArrayList<Integer>temp,int B, int start){
        
        if(B<0)return;
        
        else if(B==0){
            
            if(!arr.contains(temp)){
                arr.add(new ArrayList(temp) );
            }

        }
        
        else{
            for(int i=start;i<A.size();i++ ){
            
            temp.add(A.get(i) );
          
            solve(A, arr,temp, B-A.get(i), i);
             
            temp.remove(temp.size()-1 );
           
        }
        }
        
    }
}
