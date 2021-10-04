
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     
       List<Boolean> ans = new ArrayList<>(candies.length);
        
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        
        for(int j=0;j<candies.length;j++){
          
                ans.add(candies[j]+extraCandies>=max);
           
        }
        
        return ans;
        
    }
}
