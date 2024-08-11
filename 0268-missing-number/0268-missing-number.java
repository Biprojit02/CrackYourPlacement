class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        return (n * (n+1)/2) - sum;
    }
}
/*
class Solution {
    public int missingNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i = 0; i<=nums.length; i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
}
*/