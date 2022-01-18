Problem Description

Given an array A of length N. You have to answer Q queires.

Each query will contain 4 integers l1, r1, l2 and r2. If sorted segment from [l1, r1] is same as sorted segment from [l2 r2] then answer is 1 else 0.

NOTE The queries are 0-indexed.



Problem Constraints
0 <= A[i] <= 100000
1 <= N <= 100000
1 <= Q <= 100000



Input Format
First argument is an array A.
Second will be 2-D array B denoting queries with dimension Q * 4.
Consider ith query as l1 = B[i][0], r1 = B[i][1], l2 = A[i][2], r2 = B[i][3].



Output Format
Return an array of length Q with answer of the queries in the same order in input.



Example Input
Input 1:

 A = [1, 7, 11, 8, 11, 7, 1]
 B = [ 
       [0, 2, 4, 6]
     ]
Input 2:

 A = [1, 3, 2]
 B = [
       [0, 1, 1, 2]
     ] 


Example Output
Output 1:

 [1]
Output 2:

 [0]


Example Explanation
Explanation 1:

 (0, 2) -> [1, 7, 11]
 (4, 6) -> [11, 7, 1]
 Both are same when sorted hence 1.
Explanation 2:

 (0, 1) -> [1, 3]
 (1, 2) -> [3, 2] 
 Both are different when sorted hence -1.

   
   
   
   //Optimal
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        
        
        int n=A.size();
        Random rd=new Random();
        HashMap<Integer,Long>hm=new HashMap();
        HashSet<Long>used=new HashSet();
        
        long []psum=new long[n+1];
        
        for(int i=0;i<n;i++){
            
            if(!hm.containsKey(A.get(i))){
                long hash=rd.nextLong();
                while(used.contains(hash)){
                    hash=rd.nextLong();
                }
                hm.put(A.get(i),hash);
            }
            psum[i+1]=psum[i]+hm.get(A.get(i));
            
        }
        
        
        ArrayList<Integer>ans=new ArrayList();
        
        for(ArrayList<Integer>temp:B){
            long val1=psum[temp.get(1)+1]-psum[temp.get(0)];
             long val2=psum[temp.get(3)+1]-psum[temp.get(2)];
             
             
             if(val1==val2){
                 ans.add(1);
             }
             else{
                 ans.add(0);
             }
        }
        
        return ans;
    }
}



   
   
   
   
   
   
   
   
   //Brut force
   
   public class Solution {
    public int[] solve(int[] A, int[][] B) {
        
        ArrayList<Integer>list=new ArrayList();
        
        for(int i=0;i<B.length;i++){
            boolean oneORZero=false;
            for(int j=0;j<4;j++){
                
                int s1=B[i][0];
                int s2=B[i][1];
                
                int []arr=new int[s2-s1+1];
                for(int p=0;p<arr.length;p++){
                    arr[p]=A[p+s1];
                }
                Arrays.sort(arr);
                String s="";
                
                for(int n=0;n<arr.length;n++){
                    s+=arr[n];
                    s+=",";
                }
                
                //for 2nd item;
                
                
                int s3=B[i][2];
                int s4=B[i][3];
                
                int []arr1=new int[s4-s3+1];
                for(int m=0;m<arr1.length;m++){
                    arr1[m]=A[m+s3];
                }
                Arrays.sort(arr1);
                String k="";
                
                for(int a=0;a<arr1.length;a++){
                    k+=arr1[a];
                    k+=",";
                }
                if(s.equals(k)){
                   // list.add(1);
                    oneORZero=true;
                }
                else{
                    //list.add(0);
                    oneORZero=false;
                }
                
            }
            
            //
            if(oneORZero)list.add(1);
            else{
                list.add(0);
            }
        }
        //returen
        int[]returnArr=new int[list.size()];
        for(int i=0;i<returnArr.length;i++){
            returnArr[i]=list.get(i);
        }
        return returnArr;
    }
}







//
