class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i = 0; i<nums.length; i++){
            int n1 = nums[i];
            int n2 = target - n1;
            if(map.containsKey(n2)){
                ans[0] = map.get(n2);
                ans[1] = i;
                return ans;
            } 
            map.put(nums[i], i);
        }
        return ans;
    }
}