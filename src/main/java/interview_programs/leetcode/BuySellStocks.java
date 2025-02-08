package interview_programs.leetcode;

public class BuySellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};  // Example input

        int minPrice = Integer.MAX_VALUE;  // Initialize minimum price
        int maxProfit = 0;  // Initialize max profit

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  // Update min price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);  // Update max profit
            }
        }

        System.out.println(maxProfit);  // Print the max profit
    }
}
