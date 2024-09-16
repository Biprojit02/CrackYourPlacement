class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productWithoutZero = 1;
        int count = 0;

        for(int i : nums){
            if(i == 0){
                continue;
            }
            else{
                productWithoutZero *= i;
            }
        }

        for(int zero : nums){
            if(zero == 0){
                count++;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                if(count > 0){
                    nums[i] = 0;
                }
                else{
                    nums[i] = productWithoutZero/nums[i];
                }
            }
            else{
                if(count > 1){
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