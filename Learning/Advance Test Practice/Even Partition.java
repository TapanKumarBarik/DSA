Problem Description

Mohit and Akshat are great fans of even numbers and they have A number of apples with them. They want to divide the apples in such a way that each of the two gets positive even number of apples, at the same time both should have unequal number of apples. The boys are extremely tired and want to start their meal as soon as possible, that's why you should help them and find out, if they can divide in the way they want.



Problem Constraints
0 <= A <= 103



Input Format
First argument is an integer showing number of apples.



Output Format
Return 1 if the partition is possible in the required way otherwise return 0.



Example Input
Input 1:

8
Input 2:

4
Input 3:

5


Example Output
Output 1:

1
Output 2:

0
Output 3:

0


Example Explanation
Explanation 1:

2 and 6
Explanation 2:

Only possible positive even partition is 2 and 2 but both are equal.
Explanation 2:

No possible positive even partitions.



  
  
  
  
  
  
  public class Solution {
    public int solve(int A) {
        
        if(A%2!=0){
            return 0;
        }
        
        if(A%2==0 && A>5){
            return 1;
        }
        return 0;
    }
}
