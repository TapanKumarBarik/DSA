//https://leetcode.com/problems/reverse-words-in-a-string/


class Solution {
    public String reverseWords(String s) {
        
        s=s.trim();
        
        int n=s.length();
        
        ArrayList<String>arr=new ArrayList();
        
        String temp="";
        
        for(int i=0;i<n;i++){
            
            if(s.charAt(i)==' '  && temp.length()!=0){
                
                arr.add(temp);
                temp="";
            }
            else if(s.charAt(i)==' ')continue;
            else {
                temp+=s.charAt(i);
            }
        }
        
        arr.add(temp);
        
        int m=arr.size();
        
        String res="";
        
        for(int i=m-1;i>0;i--){
            res+=arr.get(i);
            res+=" ";
            
        }
        res+=arr.get(0);
        
        return res;
        
    }
}
