public class AppleStocks {
    public static void main(String[] args) {

        int[] stockPrices = {15, 10, 9, 8, 7, 9, 6};
        if (stockPrices.length < 2) {
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }
        int min = stockPrices[0];
        int max_profit = stockPrices[1] - stockPrices[0];
        for (int i = 1; i < stockPrices.length; i++) {
            int potential_profit = stockPrices[i] - min;
            max_profit = Math.max(potential_profit, max_profit);
            min = Math.min(stockPrices[i], min);
        }
//        return max_profit;
    }
}