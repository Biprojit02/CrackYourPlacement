class Solution {
    public int maxProfit(int[] prices) {
        int i = 1;
        int j = 0;
        int profit = 0;
        while(i < prices.length){
            if(prices[i] > prices[j]){
                profit += prices[i] - prices[j];
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        return profit;
    }
}