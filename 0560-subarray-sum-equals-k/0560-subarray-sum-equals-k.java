class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int presum = 0; 
        int count = 0;
        map.put(0, 1);
        for(int i = 0; i<nums.length; i++){
            presum += nums[i];
            int remove = presum - k;
            if(map.containsKey(remove)){
                count += map.get(remove);
            }
            map.put(presum, map.getOrDefault(presum, 0) + 1);
        } 
        return count;
    }
}