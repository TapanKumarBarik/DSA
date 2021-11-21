Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30
  
  steps
  
  1. first create an list return type
  2. Iterate through input
  3. Create sub list
  4. iterate through sublist till <=i
  5. if i==0 or j==0 or i==j add 1;
  6. else add list.get(i-1).get(j-1) +list.get(i-1).get(j) 
  
  
  class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>arr=new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            List<Integer>ar=new ArrayList<>();
            
            for(int j=0;j<=i;j++){
                if(j==0 || i==0 || i==j){
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
