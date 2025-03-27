class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3){
            return new ArrayList<>();
        }

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
        int start = k;
        int end = nums.length - 1;
        while(start < end){
            int sum = nums[start] + nums[end];
            if(sum < target){
                start++;
            }
            else if(sum > target){
                end--;
            }
            else{
                result.add(Arrays.asList(nums[start], nums[end], -target));
                while(start < end && nums[start] == nums[start + 1]) start++;
                while(start < end && nums[end] == nums[end - 1]) end--;
                start++;
                end--;
            }
        }
    }
}