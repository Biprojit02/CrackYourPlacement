class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int i = 0;

        int minLength = Integer.MAX_VALUE;
        for(int j = 0; j<nums.length; j++){
            sum += nums[j];
            while(sum >= target){
                sum -= nums[i];
                minLength = Math.min((j - i)+1, minLength);
                i++;
            }

        }

        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        return minLength;
    }
}
