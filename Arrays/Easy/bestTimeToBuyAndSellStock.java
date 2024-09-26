package Easy;

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int miniPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++) {
            miniPrice = Math.min(miniPrice,prices[i]);
            profit = Math.max(profit,prices[i] - miniPrice);
        }
        return profit;
    }
}
