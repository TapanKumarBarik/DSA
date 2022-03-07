Problem Description

A sorted array of integers, A contains 1, plus some number of primes. Then, for every p < q in the list, we consider the fraction p/q.

What is the B-th smallest fraction considered?

Return your answer as an array of integers, where answer[0] = p and answer[1] = q.



Problem Constraints
1 <= length(A) <= 2000
1 <= A[i] <= 30000
1 <= B <= length(A)*(length(A) - 1)/2



Input Format
The first argument of input contains the integer array, A.
The second argument of input contains an integer B.



Output Format
Return an array of two integers, where answer[0] = p and answer[1] = q.



Example Input
Input 1:

 A = [1, 2, 3, 5]
 B = 3
Input 2:

 A = [1, 7]
 B = 1


Example Output
Output 1:

 [2, 5]
Output 2:

 [1, 7]


Example Explanation
Explanation 1:

 The fractions to be considered in sorted order are:
 [1/5, 1/3, 2/5, 1/2, 3/5, 2/3]
 The third fraction is 2/5.
Explanation 2:

 The fractions to be considered in sorted order are:
 [1/7]
 The first fraction is 1/7.



×
You only need to implement the given function. Do n










//Brut force

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        
        HashMap<Double , ArrayList<Integer>>map=new HashMap<>();

        PriorityQueue<Double>pq=new PriorityQueue<>();
        
        int n=A.size();
        
        for(int i=0;i<n;i++){
            
            for(int j=n-1;j>i;j--){
                
                double temp=( (double)A.get(i)/ (double)A.get(j));
                 // System.out.println(temp);
                pq.offer(temp);
                ArrayList<Integer>arr=new ArrayList<>();
                arr.add(A.get(i));
                arr.add(A.get(j) );
                map.put(temp , arr);
                //null , <>
                
            }
        }

        //while(pq.size()>0 ){
         //   System.out.println(pq.poll() );
       // }
        while(B>1)
        {
            pq.poll();
            B--;
        }

    // ArrayList<Integer>arr=new ArrayList<>();
    // return arr;
        
        return map.get(pq.poll() );
    }
}



//s1-insert all num with denom n-1;
//s2 poll
//s1-insert all num with denom n-2;
//s2 poll

// b times

//1 2 3 122121
