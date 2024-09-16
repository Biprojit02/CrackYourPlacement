class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int longestSeq = 0;

        for(int x : nums){
            set.add(x);
        }

        for(int num : nums){
            if(!set.contains(num-1)){
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