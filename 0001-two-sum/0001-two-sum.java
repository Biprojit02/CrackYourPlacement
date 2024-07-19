class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int ans[] = new int[2];
        for(int i = 0; i<nums.length; i++){
            int number = nums[i];
            int remaining = target - number;
            if(map.containsKey(remaining)){
                ans[0] = i;
                ans[1] = map.get(remaining);
                return ans; 
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}