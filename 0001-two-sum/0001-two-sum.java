class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[2];
        for(int i = 0; i<nums.length; i++){
            int number = nums[i];
            int anumber = target - number;
            if(map.containsKey(anumber)){
                arr[0] = map.get(anumber);
                arr[1] = i;
                return arr;
            }
            map.put(nums[i], i);
        }
        return arr;
    }
}