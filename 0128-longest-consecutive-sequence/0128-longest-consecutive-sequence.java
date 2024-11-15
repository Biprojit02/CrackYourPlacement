class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        int n = nums.length;
        int cnt = 1;
        int max = 0;
        for(int i = 1; i<n; i++){
            if(nums[i] != nums[i-1]){
                if(nums[i] == nums[i-1] + 1){
                cnt++;
                }
                else{
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            }
        }
        return Math.max(max, cnt);
    }
}