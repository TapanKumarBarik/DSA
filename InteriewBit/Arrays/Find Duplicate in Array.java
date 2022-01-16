Problem Description

Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.
Sample Input:

[3 4 1 4 1]

Sample Output:

1

If there are multiple possible answers ( like in the sample case above ), output any one.

If there is no duplicate, output -1
  
  
  

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] A) {
        // HashSet<Integer>set=new HashSet();

        for(int i=0;i<A.length;i++){
            if(set.contains(A[i])){
                return A[i];
            }
            else{
                set.add(A[i]);
            }
        }
        return -1;
      
    }
}






public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] A) {
 

        //O(1) SPACE
         
       for(int i=0;i<A.length;i++){
           int index=Math.abs(A[i]);

           if(A[index]>=0){
               A[index]=-A[index];
           }
           else{
               return index;
           }
       }
       return -1;
    }
}
