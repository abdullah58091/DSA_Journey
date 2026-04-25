package com.company.Arrays.Practice_Easy;


public class BestTimeTBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int minprices = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int j = 0; j < prices.length; j++) {
            if (prices[j] < minprices) {
                minprices = prices[j];
            } else {
                int profit = prices[j] - minprices;
                maxprofit = Math.max(maxprofit, profit);
            }
        }

        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println("Max Profit: " + result);
    }
}

