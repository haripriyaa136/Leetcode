class Solution {
    public int maxProfit(int[] prices) {
       int currentMin = prices[0];
       int MaxTillNow=0;
       
        for(int i=0;i<prices.length;i++){
            if(prices[i]<currentMin){
                currentMin=prices[i];
            }
            if(MaxTillNow<(prices[i]-currentMin)){
                MaxTillNow=prices[i]-currentMin;
            }

        }
        return MaxTillNow;
        
    }
}