class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyPrice = prices[0];
        int currentProfit = 0;
        int maxProfit = 0;
        for(int i = 0; i < n; i++) {
            if(prices[i]<buyPrice) buyPrice = prices[i];
            currentProfit = prices[i]-buyPrice;
            if(currentProfit>maxProfit) maxProfit = currentProfit;
        }
        return maxProfit;
    }
}