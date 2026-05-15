class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int sell = prices[0];

        for (int i = 0; i < prices.length; i++) {
            maxP = Math.max(maxP, prices[i] - sell);
            sell = Math.min(sell, prices[i]);
        }

        return maxP;
    }
}
