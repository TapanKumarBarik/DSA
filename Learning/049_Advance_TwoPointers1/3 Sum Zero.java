Problem Description

Given an array A of N integers, are there elements a, b, c in S such that a + b + c = 0

Find all unique triplets in the array which gives the sum of zero.

Note:

Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c) The solution set must not contain duplicate triplets.



Problem Constraints
0 <= N <= 7000

-108 <= A[i] <= 108



Input Format
Single argument representing a 1-D array A.



Output Format
Output a 2-D vector where each row represent a unique triplet.



Example Input
A = [-1,0,1,2,-1,4]


Example Output
[ [-1,0,1],
  [-1,-1,2] ]


Example Explanation
Out of all the possible triplets having total sum zero,only the above two triplets are unique.



×



public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        int N = A.size();
        ArrayList<ArrayList<Integer>>arr=new ArrayList<ArrayList<Integer>>();
        int i = 0;
        while(i<N){
            int low=i+1;
            int high=N-1;
            int x = A.get(i);
            int sumToFind=-x;
            while(low<high){
                 ArrayList<Integer>ar=new ArrayList<Integer>();
                 int y = A.get(low);
                 int z = A.get(high);
                 int temp=y + z;
                if(temp==sumToFind){
                    ar.add(x);
                    ar.add(y);
                    ar.add(z);
                    arr.add(ar);
                    
                    while(low < N && x==A.get(low))
                    {
                        low++;
                    }
                    while(high >= 0 && z ==A.get(high))
                    {
                        high--;
                    }
                }
                else if(temp<sumToFind){
                    low++;
                }
                else{
                 high--;
                }
            }
            
            while(i < N && x == A.get(i)) {
                i++;
            }
        }
        return arr;
    }
}
