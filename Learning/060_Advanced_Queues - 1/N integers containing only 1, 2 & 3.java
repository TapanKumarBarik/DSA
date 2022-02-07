Problem Description

Given an integer A. Find and Return first positive A integers in ascending order containing only digits 1, 2 and 3.

NOTE: All the A integers will fit in 32 bit integer.



Problem Constraints
1 <= A <= 29500



Input Format
The only argument given is integer A.



Output Format
Return an integer array denoting the first positive A integers in ascending order containing only digits 1, 2 and 3.



Example Input
Input 1:

 A = 3
Input 2:

 A = 7


Example Output
Output 1:

 [1, 2, 3]
Output 2:

 [1, 2, 3, 11, 12, 13, 21]


Example Explanation
Explanation 1:

 Output denotes the first 3 integers that contains only digits 1, 2 and 3.
Explanation 2:

 Output denotes the first 3 integers that contains only digits 1, 2 and 3.
   
   
   
   
   
   
   
   
   
   public class Solution {
    public ArrayList<Integer> solve(int A) {
        
        ArrayList<Integer>arr=new ArrayList();

        Queue<Integer>q=new ArrayDeque();
        
        q.add(1);
        q.add(2);
        q.add(3);
        
        int count=3;
        
        while(arr.size()<A){
            
            int temp=q.peek();
            q.remove();
            arr.add(temp);
            
            if(count>=A){
                continue;
            }
            
            q.add(10*temp+1);
            q.add(10*temp+2);
            q.add(10*temp+3);
            count+=3;
            
            
        }
        return arr;
        
    }
}
