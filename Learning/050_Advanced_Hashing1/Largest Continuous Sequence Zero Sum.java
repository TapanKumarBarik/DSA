Problem Description

Given an array A of N integers.

Find the largest continuous sequence in a array which sums to zero.



Problem Constraints
1 <= N <= 106

-107 <= A[i] <= 107



Input Format
Single argument which is an integer array A.



Output Format
Return an array denoting the longest continuous sequence with total sum of zero.

NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.



Example Input
A = [1,2,-2,4,-4]


Example Output
[2,-2,4,-4]


Example Explanation
[2,-2,4,-4] is the longest sequence with total sum of zero.
  
  
  
  
  public class Solution {
    public int[] lszero(int[] A) {
        
        int startIndex=0;
        int endIndex=-1;
        
        long sum=0;
        int diff=0;
        HashMap<Long,Integer>map=new HashMap<Long,Integer>();
        
        for(int i=0;i<A.length;i++){
            
            sum+=A[i];
            
            if(sum==0){
                diff=i+1;
                startIndex=0;
                endIndex=i;
                
            }
            
            else if(map.containsKey(sum)){
                //
                int tempIndex=map.get(sum)+1;
                //1,2,-2,4,-4
                //1,2,1,5,1
                
                
                
                int tempDiff=i-tempIndex+1;
                if(tempDiff>diff){
                    
                    diff=tempDiff;
                    startIndex=tempIndex;
                    endIndex=i;
                }
                
            }
            else{
                map.put(sum,i);
            }
            
        }
        //
        int []arr=new int[diff];
        int index=0;
        for(int i=startIndex;i<=endIndex;i++){
            arr[index]=A[i];
            index++;
        }
        return arr;
    }

    
    
}




//////////////////
