class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0;
        int j = n - 1;
        int maxArea = 0;

        while(i<j){
            int w = j - i;
            int h = Math.min(heights[i], heights[j]);

            int area = w * h;
            maxArea = Math.max(maxArea, area);

            if(heights[i] > heights[j]){ 
                j--;
            }else{
                i++;
            }
        }
        return maxArea;
    }
}
