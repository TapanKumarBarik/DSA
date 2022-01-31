Problem Description

Given an array A of positive integers,call a (contiguous,not necessarily distinct) subarray of A good if the number of different integers in that subarray is exactly B.

(For example: [1, 2, 3, 1, 2] has 3 different integers 1, 2 and 3)

Return the number of good subarrays of A.



Problem Constraints
1 <= |A| <= 40000

1 <= A[i] <= |A|

1 <= B <= |A|



Input Format
The first argument given is the integer array A.

The second argument given is an integer B.



Output Format
Return an integer denoting the number of good subarrays of A.



Example Input
Input 1:

 A = [1, 2, 1, 2, 3]
 B = 2
Input 2:

 A = [1, 2, 1, 3, 4]
 B = 3


Example Output
Output 1:

 7
Output 2:

 3


Example Explanation
Explanation 1:

  Subarrays formed with exactly 2 different integers: [1, 2], [2, 1], [1, 2], [2, 3], [1, 2, 1], [2, 1, 2], [1, 2, 1, 2].
Explanation 2:

  Subarrays formed with exactly 3 different integers: [1, 2, 1, 3], [2, 1, 3], [1, 3, 4].

    
    
    
    
    
    public class Solution {
    public int solve(int[] arr, int k) {
        int ans=count(arr,k)-count(arr,k-1);
        return ans;
        
    }
    public int count(int[] arr,int k)
    {
        int res=0;
        int s=0;
        int e=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        
        while(e<arr.length)
        {
            m.put(arr[e],m.getOrDefault(arr[e],0)+1);
            
            while(m.size()>k)
            {
                m.put(arr[s],m.get(arr[s])-1);
                
                if(m.get(arr[s])==0)
                    m.remove(arr[s]);
                
                s++;
            }
            
            res=res+(e-s)+1;
            e++;
        }
        return res;
    }
}
