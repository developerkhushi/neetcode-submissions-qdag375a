class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int maxElement = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            int profit = maxElement - prices[i];
            maxElement = Math.max(maxElement, prices[i]);
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
