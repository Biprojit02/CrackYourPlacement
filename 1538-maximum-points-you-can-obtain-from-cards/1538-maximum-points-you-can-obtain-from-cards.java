class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        
        // Calculate the sum of the first `k` cards from the left.
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += cardPoints[i];
        }
        
        // Initialize maxSum to the currentSum.
        int maxSum = currentSum;
        
        // Slide the window from the end of the array to the start of the first k cards.
        for (int i = 0; i < k; i++) {
            currentSum = currentSum - cardPoints[k - 1 - i] + cardPoints[n - 1 - i];
            maxSum = Math.max(maxSum, currentSum);
        }
        
        return maxSum;
    }
}
