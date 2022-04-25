Problem Description
Given the number of vertices A in a Cyclic Graph.

Your task is to determine the minimum number of colors required to color the graph so that no two Adjacent vertices have the same color.



Problem Constraints
3 <= A <= 109



Input Format
First argument is an integer A denoting the number of vertices in the Cyclic Graph.



Output Format
Return an single integer denoting the minimum number of colors required to color the graph so that no two Adjacent vertices have the same color.



Example Input
Input 1:

 5
Input 2:

 4


Example Output
Output 1:

 3
Output 2:

 2


Example Explanation
Explanation 1:

 
 Color required = 3
Explanation 2:

 
 Color required = 2




×












public class Solution {
    public int solve(int vertices) {


              int result = 0;
   
        // Check if number of vertices
        // is odd or even.
        // If number of vertices is even
        // then color require is 2 otherwise 3
        if (vertices % 2 == 0)
            result = 2;
        else
            result = 3;
       
        return result;
    }
}
