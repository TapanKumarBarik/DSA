

https://practice.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/1/#



class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        
        
        // code here
        
        int[]arr=new int [N+1];
        
         ArrayList<Integer>list=new ArrayList();
        for(int i=2;i<N+1;i++){
            int j=i;
                if (arr[i] != -1  && i>=M) {
                list.add(i);
            }
            while(j<=N){
                arr[j]=-1;
                j+=i;
            }
        }

        return list;
    }
}
