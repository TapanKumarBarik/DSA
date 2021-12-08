Problem Description

Given two Integers A, B. You have to calculate (A ^ (B!)) % (1e9 + 7).

"^" means power ,

"%" means "mod", and

"!" means factorial.



Problem Constraints
1 <= A, B <= 5e5



Input Format
First argument is the integer A

Second argument is the integer B



Output Format
Return one integer, the answer to the problem



Example Input
Input 1:

A = 1
B = 1
Input 2:

A = 2
B = 2


Example Output
Output 1:

1
Output 2:

4


Example Explanation
Explanation 1:

 1! = 1. Hence 1^1 = 1.
Explanation 2:

 2! = 2. Hence 2^2 = 4.
   
   
   
   
   
   
   public class Solution {
    public int solve(int A, int B) {
        
        long mod=(long) (1e9 + 7);
        
        long a=(long)A%mod;
        
        
        long b=calculateFactorial(B,mod-1);
        
        
        long res=calculateRes(a,b,mod);
        
      
        
        return (int) res;
    }
    //B! % (mod-1)=b
    //Foramts little Theorem
    //If i have to apply  mod to the power we must do % with  mod-1;
    private long calculateFactorial(int B,long m){
        
        long res=1;
        
        while(B>0){
            
            res=(res*B)%m;
            B--;
        }
        return res;
    }
    
    
    //
    private long calculateRes(long a,long b,long mod){
        if(a==0){
            return 0;
        }
        if(b==0){
            return 1;
        }
        long y=0;
        if(b%2==0){
            y=calculateRes(a,b/2,mod);
            y=(y*y)%mod;
        }
        else{
             y=calculateRes(a,b/2,mod);
              y=a*((y*y)%mod)%mod;
        }
        return (y+mod)%mod;
    }
}
