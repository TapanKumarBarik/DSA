https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1/#




//approach 1

class Solution {
    void segregate0and1(int[] arr, int n) {
        // code here
        
        int left=0;
        int right=n-1;
        
        while(left<right){
            
  
            if(arr[left]==1){
             int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
                right--;
            }
            else{
                left++;
            }
        }
        
 
        
    }
         

}
