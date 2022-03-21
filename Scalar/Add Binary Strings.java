Problem Description

Given two binary strings, return their sum (also a binary string).
Example:

a = "100"

b = "11"
Return a + b = "111".
  
  
  
  public class Solution {
    public String addBinary(String A, String B) {
        
        StringBuilder sb=new StringBuilder();
        
        int m=A.length();
        
        int n=B.length();
        
        int i=m-1;
        int j=n-1;
        
        
        int carry=0;
        while(i>=0 && j>=0){
            int sum=A.charAt(i)-'0';
            sum+=B.charAt(j)-'0';
            sum+=carry;
            
            sb.append(sum%2);
            
            carry=sum/2;
            
            i--;
            j--;
        }
        
        while(i>=0){
            int sum=A.charAt(i)-'0';
            sum+=carry;
            
            sb.append(sum%2);
            
            carry=sum/2;
            
            i--;
            
        }
        
        while(j>=0){
            int sum=B.charAt(j)-'0';
            sum+=carry;
            
            sb.append(sum%2);
            
            carry=sum/2;
            
            j--;
            
        }
        
        if(carry!=0){
            sb.append(carry);
        }
        
        return sb.reverse().toString();
    }
}
