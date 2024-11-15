class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i  : nums){
            set.add(i); // 100, 4, 200, 1, 3, 2
        }

        int count = 0;
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
                int x = nums[i];
                count = 1;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
             max = Math.max(max, count);
            }
        }
        return max;
    }
}


// 1. HashSet 
// 2. + 
// length = 4

// 