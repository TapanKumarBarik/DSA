Problem Description

Given two arrays A and B of size N. A[i] represents the time by which you can buy ith car without paying any money.

B[i] represents the profit you can earn by buying ith car. It takes 1 minute to buy a car so, you can only buy the ith car when the current time <= A[i] - 1.

Your task is to find maximum profit one can earn by buying cars considering that you can only buy one car at a time.

NOTE:

You can stary buying from time = 0.
Return you answer modulo 109 + 7.


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109
0 <= B[i] <= 109



Input Format
First argument is an integer array A represents the deadline of buying the cars.
Second argument is an integer array B represents the profit obtained after buying the cars.



Output Format
Return an integer denoting the maximum profit you can earn.



Example Input
Input 1:

 A = [1, 3, 2, 3, 3]
 B = [5, 6, 1, 3, 9]
Input 2:

 A = [3, 8, 7, 5]
 B = [3, 1, 7, 19]


Example Output
Output 1:

 20
Output 2:

 30


Example Explanation
Explanation 1:

 At time 0, buy car with profit 5.
 At time 1, buy car with profit 6.
 At time 2, buy car with profit 9.
 At time = 3 or after , you can't buy any car, as there is no car with deadline >= 4.
 So, total profit that one can earn is 20.
Explanation 2:

 At time 0, buy car with profit 3.
 At time 1, buy car with profit 1.
 At time 2, buy car with profit 7.
 At time 3, buy car with profit 19.
 We are able to buy all cars within their deadline. So, total profit that one can earn is 30.

   
   
   
   
   
   
   
   
   
   
   
   
   
   public class Solution {
    
    class Pair implements Comparable<Pair>{
        
        int a;
        int b;
        
        public Pair(int a, int b){
            this.a=a;
            this.b=b;
        }
        public int compareTo(Pair p){
            
            if(p.a==this.a){
                
                return p.b-this.b;
            }
            else{
                return this.a-p.a;
            }
        }
            
    }
    public int solve(int[] A, int[] B) {
        
        int n=A.length;
        
        Pair []arr=new Pair[n];
        
        for(int i=0;i<n;i++){
            
            arr[i]=new Pair(A[i],B[i]);
        }
        Arrays.sort(arr);
        //Arrays.sort(arr,(o1,o2)->o1.a-o2.a);
        
        int count =0;
        PriorityQueue<Integer>pq=new PriorityQueue();
        
        
        // for(Pair i:arr){
        //     System.out.println(i.a+" "+i.b);
        // }
        
        
        int indexTime=0;
        for(int i=0;i<n;i++){
            int curr=arr[i].a;
            if(curr>indexTime){
                
                pq.offer(arr[i].b);
                indexTime++;
            }
            else if(arr[i].b>pq.peek()){
                
                pq.poll();
                pq.offer(arr[i].b);
            }
            
        }
       int mod=1000000007;
        while(!pq.isEmpty()){
            count+=pq.poll();
            count%=mod;
        }
        return count;
    }
}
