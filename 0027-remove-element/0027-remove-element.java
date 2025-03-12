class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0; i<nums.length;){
            if(nums[i] == val){
                i++;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        return j;
    }
}