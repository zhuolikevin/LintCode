/**
 * Created by Kevin on 11/29/16.
 * 150. Best Time to Buy and Sell Stock II
 */
public class BestTimeToBuyAndSellStock2 {
  /**
   * @param prices: Given an integer array
   * @return: Maximum profit
   */
  public int maxProfit(int[] prices) {
    if (prices.length <= 1) { return 0; }
    int profit = 0;
    for (int i = 0; i < prices.length - 1; i++) {
      if (prices[i + 1] > prices[i]) {
        profit += prices[i + 1] - prices[i];
      }
    }
    return profit;
  }
}
