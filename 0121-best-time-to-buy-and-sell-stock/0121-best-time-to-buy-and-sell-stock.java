class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfite = 0;
        for(int i = 0; i<prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            int diff = prices[i] - minPrice;
            maxProfite = Math.max(maxProfite, diff);
        }
        return maxProfite;
    }
}