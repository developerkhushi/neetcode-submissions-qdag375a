class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int maxElement = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            int currProfit = maxElement - prices[i];
            if (currProfit > maxProfit) maxProfit = currProfit;
            if (prices[i] > maxElement) maxElement = prices[i];
        }

        return maxProfit;
    }
}
