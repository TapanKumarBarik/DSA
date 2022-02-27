//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/


class Solution {
    public int maxProfit(int[] prices) {
        
        
        int profit=0;
        int maxprofit=0;
        int curr=prices[0];
        
        for(int i=1;i<prices.length;i++){
            
            if(prices[i]>curr){
                profit=prices[i]-curr;
                
            }
            
            else if(prices[i]<curr){
                curr=prices[i];
            }
            
            maxprofit=Math.max(profit,maxprofit);
            
        }
        return maxprofit;
    }
}
