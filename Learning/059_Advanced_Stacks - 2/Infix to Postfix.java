Problem Description

Given string A denoting an infix expression. Convert the infix expression into postfix expression.

String A consists of ^, /, *, +, -, (, ) and lowercase english alphabets where lowercase english alphabets are operands and ^, /, *, +, - are operators.

Find and return the postfix expression of A.

NOTE:

^ has highest precedence.
/ and * have equal precedence but greater than + and -.
+ and - have equal precedence and lowest precedence among given operators.


Problem Constraints
1 <= length of the string <= 500000



Input Format
The only argument given is string A.



Output Format
Return a string denoting the postfix conversion of A.



Example Input
Input 1:

 A = "x^y/(a*z)+b"
Input 2:

 A = "a+b*(c^d-e)^(f+g*h)-i"


Example Output
Output 1:

 "xy^az*/b+"
Output 2:

 "abcd^e-fgh*+^*+i-"


Example Explanation
Explanation 1:

 Ouput dentotes the postfix expression of the given input.




   
   
   //create stack
   //create stringBuilder 
   
   iterate the string
     if the current character is a letter or digit  add it to string builder
     else if it is '(' add it to stack
     else if it is ')' 
           pop items till it is !='(' and stack is not empty then pop and add to string builder  a and at last pop
     else 
        while stack is not empty && prec(c)<=prec(peek())
           pop the item and add to string
        after loop push the char;
     

after the iterator is over 

while stack builder is not empty till then pop and add to string


//utility function

if it is + or - return 1;

if it is * or / return 2;

if it is ^ return 3
  
  else return -1;










public class Solution {
    public String solve(String exp) {
        
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
         
        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);
            // If the scanned character is an operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result.append(c);
              
            // If the scanned character is an '(',  push it to the stack.
            else if (c == '(')
                stack.push(c);
             
            //  If the scanned character is an ')', pop and output from the stack until an '(' is encountered.
            else if (c == ')')
            {
                while (!stack.isEmpty() && stack.peek() != '(')
                     {
                         result.append(stack.pop());
                     }
                    stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){
                   result.append(stack.pop());
             }
                stack.push(c);
            }
        }
        // pop all the operators from the stack
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
           result.append(stack.pop());
         }
        return result.toString();
        
    }

    private int Prec(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;
      
        case '*':
        case '/':
            return 2;
      
        case '^':
            return 3;
        }
        return -1;
    }
}

