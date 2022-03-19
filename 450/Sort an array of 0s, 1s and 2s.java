https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1/


class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        
        int zero=0;
        int one=0;
        int two=0;
        
        for(int i:a){
            
            if(i==0)zero++;
            else if(i==1)one++;
            else two++;
        }
        
        
        for(int i=0;i<zero;i++){
            a[i]=0;
        }
        for(int i=0;i<one;i++){
            
            a[i+zero]=1;
        }
        
        for(int i=0;i<two;i++){
            a[i+zero+one]=2;
        }
        
        
    }
}
