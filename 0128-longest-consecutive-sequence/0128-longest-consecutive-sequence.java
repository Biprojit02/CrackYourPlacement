class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int count = 0;
        int longestSeq = 0;
        for(int num : nums){
            if(!set.contains(num - 1)){
                int x = num;
                count = 1;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longestSeq = Math.max(longestSeq, count);
            }
        }
        return longestSeq;
    }
}
