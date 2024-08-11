class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        int idx = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < 0){
                idx = nums[i] * -1 -1;
            }
            else{
                idx = nums[i] -1;
            }

            if(nums[idx] > 0){
                nums[idx] = -nums[idx];
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}

/*
//BRUTE FORCE
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int i = 1; i<=nums.length; i++){
            if(!map.containsKey(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
*/