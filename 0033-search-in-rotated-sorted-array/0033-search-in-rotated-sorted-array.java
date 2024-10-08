class Solution{
    public int search(int[] nums, int target){
        int n = nums.length;
        int left = 0; 
        int right = n - 1;
        int mid; 

        while(left <= right){
            mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] >= nums[left]){
                if(target <= nums[mid] && target >= nums[left]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if(target >= nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

//TWO PASS APPROACH
/*
class Solution {
    public int pivot(int[] nums, int n){
        int l = 0;
        int r = n - 1;
        while(l < r){
            int mid = l + (r - l)/2;
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return r;
    }

    public int binarySearch(int[] nums, int left, int right, int target){
        int idx = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                idx = mid;
                break;
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
       
        int pivot = pivot(nums, n);
        int idx = binarySearch(nums, 0 , pivot - 1, target);
        if(idx != -1){
            return idx;
        }

        idx = binarySearch(nums, pivot, n - 1, target);
        return idx;
    }
}
*/