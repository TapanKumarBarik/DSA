//Appraoch 1

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] A) {

        Arrays.sort(A);
        for(int i=0;i<A.length-1;i++){
            if(A[i]==A[i+1]){
return A[i];
            }
        }
        return -1;
    }
}


//////////////////////////////////////////////////////////////
class Solution {
    public int findDuplicate(int[] nums) {
        
        int slow=nums[0];
        int fast=nums[0];
        
       do{
            slow=nums[slow];
            fast=nums[nums[fast]];
       }
        while(slow!=fast);
           
        
        
        fast=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
            
        }
        
        
        return slow;
    }
}
