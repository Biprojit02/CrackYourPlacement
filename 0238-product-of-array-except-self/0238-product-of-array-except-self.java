class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; 
        int result[] = new int[n];
        result[0] = 1;

        for(int i = 1; i<n; i++){
            result[i] = nums[i-1] * result[i-1];
        }

        int rightProduct = 1;
        for(int i = n-1; i>=0; i--){
            result[i] = rightProduct * result[i];
            rightProduct *= nums[i];
        }

        return result;
    }
}

//Approach 2
/*
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; 
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        
        for(int i = 1; i<n; i++){
            left[i] = nums[i-1] * left[i-1];
        }

        for(int i = n-2; i>=0; i--){
            right[i] = nums[i+1] * right[i+1];
        }

        int result[] = new int[n];
        for(int i = 0; i<n; i++){
            result[i] = left[i] * right[i];
        }

        return result;
    }
}
*/

//Approach 1
/*
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
*/