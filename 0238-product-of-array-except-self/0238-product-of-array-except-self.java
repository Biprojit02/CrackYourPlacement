class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productWithoutZero = 1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                productWithoutZero *= nums[i];
            }
        }

        int countZero = 0;
        for(int n : nums){
            if(n == 0){
                countZero++;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                if(countZero > 0){
                    nums[i] = 0;
                }
                else{
                    nums[i] = productWithoutZero / nums[i];
                }
            }
            else{
                if(countZero > 1){
                    nums[i] = 0;
                }
                else{
                    nums[i] = productWithoutZero;
                }
            }
        }
        return nums;
    }
}