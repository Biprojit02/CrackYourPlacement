class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            else{
                twoSum(nums, i+1, result, -nums[i]);
            }
        }
        return result;
    }

    public void twoSum(int[] nums, int k, List<List<Integer>> result, int target){
        int i = k;
        int j = nums.length - 1;
        while(i < j){
            //sum of two pointers
            int sum = nums[i] + nums[j];
            //check the sum is greater than the target or not
            if(sum < target){
                i++;
            }
            else if(sum > target){
                j--;
            }
            //if the sum is equal to target than add to the list
            else{
                result.add(Arrays.asList(nums[i], nums[j], -target));
                while(i<j && nums[i] == nums[i+1]) i++;
                while(i<j && nums[j] == nums[j-1]) j--;
                i++;
                j--;
            }
        }
    }
}
