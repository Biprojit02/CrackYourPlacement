class Solution {
    public int[] productExceptSelf(int[] nums) {
        int productWithoutZero = 1;
        int countZero = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                continue;
            }
            else{
                productWithoutZero *= nums[i];
            }
        }

        for(int x : nums){
            if(x == 0){
                countZero++;
            }
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                if(countZero > 0){
                    nums[i] = 0;
                }
                else{
                    nums[i] = productWithoutZero/nums[i];
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
