Problem Statement
You are given an array of integers 'ARR' of length 'N' and an integer Target. Your task is to return all pairs of elements such that they add up to Target.
Note:
We cannot use the element at a given index twice.
Follow Up:
Try to do this problem in O(N) time complexity. 
Input Format:
The first line of input contains an integer ‘T’ denoting the number of test cases to run. Then the test case follows.

The first line of each test case contains two single space-separated integers ‘N’ and ‘Target’ denoting the number of elements in an array and the Target, respectively.

The second line of each test case contains ‘N’ single space-separated integers, denoting the elements of the array.
Output Format :
For each test case, print a single line containing space-separated integers denoting all pairs of elements such that they add up to the target. A pair (a, b) and (b, a) is the same, so you can print it in any order.

Each pair must be printed in a new line. If no valid pair exists, print a pair of (-1, -1). Refer to sample input/output for more clarity.
Note:
You do not need to print anything; it has already been taken care of. Just implement the given function.
Constraints:
1 <= T <= 100
1 <= N <= 5000
-10 ^ 9 <= TARGET <=10 ^ 9
-10 ^ 9 <= ARR[i] <=10 ^ 9

Where 'T' denotes the number of test cases, 'N' represents the size of the array, 'TARGET' represents the sum required, and 'ARR[i]' represents array elements.

Time Limit: 1 sec.
Sample Input 1 :
2
4 9
2 7 11 13
5 1
1 -1 -1 2 2
Sample Output 1:
2 7
-1 2
-1 2
Explanation For Sample 1:
For the first test case, we can see that the sum of  2 and 7 is equal to 9 and it is the only valid pair.

For the second test case, there are two valid pairs (-1,2) and (-1,2), which add up to 1.
Sample Input 2 :
1
4 16
2 7 11 13
Sample Output 2 :
-1 -1
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  import java.util.*;

public class Solution {
	static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
		// Write your code here.
        
         Collections.sort(arr);

       ArrayList<Pair<Integer, Integer>> ans = new ArrayList<>();

       int a_point = 0, b_point = n -1;

       

       while(a_point < b_point){

           if(arr.get(a_point) + arr.get(b_point) == target){

               Pair<Integer, Integer> pair = new Pair<>(arr.get(a_point),arr.get(b_point));

               ans.add(pair);

               a_point++;

               b_point--;

           }

           else if(arr.get(a_point) + arr.get(b_point) > target){

               b_point--;

           }

           else{

               a_point++;

           }

       }

       if(ans.size() == 0){

           Pair<Integer, Integer> pair = new Pair<>(-1,-1);

           ans.add(pair);

       }

       return ans;
	}
}
