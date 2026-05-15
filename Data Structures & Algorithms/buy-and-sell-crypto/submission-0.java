class Solution {
    public int maxProfit(int[] prices) {
        int buyIndex = 0;
        int sellIndex = 1;
        int profit = 0;

        while (sellIndex < prices.length) {
            if (prices[buyIndex] < prices[sellIndex]) {
                profit = Math.max(profit, prices[sellIndex] - prices[buyIndex]);
            } else {
                buyIndex = sellIndex;
            }

            sellIndex++;
        }

        return profit;
    }
}
