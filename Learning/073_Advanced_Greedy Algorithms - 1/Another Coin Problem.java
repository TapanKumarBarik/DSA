Problem Description
The monetary system in DarkLand is really simple and systematic. The locals only use coins. The coins come in different values. The values used are:

 1, 5, 25, 125, 625, 3125, 15625, ...
Formally, for each K >= 0 there are coins worth 5K.

Given an integer A denoting the cost of an item, find and return the smallest number of coins necessary to pay exactly the cost of the item (assuming you have a sufficient supply of coins of each of the types you will need).



Problem Constraints
1 <= A <= 2*109



Input Format
The only argument given is integer A.



Output Format
Return the smallest number of coins necessary to pay exactly the cost of the item.



Example Input
Input 1:

 A = 47
Input 2:

 A = 9


Example Output
Output 1:

 7
Output 2:

 5


Example Explanation
Explanation 1:

 Representation of 7 coins will be : (1 + 1 + 5 + 5 + 5 + 5 + 25).
Explanation 2:

 Representation of 5 coins will be : (1 + 1 + 1 + 1 + 5).


//optimal
   
   
   public class Solution {
  public int solve(int A) {
    ArrayList < Integer > v = new ArrayList < Integer > ();

    int val = 1;

    // Storing all denominations of coins
    while (val <= A) {
      v.add(val);
      val = val * 5;
    }
    // Sort in decreasing order
    Collections.reverse(v);

    int ans = 0;
    // Loop from the largest denomination
    for (int i = 0; i < v.size(); i++) {
      ans += A / v.get(i);
      A = A % v.get(i);
    }
    return ans;
  }
}

   
   
   
   
   //Brut force
   public class Solution {
    public int solve(int A) {
        
        ArrayList<Integer>arr=new ArrayList();
        
        if(A==0)return 0;
        
        if(A<5)return A;
        if(A==5)return 1;
        
        int count=0;
        
        int fiveProduct=5;
        arr.add(1);
        arr.add(5);
        
        while(fiveProduct*5<=A){
            
            fiveProduct=fiveProduct*5;
            arr.add(fiveProduct);
        }
        
        
        //calculate
        int n=arr.size();
        for(int i=n-1;i>=0;i--){
            
            if(A==0)break;
            int curr=arr.get(i);
            // System.out.println(A);
            int k=1;
                while(curr+arr.get(i)<=A ){
                    
                    curr+=arr.get(i);
                    k++;
                    
                }
            if(k==1){
                
                if(A>=curr){
                     count+=k;
                    A=A-curr;
                }
            }
            else{
                 count+=k;
                A=A-curr;
            }
                
        }
        
        return count;
    }
}
