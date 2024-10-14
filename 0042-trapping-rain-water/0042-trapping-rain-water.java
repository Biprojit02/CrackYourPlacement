class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n <= 2) return 0;

        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = 0;
        int leftMax = height[0];
        for(int i = 1; i<n; i++){
            left[i] = leftMax;
            leftMax = Math.max(leftMax, height[i]);
        }

        right[n-1] = 0; 
        int rightMax = height[n-1];
        for(int i = n-2; i>=0; i--){
            right[i] = rightMax;
            rightMax = Math.max(rightMax, height[i]);
        }

        int trapWater = 0;
        for(int i = 1; i<n; i++){
            if(height[i] < leftMax && height[i] < rightMax){
                trapWater += Math.min(leftMax, rightMax) - height[i];
            }
        }
        return trapWater;
    }
}