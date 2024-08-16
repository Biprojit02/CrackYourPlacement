class Solution {
    public void nextPermutation(int[] nums) {
        int circle_index = -1;
        int n = nums.length;

        for(int i = n-1; i> 0; i--){
            if(nums[i] > nums[i-1]){
                circle_index = i-1;
                break;
            }
        }

        int swap_index = -1;

        if(circle_index != -1){
            for(int j = n-1; j>=circle_index; j--){
                if(nums[j] > nums[circle_index]){
                    swap_index = j;
                    break;
                }
            }
            swap(nums, circle_index, swap_index);
        }
        reverse(nums, circle_index+1, n-1);
    }

    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void reverse(int arr[], int start, int end){
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
