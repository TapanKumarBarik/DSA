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







//Approach 2


class Solution {
    void segregate0and1(int[] arr, int n) {
        // code here
 int zero=0;
        int one=0;
        
        for(int i:arr){
            
            if(i==0)zero++;
            else one++;
        }
        
        
        for(int i=0;i<zero;i++){
            
            arr[i]=0;
        }
        
        for(int i=0;i<one;i++){
            arr[i+zero]=1;
        }
 
          }
         

}  
