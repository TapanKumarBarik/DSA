public class Solution {
    public int titleToNumber(String A) {
        
        int n=A.length();
        
        int res=0;
        
        for(int i=0;i<n;i++){
    
            
            int temp=A.charAt(i)-'A'+1;
            res=res*26+temp;
        }
        return res;
    }
}
