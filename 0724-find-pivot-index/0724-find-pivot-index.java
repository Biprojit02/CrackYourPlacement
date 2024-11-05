class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = IntStream.of(nums).sum();

        for(int i = 0; i<nums.length; i++){
            int currNum = nums[i];
            rightSum -= currNum;
            if(rightSum == leftSum){
                return i;
            } 

            leftSum += currNum;
        }
        return -1;
    }
}