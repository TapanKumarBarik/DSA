//https://leetcode.com/problems/majority-element-ii/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
        List<Integer>arr=new ArrayList<Integer>();
        
        if(nums.length==1){
            arr.add(nums[0]);
            return arr;
        }
        
        
        int num1=-1;
        int num2=-1;
        
        int vote1=0;
        int vote2=0;
        
        int n=nums.length;
        for(int i=0;i<n;i++){            
            int curr=nums[i];

        if(curr==num1){
                vote1++;
            }
            
            else if(curr==num2){
                vote2++;
            }
            else if(vote1==0){
                num1=curr;
                 vote1++;
            }
            else if(vote2==0){
                num2=curr;
                 vote2++;
            }
            
            
  
            else{
                vote1--;
                vote2--;
            }
            
        
        }
        
        int vote3=0;
        int vote4=0;
        
        for(int i=0;i<n;i++){
            
            if(nums[i]==num1){
                vote3++;
            }
            if(nums[i]==num2){
                vote4++;
            }
        }
        
      
        
        if(vote3>n/3 ){
            arr.add(num1);
        }
             if(vote4>n/3   && num1!=num2){
            arr.add(num2);
        }
        return arr;
    }
}
