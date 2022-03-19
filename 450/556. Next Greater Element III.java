https://leetcode.com/problems/next-greater-element-iii/


class Solution {
    public int nextGreaterElement(int t) {
        
//         String s ="";
//         s+=t;
        
//         char[]arr=s.toCharArray();
         char[] arr=(""+t).toCharArray();
        int n=arr.length;
       
        int i=n-2;
        
        while(i>=0 &&  arr[i]-'0'>=arr[i+1]-'0'){
            i--;
        }

        if(i<0)return -1;
       else{
            
            
            int j=n-1;
            
            while(arr[j]-'0'<=arr[i]-'0'){
            j--;
            }
            swap(arr, i , j);
        }
            
        reverse(arr, i+1, n-1);
        
        
        
        try{
            
            return Integer.parseInt(new String(arr) );
        }
        catch(Exception e){
            return -1;
        }
    }
    
    private void swap(char[]arr, int l, int r){
        
        char temp=arr[l];
        
        arr[l]=arr[r];
        arr[r]=temp;
        
        
    }
    
    private void reverse(char[]arr, int l, int r){
        
        while(l<r){
            swap(arr, l , r);
            l++;
            r--;
        }
    }
}
