Problem Description

Given a number A, we need to find sum of its digits using recursion.



Problem Constraints
1 <= A <= 109



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the sum of digits of the number A.



Example Input
Input 1:

 A = 46
Input 2:

 A = 11


Example Output
Output 1:

 10
Output 2:

 2


Example Explanation
Explanation 1:

 Sum of digits of 46 = 4 + 6 = 10
Explanation 2:

 Sum of digits of 11 = 1 + 1 = 2

   
   
   
   
   
   public class Solution {
    public int solve(int A) {
        //*************************************************************
        //Approach 1 start
        
        // int sum=0;
        
        // while(A>0){
        //     sum+=A%10;
        //     A=A/10;
        // }
        // return sum;
      
        //Approach 1 End
        //*************************************************************
        
        return sumOfDigits(A);
    }
    private int sumOfDigits(int a){
        
        if(a<10){
            return a;
        }
        
        return (a%10 + sumOfDigits(a/10));
        
    }
}







//**************************************************************************************************8

public class Solution {
    public int solve(int A) {
        if(A<10)return A;
        return (A%10 +solve(A/10));
    }
}

