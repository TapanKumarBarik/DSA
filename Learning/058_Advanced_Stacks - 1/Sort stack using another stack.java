Problem Description

Given a stack of integers A, sort it using another stack.

Return the array of integers after sorting the stack using another stack.



Problem Constraints
1 <= |A| <= 5000

0 <= A[i] <= 1000000000



Input Format
The only argument given is the integer array A.



Output Format
Return the array of integers after sorting the stack using another stack.



Example Input
Input 1:

 A = [5, 4, 3, 2, 1]
Input 2:

 A = [5, 17, 100, 11]


Example Output
Output 1:

 [1, 2, 3, 4, 5]
Output 2:

 [5, 11, 17, 100]


Example Explanation
Explanation 1:

 Just sort the given numbers.
Explanation 2:

 Just sort the given numbers.


   
   
   
   
   
   public class Solution {
    public int[] solve(int[] A) {
        
        
              if (A.length <= 1) return A;

            Stack < Integer > s1 = new Stack < Integer > ();
            Stack < Integer > helper = new Stack < Integer > ();
            
            for (int i = 0; i < A.length; i++) {
              s1.push(A[i]);
            }
    
            while(!s1.isEmpty()){
                
                int temp=s1.peek();
                s1.pop();
                
                if(helper.isEmpty()){
                    helper.push(temp);
                }
                else if(temp>helper.peek()){
                    
                    while(!helper.isEmpty() && temp>helper.peek() ){
                        
                        int pushToS1=helper.peek();
                        helper.pop();
                        s1.push(pushToS1);
                        
                    }
                    helper.push(temp);
                }
                else{
                     helper.push(temp);
                }
                
            }
                int index=0;
                
                while(!helper.isEmpty()){
                
                A[index]=helper.peek();
                helper.pop();
                index++;
                }
                return A;
        
        
        
    }
}
