Problem Description
 
 

Given numRows, generate the first numRows of Pascal's triangle.
Pascal's triangle : To generate A[C] in row R, sum up A'[C] and A'[C-1] from previous row R - 1.

Example:

Given numRows = 5,

Return

[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]
Constraints:
0 <= numRows <= 25




  
  
  
  
  public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int a) {
        ArrayList<ArrayList<Integer>>arr=new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<a;i++){
          ArrayList<Integer>ar=new  ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                  
            if(i==0 || i==j || j==0){
                ar.add(1);
            }
            else{
                ar.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
            }
            }
            arr.add(ar);
        }
        return arr;
    }
}
