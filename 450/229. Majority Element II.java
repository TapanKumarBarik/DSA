



https://leetcode.com/problems/majority-element-ii/


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
        int vote1=0;
        int vote2=0;
        
        int num1=-1;
        int num2=-1;
        
        int n=nums.length;
        
        
        for(int i=0;i<n ;i++ ){

            if(nums[i]==num1){
                vote1++;
            }
            else if(nums[i]==num2){
                vote2++;
            }
             else if(vote1==0){
                
                num1=nums[i];
                  vote1=1;
            }
            else if(vote2==0){
                num2=nums[i];
                vote2=1;
            }
            
            else{
                vote1--;
                vote2--;
            }
                
        }
        
        List<Integer>res=new ArrayList();
        
        int vote11=0;
        int vote22=0;
        
        for(int i=0;i<n;i++){
            
            
            if(nums[i]==num1){
                vote11++;
            }
            else if(nums[i]==num2){
                vote22++;
            }
        }
        
        if(vote11>n/3){
            res.add(num1);
        }
         if(vote22>n/3){
            res.add(num2);
        }
        
        return res;
    }
}
