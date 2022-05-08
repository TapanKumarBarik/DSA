Problem Description

You love reading books, and you also love reading books that you've already read (weird you).

In a day, you read a total of N times, consisting of some books. Each book is represented by an index in array A.

You write the number of each book you read in the order of reading them in the array A.

You are supposed to find the book that you've least recently read (the book you haven't read for as long as possible) out of the books you've read that day (Books in array A).



Problem Constraints

1 <= N <= 2 x 105

0 <= A[i] <= 2 x 105

You can read books more than once.



Input Format

The first and the only argument of input contains an integer array, A.



Output Format

Return an integer, representing the answer.



Example Input

Input 1:

 A = [4, 8, 1, 3, 1]
Input 2:

 A = [7, 8, 4, 2, 7]


Example Output

Output 1:

 4
Output 2:

 8


Example Explanation

Explanation 1:

 4 is the least recently read book.
Explanation 2:

 8 is the least recently read book.


   
   
   
   
   
   
   
   
   
   
   
   
   public class Solution {
    public int solve(int[] A) {

        int[]arr=new int[1000005];

        int res=0;
        for(int i=A.length-1;i>=0;i--){
            if(arr[A[i]]==0){
                arr[A[i]]=1;
                res=A[i];
            }

        }
        return res;
    }
}
