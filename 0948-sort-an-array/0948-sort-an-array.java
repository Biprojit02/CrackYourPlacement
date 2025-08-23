class Solution {
    public int[] sortArray(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int i = 0;
        for(int num = min; num<=max; num++){
            while(map.getOrDefault(num, 0)>0){
                nums[i] = num;
                i++;
                map.put(num, map.get(num)-1);
            }
        }
        return nums;
    }
}