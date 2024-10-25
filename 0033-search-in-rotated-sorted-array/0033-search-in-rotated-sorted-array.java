//TWO PASS
class Solution {
    int idx = -1;
    public int pivot(int[] nums, int n){
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] >= nums[right]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return right;
    }

    public int binarySearch(int[] nums, int left, int right, int target){
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                idx = mid;
                return idx;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return idx;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int pivot = pivot(nums, n);
        binarySearch(nums, left, pivot - 1, target);
        if(idx != -1){
            return idx;
        }

        binarySearch(nums, pivot, right, target);
        return idx;
    }
}
