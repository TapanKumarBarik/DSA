Problem Description

Given an array of size n, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exist in the array.

Example :

Input : [2, 1, 2]
Return  : 2 which occurs 2 times which is greater than 3/2.





public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {
        int currentNum=A[0];
        int vote=1;
        for(int i=1;i<A.length;i++){
            if(A[i]==currentNum)vote++;
            else{
                vote--; 
            }
            if(vote==0){
                currentNum=A[i];
                vote=1;
            }
        }
        return currentNum;
    }
}
