class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n =  cardPoints.length;

        int leftSum = 0;
        for(int i = 0; i<k; i++){
            leftSum += cardPoints[i];
        }

        int maxSum = leftSum;

        for(int i = 0; i<k; i++){
            leftSum = leftSum - cardPoints[k - 1 - i] + cardPoints[n - 1 - i];
            maxSum = Math.max(maxSum, leftSum);
        }
        return maxSum;
    }
}
