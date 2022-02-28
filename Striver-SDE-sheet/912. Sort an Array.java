//https://leetcode.com/problems/sort-an-array/

//MERGE SORT

class Solution {
    public int[] sortArray(int[] nums) {
        
        mergeSort(nums, 0, nums.length-1);
        
        return nums;
    }
    
    private void merge(int []nums, int left, int mid, int right){
        
        int i=0;
        int j=0;
        int k=0;
        int n1=mid-left+1;
        int n2=right-mid;
        
        int[]arr1=new int[n1];
        
        int []arr2=new int[n2];
        
        for( i=0;i<n1;i++){
            arr1[i]=nums[left+i];
        }
        for( i=0;i<n2;i++){
            arr2[i]=nums[mid+1+i];
        }
        
        //do merge
        
        i=0;
        j=0;
        k=left;
        
        while(i<n1 && j<n2){
            
            if(arr1[i]>arr2[j]){
                
                //j is small
                nums[k]=arr2[j];
                j++;
            }
            
            else{
                
                //i is small
                nums[k]=arr1[i];
                i++;
            }
            k++;
        }
        
        //if arr1 is left
        
        while(i<n1){
                           //i is small
                nums[k]=arr1[i];
                i++;
                k++;
        }
        
        while(j<n2){
                 nums[k]=arr2[j];
                j++;
                k++;
        }
        
    }

    private void mergeSort(int[]nums, int left, int right){
        
        if(left>=right)return;
       
              int mid=(left+right)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right); 
            merge(nums, left, mid, right);
      
    }
}
