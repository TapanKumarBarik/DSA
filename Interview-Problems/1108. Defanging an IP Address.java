//https://leetcode.com/problems/defanging-an-ip-address/

class Solution {
    public String defangIPaddr(String address) {
      String res="";
        
        
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                res+="[.]";
            }
            else{
                res+=address.charAt(i);
            }
        }
        return res;
    }
}
