

Problem Description

You are given N towns (1 to N). All towns are connected via unique directed path as mentioned in the input.

Given 2 towns find whether you can reach the first town from the second without repeating any edge.

B C : query to find whether B is reachable from C.

Input contains an integer array A of size N and 2 integers B and C ( 1 <= B, C <= N ).

There exist a directed edge from A[i] to i+1 for every 1 <= i < N. Also, it's guaranteed that A[i] <= i.

NOTE: Array A is 0-indexed.



Problem Constraints
1 <= n <= 100000



Input Format
First argument is vector A

Second argument is integer B

Third argument is integer C



Output Format
Return 1 if reachable, 0 otherwise.



Example Input
Input 1:

 A = [1, 1, 2]
 B = 1
 C = 2
Input 2:

 A = [1, 1, 2]
 B = 2
 C = 1


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 Tree is 1--> 2--> 3 and hence 1 is not reachable from 2.
Explanation 2:

 Tree is 1--> 2--> 3 and hence 2 is reachable from 1.


   
   
   
   public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(int[] A, final int B, final int C) {
        
    if(B==C)return 1;
    ArrayList<ArrayList<Integer>>adj=new ArrayList();
    
    int[]isVisted=new int[A.length+1];
    
    for(int i=0;i<=A.length;i++){
        adj.add(new ArrayList() );
    }
    
    //
    
    for(int i=0;i<A.length;i++){
        
         ArrayList<Integer>curr=adj.get(A[i]);
            curr.add(i+1);
            adj.set(A[i], curr ) ;
    }
    
    
    Queue<Integer>q=new LinkedList();
    
    if(adj.get(C).size()==0)return 0;
    
    for(int i=0;i<adj.get(C).size();i++){
        q.offer(adj.get(C).get(i));
    }
    
    
    
    while(!q.isEmpty()){
        
        int curr=q.poll();
        
        if(curr==B)return 1;
        ArrayList<Integer>temp=adj.get(curr);
            for(int i=0;i<temp.size();i++ ){
                q.offer(temp.get(i) );
            }
    }
    
    // for(int i=0;i<adj.size();i++){
        
    //     System.out.println(adj.get(i));
    // }
    
    return 0;
        
    }
}




//
