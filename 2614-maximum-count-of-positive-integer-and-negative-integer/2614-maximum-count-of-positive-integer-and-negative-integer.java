class Solution {
    public int maximumCount(int[] nums) {
        int n = bs(nums, 0);  // Count of negative numbers
        int p = nums.length - bs(nums, 1);  // Count of positive numbers
        return Math.max(p, n);
    }

    public int bs(int a[], int k) {
        int l = 0, h = a.length - 1;
        int ans = a.length;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (a[mid] >= k) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}