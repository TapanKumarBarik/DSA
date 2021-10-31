Problem Description

Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single element "-1".

First sub-array means the sub-array for which starting index in minimum.



Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 109



Input Format
The first argument given is the integer array A.

The second argument given is integer B.



Output Format
Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single element "-1".



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 5
Input 2:

 A = [5, 10, 20, 100, 105]
 B = 110


Example Output
Output 1:

 [2, 3]
Output 2:

 -1


Example Explanation
Explanation 1:

 [2, 3] sums up to 5.
Explanation 2:

 No subarray sums up to required number.
   
   
   public class Solution {
    public int[] solve(int[] A, int B) {
         int []a={-1};
        int start=0;
        int end=-1;
        long currentSum=0;
        
        HashMap<Long,Integer>hm=new HashMap<Long,Integer>();
        
        for(int i=0;i<A.length;i++){
            currentSum+=A[i];
            //1 2 3
            if(currentSum==(long)B){
                start=0;
                end=i;
                break;
            }
            
                else if(hm.containsKey(currentSum-B)){
                    start=hm.get(currentSum-B)+1;
                    end=i;
                    break;
                }
            hm.put(currentSum,i);
            
        }
      
        if(end!=-1){
            int []b=new int[end-start+1];
            int count=0;
            for(int i=start;i<=end;i++){
                b[count]=A[i];
                count++;
            }
            return b;
        }
        return a;
    }
}
