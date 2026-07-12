class Solution {

    public int maxProfit(int[] prices) {

        int maximumProfit = 0;
        int minimumBuyingPrice = prices[0];

        for (int day = 1; day < prices.length; day++) {

            if (prices[day] > minimumBuyingPrice) {

                maximumProfit = Math.max(maximumProfit,
                                         prices[day] - minimumBuyingPrice);
            }
            
            minimumBuyingPrice = Math.min(minimumBuyingPrice, prices[day]);
        }

        return maximumProfit;
    }
}