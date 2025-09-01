class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int firstNum = nums[i];
            int secondNum = target - firstNum;
            if(map.containsKey(secondNum)){
                ans[0] = i;
                ans[1] = map.get(secondNum);
                return ans;
            }
            map.put(firstNum, i);
        }
        return ans;
    }
}