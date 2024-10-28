class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans  = new int[n];

        ans[0] = 1; 
        for(int i = 1; i<n; i++){
            ans[i] = ans[i-1] * nums[i - 1];
        }

        int right = 1;
        for(int i = n - 1; i>=0; i--){
            ans[i] = ans[i] * right;
            right *= nums[i];
        } 

        return ans;
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

        for(int zero : nums){
            if(zero == 0){
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