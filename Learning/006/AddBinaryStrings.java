public class Solution {
    public String addBinary(String A, String B) {
        
        
        StringBuilder sb=new StringBuilder();
        int i=A.length()-1;
        int j=B.length()-1;
        int carry=0;
        while(i>=0|| j>=0){
            
            
            
            if(i>=0){
                carry=carry+A.charAt(i)-'0';
            }
            if(j>=0){
                carry=carry+B.charAt(j)-'0';
            }
            
            int temp=carry%2;
            carry/=2;
            sb.append(temp);
            i--;
            j--;
            
        }
        
        if(carry!=0){
            sb.append(carry);
        }
        
        return sb.reverse().toString();
    }
}
