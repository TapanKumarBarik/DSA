You are given an array (zero indexed) of N non-negative integers, A0, A1 ,…, AN-1.

Find the minimum sub array Al, Al+1 ,…, Ar so if we sort(in ascending order) that sub array, then the whole array should get sorted.

If A is already sorted, output -1.

Example :

Input 1:

A = [1, 3, 2, 4, 5]

Return: [1, 2]

Input 2:

A = [1, 2, 3, 4, 5]

Return: [-1]
In the above example(Input 1), if we sort the subarray A1, A2, then whole array A should get sorted.

  
  
  //o(1) space approach
  
  

  
  
  
  
  
  //soarted approach
  
  public class Solution {
    public int[] subUnsort(int[] A) {
        int s=-1;
        int e=-1;
        int a[]=new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            a[i]=A[i];
        }
        Arrays.sort(a);
        for(int i=0;i<A.length;i++)
        {
            if(a[i]!=A[i])
            {
                s=i;
                break;
            }
        }
        for(int i=A.length-1;i>=0;i--)
        {
            if(a[i]!=A[i])
            {
                e=i;
                break;
            }
        }
        int h[]=new int[2];
        int k[]=new int[1];
        k[0]=-1;
        if(s==e)
          return k;
        h[0]=s;
        h[1]=e;
        return h;
    }
}



