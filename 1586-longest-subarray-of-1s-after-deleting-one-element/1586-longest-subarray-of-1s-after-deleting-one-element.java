class Solution {
    public int longestSubarray(int[] nums) {
        int start = 0;
        int length = nums.length;
        int zeros = 0;
        int ans = 0;

        for(int end = 0; end<length; end++){
            if(nums[end] == 0){
                zeros++;
            }

            while(zeros > 1){
                if(nums[start] == 0){
                    zeros--;
                }
                start++;
            }
            ans = Math.max(ans, end - start + 1 - zeros);
        }
        return (ans == length)?ans-1 : ans;
    }
}