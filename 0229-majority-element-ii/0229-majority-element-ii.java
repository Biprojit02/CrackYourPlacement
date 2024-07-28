class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int i = 0; i<n; i++){
            if(map.get(nums[i]) > n/3){
                set.add(nums[i]);
            }
        }
        
        for(int val : set){
            list.add(val);
        }
        
        return list;
    }
}