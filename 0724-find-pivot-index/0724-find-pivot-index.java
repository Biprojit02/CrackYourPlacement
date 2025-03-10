class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i<nums.length; i++){
            rightSum += nums[i];
        }

        for(int i = 0; i<nums.length; i++){
            int currSum = nums[i];
            rightSum -= currSum;

            if(rightSum == leftSum){
                return i;
            }

            leftSum += currSum;
        }
        return -1;
    }
}