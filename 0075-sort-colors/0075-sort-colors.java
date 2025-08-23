class Solution {
    public void sortColors(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
        int mid = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[mid] == 0){
                int swap = nums[mid];
                nums[mid] = nums[first];
                nums[first] = swap;
                first++;
                mid++;
            }
            else if(nums[mid] == 2){
                int swap = nums[mid];
                nums[mid] = nums[last];
                nums[last] = swap;
                last--;
            }
            else{
                mid++;
            }
        }
    }
}