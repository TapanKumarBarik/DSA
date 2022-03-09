Problem Description

Given two integers arrays A and B of size N each.

Find the maximum N elements from the sum combinations (Ai + Bj) formed from elements in array A and B.



Problem Constraints
1 <= N <= 2 * 105

-1000 <= A[i], B[i] <= 1000



Input Format
First argument is an integer array A.
Second argument is an integer array B.



Output Format
Return an intger array denoting the N maximum element in descending order.



Example Input
Input 1:

 A = [1, 4, 2, 3]
 B = [2, 5, 1, 6]
Input 2:

 A = [2, 4, 1, 1]
 B = [-2, -3, 2, 4]


Example Output
Output 1:

 [10, 9, 9, 8]
Output 2:

 [8, 6, 6, 5]


Example Explanation
Explanation 1:

 4 maximum elements are 10(6+4), 9(6+3), 9(5+4), 8(6+2).
Explanation 2:

 4 maximum elements are 8(4+4), 6(4+2), 6(4+2), 5(4+1).
   
   
   
   
   
   
   
   
   
   
   
  public class Solution {
  public ArrayList < Integer > solve(ArrayList < Integer > A, ArrayList < Integer > B) {
      
    Collections.sort(A, Collections.reverseOrder());
    Collections.sort(B, Collections.reverseOrder());
    
    int n = A.size();

    PriorityQueue < Integer > pq = new PriorityQueue < > ();
    
    for (int i: A) {
      for (int j: B) {
        int s = i + j;
        
        if (pq.size() < n) {
          pq.add(s);
        } 
        else {
          if (s > pq.peek()) {
            pq.poll();
            pq.add(s);
          }
          else {
            break;
          }
        }
      }
    }

    ArrayList < Integer > ret = new ArrayList < > (pq);
    
    Collections.sort(ret, Collections.reverseOrder());
    
    return ret;
  }
}
 
   
   
   
   
   
 
  
  
   
   
   //Wrong code Passing only  test cases , brut force
   public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder() );
        
        ArrayList<Integer>arr=new ArrayList<>();
        
        int n=A.size();
        
        if(n==1){
            arr.add(A.get(0)+ B.get(0));
            return arr;
        }
        int mid=(n/2);
        Collections.sort(A);
        Collections.sort(B);
        
        
        for(int i=n-1;i>=mid-1;i--){
            
            for(int j=n-1;j>=mid-1;j--){
                
                pq.offer(A.get(i)+ B.get(j) );
            }
        }
        
        
        while(n!=0){
            
            arr.add(pq.poll() );
            n--;
        }
        
        return arr;
    }
}
