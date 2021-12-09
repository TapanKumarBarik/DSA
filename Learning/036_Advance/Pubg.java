Problem Description

There are N players each with strength A[i]. when player i attack player j, player j strength reduces to max(0, A[j]-A[i]). When a player's strength reaches zero, it loses the game and the game continues in the same manner among other players until only 1 survivor remains.

Can you tell the minimum health last surviving person can have?



Problem Constraints
1 <= N <= 100000

1 <= A[i] <= 1000000



Input Format
First and only argument of input contains a single integer array A.



Output Format
Return a single integer denoting minimum health of last person.



Example Input
Input 1:

 A = [6, 4]
Input 2:

 A = [2, 3, 4]


Example Output
Output 1:

 2
Output 2:

 1


Example Explanation
Explanation 1:

 Given strength array A = [6, 4]
 Second player attack first player, A =  [2, 4]
 First player attack second player twice. [2, 0]
Explanation 2:

 Given strength array A = [2, 3, 4]
 First player attack third player twice. [2, 3, 0]
 First player attack second player. [2, 1, 0]
 Second player attack first player twice. [0, 1, 0]



×
//Approach 1 -My approach

public class Solution {
    public int solve(int[] A) {
     
     
     if(A.length==1){
         return A[0];
     }
     
     int gcd1=gcd(A[0],A[1]);
     
     
     for(int i=2;i<A.length;i++){
         gcd1=gcd(gcd1,A[i]);
     }
     return gcd1;
    }
    private int gcd(int a, int b){
        
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}


/////////////4
//Approach  2- Editorial



public class Solution {
    public int gcd(int x, int y) {
        if (x == 0)
            return y;
        return gcd(y % x, x);
    }
    public int solve(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++)
            ans = gcd(ans, A[i]);

        return ans;
    }
}


