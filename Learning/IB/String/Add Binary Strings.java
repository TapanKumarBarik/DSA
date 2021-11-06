Problem Description

Given two binary strings, return their sum (also a binary string).
Example:

a = "100"


b = "11"
Return a + b = "111".





  
  
  public class Solution {
    public String addBinary(String A, String B) {


        int i=A.length()-1;

        int j=B.length()-1;

        StringBuilder sb =new StringBuilder();
      int temp=0;
        while(i>=0 || j>=0){


        if(i>=0){
       temp+=A.charAt(i)-'0';
        }
        if(j>=0){
       temp+=B.charAt(j)-'0';
        }

      int t=temp%2;
      sb.append(t);
       i--;
       j--;
       temp/=2;
        }

        //
        if(temp!=0){
               sb.append(temp);
        }
        return sb.reverse().toString();
    }
}
