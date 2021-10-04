
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
     
        
       int count=0;
        
        for(int i=0;i<items.size();i++){
                    
                if(ruleKey.equals("type")){
                    if(items.get(i).get(0).equals(ruleValue)){
                        count++;   } 
            }
                    else  if(ruleKey.equals("color")){
                    if(items.get(i).get(1).equals(ruleValue)){
                        count++;   } 
            }
                        else if(ruleKey.equals("name")){
                    if(items.get(i).get(2).equals(ruleValue)){
                        count++;  }  
            }
       
                        
}
        
        
 
        return count;
    }
}
