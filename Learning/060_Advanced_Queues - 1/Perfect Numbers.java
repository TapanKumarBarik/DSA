Problem Description

Given an integer A, you have to find the Ath Perfect Number.

A Perfect Number has the following properties:

It comprises only 1 and 2.

The number of digits in a Perfect number is even.

It is a palindrome number.

For example 11, 22, 112211 are Perfect numbers, where 123, 121, 782, 1 are not.



Problem Constraints
1 <= A <= 100000



Input Format
The only argument given is an integer A.



Output Format
Return a string that denotes the Ath Perfect Number.



Example Input
Input 1:

 A = 2
Input 2:

 A = 3


Example Output
Output 1:

 22
Output 2:

 1111


Example Explanation
Explanation 1:

First four perfect numbers are:
1. 11
2. 22
3. 1111
4. 1221
Explanation 2:

First four perfect numbers are:
1. 11
2. 22
3. 1111
4. 1221

  
  
  
  
  
  public class Solution {
    public String solve(int A) {
        
        Queue<String>q=new ArrayDeque();
        ArrayList<String>arr=new ArrayList();
        
        q.add("1");
        q.add("2");
        arr.add("1");
        arr.add("2");
        
        int count=2;
        count++;
        
        while(count<=A){
            String temp=q.peek();
            
          if(count%2==0){
            q.add(temp+2);
            arr.add(temp+2);
            q.remove();
          }
          else{
           q.add(temp+1);//1,2,11
           arr.add(temp+1);
          }
            count++;
        }
        return arr.get(A-1) +reverse(arr.get(A-1));
    }
    
    
    private String reverse(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
}
