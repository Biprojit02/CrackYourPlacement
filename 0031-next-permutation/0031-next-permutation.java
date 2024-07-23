class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int circle_index = -1;
        
        for(int i = n - 1; i>0; i--){
            if(nums[i] > nums[i-1]){
                circle_index = i-1;
                break;
            }
        }

        if(circle_index != -1){
            int swap_index = -1;
            for(int j = n-1; j>circle_index; j--){
                if(nums[j] > nums[circle_index]){
                    swap_index = j;
                    break;
                }
            }
            swap(nums, circle_index, swap_index);
        }
        reverse(nums, circle_index + 1, n-1);
    }

    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int nums[], int start, int end){
        while(start<end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}