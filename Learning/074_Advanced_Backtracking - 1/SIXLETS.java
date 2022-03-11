Problem Description
Given a array of integers A of size N and an integer B.

Return number of non-empty subsequences of A of size B having sum <= 1000.



Problem Constraints
1 <= N <= 20

1 <= A[i] <= 1000

1 <= B <= N



Input Format
The first argument given is the integer array A.

The second argument given is the integer B.



Output Format
Return number of subsequences of A of size B having sum <= 1000.



Example Input
Input 1:

    A = [1, 2, 8]
    B = 2
Input 2:

    A = [5, 17, 1000, 11]
    B = 4


Example Output
Output 1:

3
Output 2:

0


Example Explanation
Explanation 1:

 {1, 2}, {1, 8}, {2, 8}
Explanation 1:

 No valid subsequence
 
 
 
 
 
 
 
 //Optimal
 public class Solution {

    public int solve(int[] A, int B) {
        
        int sum=0;
        int start=0;
        return sixlets(A, start, sum, B);
    }
    
    private int sixlets(int a[], int i, int sum, int cnt) {
        if (sum > 1000) return 0;
           
        if (cnt == 0)return 1;
            
        if (i == a.length)return 0;
            
        // Take ith element or leave it.   
        return sixlets(a, i + 1, sum, cnt) + sixlets(a, i + 1, sum + a[i], cnt - 1);
    }
}
 
 
 
 
 
 
 
 
 //brut force Accepted solution
 public class Solution {
    
    int count;
    public int solve(ArrayList<Integer> A, int B) {
        
        count=0;
        int sum=0;
        solve(A, B, new ArrayList(), sum,0);
        return count;
        
    }
    
    private void solve(ArrayList<Integer>A, int B , ArrayList<Integer>temp, int sum,int start){
        
        if(temp.size()==B){
            if(   sum<=1000){
                count++;
                return ;
            }
        }
        
        for(int i=start;i<A.size();i++){
            
            temp.add(A.get(i));
            sum+=A.get(i);
            solve(A, B, temp, sum,i+1);
            
            sum-=A.get(i);
            
            temp.remove(temp.size()-1 );
        }
        
    }
}


 
