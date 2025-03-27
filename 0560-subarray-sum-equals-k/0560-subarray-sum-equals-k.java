class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            int sum = 0;
            for(int j = i; j<nums.length; j++){
                sum += nums[j];
                // for(int b = i; b <= j; b++){
                //     sum += nums[b];
                // }
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}