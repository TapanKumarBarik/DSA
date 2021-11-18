Its that time of the year again for choosing the new leader of the Jabari tribe.

M'baku, a revered general was also contesting for the elections along with N-1 other candidates.

A person will win the elections if he has strictly more votes than all other candidates.

You are given an array A of size N that denotes the current fixtures of the votes, A[i] denotes the number of votes that the i'th candidate is getting. (Note: M'Baku is the first in the array)

M'Baku wants to win the elections at any cost, so he is ready to bribe the people of the tribe.

Each person he bribes decides to retreat his vote from the person he was initally voting for and give it to M'Baku.

Find the minimum number of people he will have to bribe to win the elections.

Constraints:

2<= Size of array <=100
1 <= A[i] <= 1000
Input Format An array A denoting the initial votes every candidate is getting

Output Format An integer denoting minimum people M'Baku has to bribe to win the elections

Example Input

A:[5 1 11 2 8]
Example Output

4
Explanation M'Baku has 5 votes here. One way to win the elections is to bribe 4 people who are going to vote for third candidate and reduce his/her votes from 11 to 7. One more way can be to bribe 3 people who are going to vote candidate 3 and bribe 1 person who is going to vote to candidate 2.


  
  
  
  
  Lets store the number of votes M’Baku initially has in a variable.
Now we sort the remaining elements, we take one vote from the maximum votes and give it to M’Baku, we keep repeating
this process until the maximum element of the array of N-1 elements is smaller than M’Bakus current number of votes.
Complexity will N^2 * log(N) in the worst case which will pass the given constraints.
Why will this greedy work?
We keep on removing votes from the maximum votes till the maximum votes are less than M’Bakus.
  
  
  
  
×
public class Solution {
    public int solve(int[] A) {
        
        int mbaku=A[0];
        
        int[]arr=new int[A.length-1];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=A[i+1];
            
        }
        int count=0;
        Arrays.sort(arr);
        while(mbaku<=arr[arr.length-1]){
            mbaku=mbaku+1;
            arr[arr.length-1]=arr[arr.length-1]-1;
            count++;
            
            
            Arrays.sort(arr);
        }
        return count;
    }
}
