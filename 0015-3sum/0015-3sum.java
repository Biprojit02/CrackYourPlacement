class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // int i = 0;
        if(nums.length < 3){
            return new ArrayList<>();
        }
        
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i<nums.length - 2; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            else{
                twoSum(nums, i+1, result, -nums[i]);
            }
        }
        return result;
    }
    public void twoSum(int[] nums, int k, List<List<Integer> >result, int target){
        int i = k;
        int j = nums.length - 1;

        while(i < j){
            if(nums[i] + nums[j] < target){
                i++;
            }
            else if(nums[i] + nums[j] > target){
                j--;
            }
            else{
                result.add(Arrays.asList(nums[i], nums[j], -target));

                while(i < j && nums[i] == nums[i + 1]){
                    i++;
                }

                while(i < j && nums[j] == nums[j - 1]){
                    j--;
                }
                i++;
                j--;
            }
        }
    }
}

