class Solution {
    public void wiggleSort(int[] nums) {
        int[] newNums = nums.clone();
        Arrays.sort(newNums);

        int mid = (newNums.length + 1)/2;
        int l = mid - 1;
        int r = newNums.length  - 1;

        for(int i = 0; i<nums.length; i++){
            if(i%2 == 0){
                nums[i] = newNums[l];
                l--;
            }
            else{
                nums[i] = newNums[r];
                r--;
            }
        }
    }
}