class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int miniLength = Integer.MAX_VALUE;
        while(j < nums.length){
            sum += nums[j];
            while(sum >= target){
                sum -= nums[i];
                miniLength = Math.min((j - i)+1, miniLength);
                i++;
            }
            j++;
        }
        if(miniLength == Integer.MAX_VALUE){
            return 0;
        }
        return miniLength;
    }
}