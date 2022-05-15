You have given an array A having N integers. Let say G is the product of all elements of A.

You have to find the number of distinct prime divisors of G.



Input Format

The first argument given is an Array A, having N integers.
Output Format

Return an Integer, i.e number of distinct prime divisors of G.
Constraints

1 <= N <= 1e5
1 <= A[i] <= 1e5
For Example

Input:
    A = [1, 2, 3, 4]
Output:
     2

Explanation:
    here G = 1 * 2 * 3 * 4 = 24
    and distinct prime divisors of G are [2, 3]












public class Solution {
    public int solve(ArrayList<Integer> A) {
        int max = Collections.max(A);
        ArrayList<ArrayList<Integer>> sieve = new ArrayList<>(max+1);
        for(int i=0;i<=max;i++)
            sieve.add(new ArrayList<>());
        
        for(int i=2;i<=max;i++){
            if(sieve.get(i).size()==0){
                sieve.get(i).add(i);
                for(int j=2*i;j<=max;j+=i){
                    sieve.get(j).add(i);
                }
            }
        }
        HashSet<Integer> se = new HashSet<>();
        for(int i=0;i<A.size();i++){
            
            if(A.get(i)<2) continue;
            
            for(Integer primes: sieve.get(A.get(i)))
                se.add(primes);
        }
        return se.size();
    }
}



