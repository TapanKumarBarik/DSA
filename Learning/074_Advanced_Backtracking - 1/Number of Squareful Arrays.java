Problem Description

Given an array of integers A, the array is squareful if for every pair of adjacent elements, their sum is a perfect square.

Find and return the number of permutations of A that are squareful. Two permutations A1 and A2 differ if and only if there is some index i such that A1[i] != A2[i].



Problem Constraints
1 <= length of the array <= 12

1 <= A[i] <= 109



Input Format
The only argument given is the integer array A.



Output Format
Return the number of permutations of A that are squareful.



Example Input
Input 1:

 A = [2, 2, 2]
Input 2:

 A = [1, 17, 8]


Example Output
Output 1:

 1
Output 2:

 2


Example Explanation
Explanation 1:

 Only permutation is [2, 2, 2], the sum of adjacent element is 4 and 4 and both are perfect square.
Explanation 2:

 Permutation are [1, 8, 17] and [17, 8, 1].
   
   
   
   
   
   
   
   
   
   
   
   public class Solution {
    int ans = 0;
    public int solve(int[] nums) {
        
        if(nums.length==1){
            return 0;
        }
        Arrays.sort(nums);
        backtrack(nums, new boolean[nums.length], new ArrayList());
        return ans;
    }
     private void backtrack(int[] nums, boolean visited[], List<Integer> temp) {
        if(temp.size() == nums.length) {
            ans++;
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            
            if(i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
            
            if(visited[i]) continue;
            
            if(temp.size() > 0) {
                int sum = temp.get(temp.size() - 1) + nums[i];
                if(!perfectSquare(sum)) {
                    continue;
                }
            }
            visited[i] = true;
            temp.add(nums[i]);
            backtrack(nums, visited, temp);
            visited[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
    
    private boolean perfectSquare(int sum) {
        int sqrt = (int) Math.sqrt(sum);
        return sum - (sqrt*sqrt) == 0;
    }
}
