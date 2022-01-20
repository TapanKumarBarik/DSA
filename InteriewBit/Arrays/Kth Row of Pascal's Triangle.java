Problem Description

Given an index k, return the kth row of the Pascal's triangle.
Pascal's triangle: To generate A[C] in row R, sum up A'[C] and A'[C-1] from previous row R - 1.

Example:

Input : k = 3


Return : [1,3,3,1]

Note: k is 0 based. k = 0, corresponds to the row [1]. 
  
  
  
  
  
  public class Solution {
    public ArrayList<Integer> getRow(int a) {
ArrayList<Integer> arr=new ArrayList<Integer>();

for(int i=0;i<=a;i++){
    arr.add(1);
    for(int j=i-1;j>0;j--){
        arr.set(j,arr.get(j-1)+arr.get(j));
    }
}
return arr;
    }
}

