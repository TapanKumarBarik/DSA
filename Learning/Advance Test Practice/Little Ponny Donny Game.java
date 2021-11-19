Problem Description

Little Ponny and Little Donny are playing a game. The game consists of a box containing A stones in the beginning.

A move consists of removing some stones from the box. Now, if the box contains K stones at the moment, then a player can pick up anywhere between 1 to K − 1 number of stones except if there is only one left in which case the player has no other choice but to pick it. The player who isn't able to make any move loses.

Guess the winner if Little Ponny moves first.



Problem Constraints
1 <= A <= 109



Input Format
The first and the only argument of input contains an integer, A.



Output Format
Return a string representing the answer:

"Ponny" : if Little Ponny is the winner.
"Donny" : if Little Donny is the winner.


Example Input
Input 1:

 A = 1
Input 2:

 A = 2


Example Output
Output 1:

 "Ponny"
Output 2:

 "Donny"


Example Explanation
Explanation 1:

 Little Ponny can pick up the stone and then Little Donny is not left with any moves. So, Little Ponny wins.
Explanation 2:

 Little Ponny can only pick 1 stone and then Little Donny will pick up 1 stone on his own. Now, Little Ponny is not left with any moves, so, Little Donny wins.


   
   
   
   public class Solution {
    public String solve(int A) {
        
        if(A==2){
            return"Donny";
            
        }
        return "Ponny";
    }
}
