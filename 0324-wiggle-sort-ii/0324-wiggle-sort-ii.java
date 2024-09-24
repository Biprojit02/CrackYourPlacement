class Solution {
    public void wiggleSort(int[] nums) {
        int[] nums1 = nums.clone();
        Arrays.sort(nums1);

        int mid = (nums.length + 1)/2;
        int j = mid - 1;
        int k = nums.length - 1;

        for(int i = 0; i<nums.length; i++){
            if(i%2 == 0){
                nums[i] = nums1[j--];
            }
            else{
                nums[i] = nums1[k--];
            }
        }
    }
}