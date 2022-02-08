Problem Description

An arithmetic expression is given by a charater array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each character may be an integer or an operator.



Problem Constraints
1 <= N <= 105



Input Format
The only argument given is character array A.



Output Format
Return the value of arithmetic expression formed using reverse Polish Notation.



Example Input
Input 1:
    A =   ["2", "1", "+", "3", "*"]
Input 2:
    A = ["4", "13", "5", "/", "+"]


Example Output
Output 1:
    9
Output 2:
    6


Example Explanation
Explaination 1:
    starting from backside:
    * : () * ()
    3 : () * (3)
    + : (() + ()) * (3)
    1 : (() + (1)) * (3)
    2 : ((2) + (1)) * (3)
    ((2) + (1)) * (3) = 9
Explaination 2:
    + : () + ()
    / : () + (() / ())
    5 : () + (() / (5))
    1 : () + ((13) / (5))
    4 : (4) + ((13) / (5))
    (4) + ((13) / (5)) = 6

      
      
      
      
      
      
      
      
      public class Solution {
    public int evalRPN(String[] A) {
        
        Stack<Integer>st=new Stack();
        
        int res=0;
        
        for(int i=0;i<A.length;i++){
            
            String temp=A[i];
            
            if(temp.equals("+") || temp.equals("-")  || temp.equals("/")  || temp.equals("*") ){
                
                int num1=st.peek();
                st.pop();
                int num2=st.peek();
                st.pop();
                int tempRes=0;
                
                if(temp.equals("+") ){
                    tempRes=num1+num2;
                }
                 else if(temp.equals("-") ){
                    tempRes=num2-num1;
                }
                 else if(temp.equals("*") ){
                    tempRes=num1*num2;
                }
                else{
                    tempRes=num2/num1;
                }
                
                st.push(tempRes);
            }
            
            else{
                 int tempv=Integer.parseInt(A[i]);  
                st.push(tempv);
            }
            
        }
        return st.peek();
    }
}
