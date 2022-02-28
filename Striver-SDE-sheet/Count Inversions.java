//https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1#


// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long res=mergeSort(arr, 0, (int)N-1);
        return res;
    }
    
     private static long mergeSort(long arr[], int left, int right) {
        long invCount = 0;
 
        if (right > left) {
            int mid = (right + left) / 2;
 
            invCount = mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid + 1, right);
            invCount += merge(arr, left, mid + 1, right);
        }
        return invCount;
    }
    private static long merge(long arr[], int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = 0;
        long invCount = 0;
        long temp[] = new long[(right - left + 1)];
 
        while ((i < mid) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                ++k;
                ++i;
            } 
            else {
                temp[k] = arr[j];
                invCount += (mid - i);
                ++k;
                ++j;
            }
        }
 
        while (i < mid) {
            temp[k] = arr[i];
            ++k;
            ++i;
        }
 
        while (j <= right) {
            temp[k] = arr[j];
            ++k;
            ++j;
        }
 
        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
 
        return invCount;
    }
}
