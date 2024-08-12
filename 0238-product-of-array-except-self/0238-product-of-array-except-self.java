class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;

        for(int i = 1; i<n; i++){
            result[i] = result[i-1] * nums[i - 1];
        }

        int right = 1;
        for(int i = n-1; i>=0; i--){
            result[i] = result[i] * right;
            right *= nums[i];
        }
        return result;
    }
}

/*
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

*/