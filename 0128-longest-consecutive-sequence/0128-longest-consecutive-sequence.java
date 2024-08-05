class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 1;
        int longestSeq = 0;

        for(int num : nums){
            set.add(num);
        }

        for(int num : nums){
            if(!set.contains(num - 1)){
                int x = num;
                count = 1;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
            }
            longestSeq = Math.max(count, longestSeq);
        }
        return longestSeq;
    }
}
