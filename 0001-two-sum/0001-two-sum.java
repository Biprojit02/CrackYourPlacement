class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        
        for(int i = 0; i<nums.length; i++){
            int num1 = nums[i];
            int num2 = target - num1;
            if(map.containsKey(num2)){
                ans[0] = i;
                ans[1] = map.get(num2);
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}